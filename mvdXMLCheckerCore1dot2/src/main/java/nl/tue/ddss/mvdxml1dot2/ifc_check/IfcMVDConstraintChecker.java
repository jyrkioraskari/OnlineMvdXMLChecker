package nl.tue.ddss.mvdxml1dot2.ifc_check;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.eclipse.emf.common.util.Enumerator;

import de.rwth_aachen.dc.ifc.IfcModelInstance.IfcVersion;
import de.rwth_aachen.dc.mvd.IssueReport;
import de.rwth_aachen.dc.mvd.events.CheckerBreakEvent;
import de.rwth_aachen.dc.mvd.events.CheckerErrorEvent;
import de.rwth_aachen.dc.mvd.events.CheckerInfoEvent;
import de.rwth_aachen.dc.mvd.events.CheckerNotificationEvent;
import de.rwth_aachen.dc.mvd.events.CheckerShortNotificationEvent;
import de.rwth_aachen.dc.mvd.mvdxml1dot2.AbstractRule;
import de.rwth_aachen.dc.mvd.mvdxml1dot2.checker.MVDConceptConstraint;
import fi.aalto.drumbeat.DrumbeatUserManager.events.EventBusCommunication;
import generated.buildingsmart_tech.mvd_xml_1dot2.AttributeRule;
import generated.buildingsmart_tech.mvd_xml_1dot2.Definitions;
import generated.buildingsmart_tech.mvd_xml_1dot2.Definitions.Definition;
import generated.buildingsmart_tech.mvd_xml_1dot2.EntityRule;
import generated.buildingsmart_tech.mvd_xml_1dot2.TemplateRule;
import generated.mvdxml1dot2.rule_operators.MvdXMLv1_1Lexer;
import generated.mvdxml1dot2.rule_operators.MvdXMLv1_1Parser;
import nl.tue.ddss.mvdxml1dot2.ifc_check.IfcHashMapBuilder.ObjectToValue;

/*
 * Modified by J0 2020
 */

public class IfcMVDConstraintChecker {
    private final EventBusCommunication communication = EventBusCommunication.getInstance();
    private final List<MVDConceptConstraint> constraints;

    private IfcVersion ifcversion;

    public IfcMVDConstraintChecker(List<MVDConceptConstraint> constraints, IfcVersion ifcversion) throws DeserializeException, IOException, URISyntaxException {
	this.constraints = constraints;
	this.ifcversion = ifcversion;
    }

    public IssueReport checkModel(IfcModelInterface ifcModel, File ifcfile) throws RenderEngineException, DeserializeException, IOException {
	IssueReport issuereport = new IssueReport(ifcModel, ifcfile);

	switch (this.ifcversion) {
	case IFC2x3:
	    communication.post(new CheckerInfoEvent("IFC Version", "IFC2x3"));
	    break;
	case IFC4:
	    communication.post(new CheckerInfoEvent("IFC Version", "IFC4"));
	    break;
	default:
	    communication.post(new CheckerInfoEvent("IFC Version", "Unsupported"));
	    issuereport.addIssue("Unsupported IFC version");
	    return issuereport;
	}
	communication.post(new CheckerInfoEvent("Checking against", "mvdXML 1.2 <P>"));

	for (MVDConceptConstraint constraint : constraints) {
	    if (constraint == null) {
		communication.post(new CheckerNotificationEvent("Constraint was null <P>"));
		issuereport.addIssue( "Constraint was null");
		continue;
	    }
	    if(constraint.getConcept()!=null && constraint.getConcept().getUuid()!=null )
	    {
	       communication.post(new CheckerBreakEvent());
	       communication.post(new CheckerNotificationEvent("<P>CONCEPT: "+constraint.getConcept().getUuid()));
	    }

	    communication.post(new CheckerNotificationEvent("Applicability Operator: "+constraint.getApplicability_operator()));
	    for (TemplateRule applicability_templateRule : constraint.getApplicability_templateRules()) {
		communication.post(new CheckerNotificationEvent("Applicability rule: "+applicability_templateRule.getParameters()));
  	    }
	    
	    communication.post(new CheckerNotificationEvent("Concept acceptance Operator: "+constraint.getConcept_operator()));
	    for (TemplateRule templateRule : constraint.getConcept_templateRules()) {
		communication.post(new CheckerNotificationEvent("Concept rule: "+templateRule.getParameters()));
	    }

	    
	    List<AttributeRule> applicability_attributeRules = constraint.getApplicability_attributeRules();
	    List<AttributeRule> concept_attributeRules = constraint.getConcept_attributeRules();
	    try {
		Class cls = null;
		switch (this.ifcversion) {
		case IFC2x3:
		    cls = Class.forName("org.bimserver.models.ifc2x3tc1." + constraint.getConceptRoot().getApplicableRootEntity());
		    break;
		case IFC4:
		    cls = Class.forName("org.bimserver.models.ifc4." + constraint.getConceptRoot().getApplicableRootEntity());
		    break;
		default:
		}

		List<Object> allClassInstances = ifcModel.getAllWithSubTypes(cls);

		if (allClassInstances.size() == 0) {
		    issuereport.addIssue("No " + cls.getCanonicalName() + " element in the model");
		    communication.post(new CheckerErrorEvent(cls.getCanonicalName(), "No " + cls.getCanonicalName() + " element in the model"));
		}

		for (Object ifcObject : allClassInstances) {
			if (this.ifcversion == ifcversion.IFC2x3)
			    communication.post(new CheckerNotificationEvent("<B>Element " + ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + "</B> of class "+ifcObject.getClass().getSimpleName()));
			else if (this.ifcversion == ifcversion.IFC4)
			    communication.post(new CheckerNotificationEvent("<B>Element " + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + "</B> of class "+ifcObject.getClass().getSimpleName()));


		    IfcHashMapBuilder applicability_ifcHashMapBuilder = new IfcHashMapBuilder(ifcObject, applicability_attributeRules, this.ifcversion);
		    List<HashMap<AbstractRule, ObjectToValue>> applicability_hashMaps = applicability_ifcHashMapBuilder.getHashMaps();

		    IfcHashMapBuilder concept_ifcHashMapBuilder = new IfcHashMapBuilder(ifcObject, concept_attributeRules, this.ifcversion);
		    List<HashMap<AbstractRule, ObjectToValue>> concept_hashMaps = concept_ifcHashMapBuilder.getHashMaps();

		    String comment = new String();
		    for (HashMap<AbstractRule, ObjectToValue> hashMap : concept_hashMaps)
			comment = templateLevelRuleCheck(hashMap);

		    //
                    int ai=0;
		    if (applicability_attributeRules != null) {
			boolean applicable = false;
			if (constraint.getApplicability_operator() != null)
			    if (constraint.getApplicability_operator().toLowerCase().trim().equals("or")) {
				for (TemplateRule applicability_templateRule : constraint.getApplicability_templateRules()) {
				    for (int i = 0; i < applicability_hashMaps.size(); i++) {				
					communication.post(new CheckerNotificationEvent("<BR>Tested applicability value set: " + ai++ + ""));
					Boolean result = conceptLevelRuleCheck(applicability_templateRule.getParameters(), applicability_hashMaps.get(i));
					if (result == null)
					    continue;
					if (result == true) {
					    applicable = true;
					    communication.post(new CheckerNotificationEvent("   <BR>Test passed"));
					    break;
					}
				    }
				}

			    } else {
				applicable = true;
				for (TemplateRule applicability_templateRule : constraint.getApplicability_templateRules()) {
				    boolean template_validity = false;
				    for (int i = 0; i < applicability_hashMaps.size(); i++) {
					communication.post(new CheckerNotificationEvent("<BR>Tested applicability value set: " + ai++ + ""));
					Boolean result = conceptLevelRuleCheck(applicability_templateRule.getParameters(), applicability_hashMaps.get(i));
					if (result == null)
					    continue;
					if (result == true) {
					    template_validity = true;
					    communication.post(new CheckerNotificationEvent("   <BR>Test passed"));
					    break;
					}
				    }
				    if (!template_validity) {
					applicable = false;
				    }

				}
			    }
			if (!applicable) {
			    if (this.ifcversion == ifcversion.IFC2x3)
				communication.post(new CheckerNotificationEvent("<B>" + ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + " is not applicable.</B>"));
			    else if (this.ifcversion == ifcversion.IFC4)
				communication.post(new CheckerNotificationEvent("<B>" + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + " is not applicable.</B>"));

			   /*if (applicability_hashMaps.size() > 0) {
				communication.post(new CheckerNotificationEvent("<B>Values were:</B>"));
				int i = 1;
				for (HashMap<AbstractRule, ObjectToValue> hashMap : applicability_hashMaps) {
				    communication.post(new CheckerNotificationEvent("<BR>Set: " + i++ + ""));
				    showParameterValue(hashMap);
				}
			    } else
				communication.post(new CheckerNotificationEvent("<B>No applicability values.</B>"));
			    */
			    continue; // No check since not applicable
			}
			else
			{
			    if (this.ifcversion == ifcversion.IFC2x3)
				communication.post(new CheckerNotificationEvent("<B>" + ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + " is applicable.</B>"));
			    else if (this.ifcversion == ifcversion.IFC4)
				communication.post(new CheckerNotificationEvent("<B>" + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + " is applicable.</B>"));
			}
		    }
		    //

		    boolean valid = false;
		    int ci=0;
		    if (constraint.getConcept_operator() != null)
			if (constraint.getConcept_operator().toLowerCase().trim().equals("or")) {
			    for (TemplateRule templateRule : constraint.getConcept_templateRules()) {
				for (int i = 0; i < concept_hashMaps.size(); i++) {
				    communication.post(new CheckerNotificationEvent("<p style=\"margin-left:10%;\"><BR>Concept value set: " + ai++));
				    Boolean result = conceptLevelRuleCheck(templateRule.getParameters(), concept_hashMaps.get(i));
				    if (result == null)
					continue;
				    if (result == true) {
					valid = true;
					communication.post(new CheckerNotificationEvent("   <BR>Test value set accepted,"));
					break;
				    }
				    communication.post(new CheckerShortNotificationEvent("</p>"));
				}
			    }
			    if (!valid) {
				comment = comment + "\n This Object has to fulfil one of the template requirements. ";
				for (TemplateRule templateRule : constraint.getConcept_templateRules()) {
				    boolean template_validity = false;
				    for (int i = 0; i < concept_hashMaps.size(); i++) {
					communication.post(new CheckerNotificationEvent("<p style=\"margin-left:10%;\"><BR>Concept value set: " + ai++));
					Boolean result = conceptLevelRuleCheck(templateRule.getParameters(), concept_hashMaps.get(i));
					if (result == null)
					    continue;
					if (result == true) {
					    template_validity = true;
					    break;
					}
				    }
				    if (!template_validity)
					comment = comment + "\n It does not fulfil the  requirements of " + templateRule.getParameters();
				    communication.post(new CheckerShortNotificationEvent("</p>"));
				}
			    }
			} else {
			    valid = true;
			    for (TemplateRule templateRule : constraint.getConcept_templateRules()) {
				boolean template_validity = false;
				for (int i = 0; i < concept_hashMaps.size(); i++) {
				    communication.post(new CheckerNotificationEvent("<p style=\"margin-left:10%;\"><BR>Concept value set: " + ai++));
				    Boolean result = conceptLevelRuleCheck(templateRule.getParameters(), concept_hashMaps.get(i));
				    if (result == null)
					continue;
				    if (result == true) {
					template_validity = true;
					communication.post(new CheckerNotificationEvent("   <BR>Test value set accepted,"));
					break;
				    }
				    communication.post(new CheckerShortNotificationEvent("</p>"));
				}
				if (!template_validity) {
				    comment = comment + "\n This Object has to fulfil the requirements of " + templateRule.getParameters();
				    valid = false;
				}
			    }
			}

		    if (comment.length() > 0) {
			if (this.ifcversion == ifcversion.IFC2x3)
			    communication.post(new CheckerNotificationEvent("<P>RESULT: <B>" + ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + " has issues</B>"));
			else if (this.ifcversion == ifcversion.IFC4)
			    communication.post(new CheckerNotificationEvent("<P>RESULT: <B>" + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + " has issues</B>"));
		    } else {
			if (this.ifcversion == ifcversion.IFC2x3)
			{
			    communication.post(new CheckerNotificationEvent("<P>RESULT: <B>" + ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + " is fine</B>"));
			    issuereport.addGeneralComment(((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + " is fine");
			}
			else if (this.ifcversion == ifcversion.IFC4)
			{
			    communication.post(new CheckerNotificationEvent("<P>RESULT:  <B>" + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + " is fine</B>"));
			    issuereport.addGeneralComment(((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + " is fine");
			}
		    }

		    if (comment.length() > 0) {
			

			Definitions definitions = constraint.getConcept().getDefinitions();
			if (definitions != null) {
			    List<Definition> definitionList = definitions.getDefinition();
			    for (Definition definition : definitionList)
				comment = comment + "\n" + definition.getBody().getValue();
			}
			String type = ifcObject.getClass().getSimpleName();
			type = type.substring(0, type.length() - 4);

			comment+=" IFC class of the elemet: "+ifcObject.getClass().getSimpleName();

			switch (this.ifcversion) {
			case IFC2x3:
			    if (ifcObject instanceof org.bimserver.models.ifc2x3tc1.IfcProduct) {
				String spatialStructureElement = new String();
				if (ifcObject instanceof org.bimserver.models.ifc2x3tc1.IfcElement)
				    spatialStructureElement = getIfcSpatialStructure((org.bimserver.models.ifc2x3tc1.IfcElement) ifcObject);
				List<String> componantGuids = new LinkedList<String>();
				componantGuids = getComponantGuids(componantGuids, (org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject);
				issuereport.addIssue(constraint.getConcept().getUuid(),spatialStructureElement, ((org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject), ((org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject).getGlobalId() + "\n" + comment);
				communication.post(new CheckerInfoEvent("<B>IfcProduct IfcProduct issue</B><BR> guid=" + ((org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject).getGlobalId(), "<BR>" + comment));
			    } else {
				issuereport.addIssue(constraint.getConcept().getUuid(),null, (org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject, ((org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject).getGlobalId() + "\n" + comment);
				communication.post(new CheckerInfoEvent("<B>Other than issue</B><BR> guid=" + ((org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject).getGlobalId(), "<BR>" + comment));
			    }
			    break;
			case IFC4:

			    if (ifcObject instanceof org.bimserver.models.ifc4.IfcProduct) {
				String spatialStructureElement = new String();
				if (ifcObject instanceof org.bimserver.models.ifc4.IfcElement)
				    spatialStructureElement = getIfcSpatialStructure((org.bimserver.models.ifc4.IfcElement) ifcObject);
				List<String> componantGuids = new LinkedList<String>();
				componantGuids = getComponantGuids(componantGuids, (org.bimserver.models.ifc4.IfcProduct) ifcObject);
				issuereport.addIssue(constraint.getConcept().getUuid(),spatialStructureElement, ((org.bimserver.models.ifc4.IfcProduct) ifcObject), ((org.bimserver.models.ifc4.IfcProduct) ifcObject).getGlobalId() + "\n" + comment);
				communication.post(new CheckerInfoEvent("<B>IfcProduct issue</B><BR> guid=" + ((org.bimserver.models.ifc4.IfcProduct) ifcObject).getGlobalId(), "<BR>" + comment));
			    } else {
				issuereport.addIssue(constraint.getConcept().getUuid(),null, (org.bimserver.models.ifc4.IfcRoot) ifcObject, ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId() + "\n" + comment);
				communication.post(new CheckerInfoEvent("<B>Other than IfcProduct issue</B><BR> guid=" + ((org.bimserver.models.ifc4.IfcRoot) ifcObject).getGlobalId(), "<BR>" + comment));
			    }
			    break;
			default:
			    communication.post(new CheckerNotificationEvent("Unsupported IFC version"));
			    throw new RuntimeException("Unsupported IFC version");
			}
		    }
		    else
		    {
			switch (this.ifcversion) {
			case IFC2x3:
			    if (ifcObject instanceof org.bimserver.models.ifc2x3tc1.IfcProduct) {
				String spatialStructureElement = new String();
				if (ifcObject instanceof org.bimserver.models.ifc2x3tc1.IfcElement)
				    spatialStructureElement = getIfcSpatialStructure((org.bimserver.models.ifc2x3tc1.IfcElement) ifcObject);
				List<String> componantGuids = new LinkedList<String>();
				componantGuids = getComponantGuids(componantGuids, (org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject);
				issuereport.addPassedElementResult(constraint.getConcept().getUuid(),spatialStructureElement, ((org.bimserver.models.ifc2x3tc1.IfcProduct) ifcObject));
			    } else {
				issuereport.addPassedElementResult(constraint.getConcept().getUuid(),null, (org.bimserver.models.ifc2x3tc1.IfcRoot) ifcObject);
			    }
			    break;
			case IFC4:

			    if (ifcObject instanceof org.bimserver.models.ifc4.IfcProduct) {
				String spatialStructureElement = new String();
				if (ifcObject instanceof org.bimserver.models.ifc4.IfcElement)
				    spatialStructureElement = getIfcSpatialStructure((org.bimserver.models.ifc4.IfcElement) ifcObject);
				List<String> componantGuids = new LinkedList<String>();
				componantGuids = getComponantGuids(componantGuids, (org.bimserver.models.ifc4.IfcProduct) ifcObject);
				issuereport.addPassedElementResult(constraint.getConcept().getUuid(),spatialStructureElement, ((org.bimserver.models.ifc4.IfcProduct) ifcObject));
			    } else {
				issuereport.addPassedElementResult(constraint.getConcept().getUuid(),null, (org.bimserver.models.ifc4.IfcRoot) ifcObject);
			    }
			    break;
			default:
			    communication.post(new CheckerNotificationEvent("Unsupported IFC version"));
			    throw new RuntimeException("Unsupported IFC version");
			}
		    }
		    /*
		    if (concept_hashMaps.size() > 0) {
			communication.post(new CheckerNotificationEvent("<B>Values were:</B>"));
			int i = 1;
			for (HashMap<AbstractRule, ObjectToValue> hashMap : concept_hashMaps) {
			    communication.post(new CheckerNotificationEvent("<BR>Set: " + i++ + ""));
			    showParameterValue(hashMap);
			}
		    } else
			communication.post(new CheckerNotificationEvent("<B>No concept values.</B>"));
//		    */

		}
	    } catch (ClassNotFoundException e) {
		communication.post(new CheckerErrorEvent(this.getClass().getName(), e.getMessage()));
		e.printStackTrace();
	    }
	}
	return issuereport;

    }

    private void showParameterValue(HashMap<AbstractRule, ObjectToValue> hashMap) {

	for (AbstractRule rule : hashMap.keySet()) {
	    Object paramValue;
	    Object value = hashMap.get(rule).value;
	    if (rule.getRuleID() == null)
		continue;
	    if (value == null)
		continue;
	    if (value instanceof Collection)
		paramValue = value;
	    else if (value instanceof Double || value instanceof String)
		paramValue = value;
	    else if (value instanceof Enumerator)
		paramValue = ((Enumerator) value).getLiteral();
	    else if (value instanceof org.bimserver.models.ifc2x3tc1.impl.IfcLabelImpl)
		paramValue = ((org.bimserver.models.ifc2x3tc1.impl.IfcLabelImpl) value).getWrappedValue().toString();
	    else if (value instanceof org.bimserver.models.ifc4.impl.IfcLabelImpl)
		paramValue = ((org.bimserver.models.ifc4.impl.IfcLabelImpl) value).getWrappedValue().toString();

	    else if (value instanceof org.bimserver.models.ifc2x3tc1.impl.IfcRealImpl)
		paramValue = ((org.bimserver.models.ifc2x3tc1.impl.IfcRealImpl) value).getWrappedValue();
	    else if (value instanceof org.bimserver.models.ifc4.impl.IfcRealImpl)
		paramValue = ((org.bimserver.models.ifc4.impl.IfcRealImpl) value).getWrappedValue();

	    else if (value instanceof org.bimserver.models.ifc2x3tc1.impl.IfcBooleanImpl)
		paramValue = ((org.bimserver.models.ifc2x3tc1.impl.IfcBooleanImpl) value).getWrappedValue().toString();
	    else if (value instanceof org.bimserver.models.ifc4.impl.IfcBooleanImpl)
		paramValue = ((org.bimserver.models.ifc4.impl.IfcBooleanImpl) value).getWrappedValue().toString();
	    else if (value instanceof org.bimserver.models.ifc4.impl.IfcTextImpl)
		paramValue = ((org.bimserver.models.ifc4.impl.IfcTextImpl) value).getWrappedValue().toString();
	    else if (value instanceof org.bimserver.models.ifc2x3tc1.impl.IfcTextImpl)
		paramValue = ((org.bimserver.models.ifc2x3tc1.impl.IfcTextImpl) value).getWrappedValue().toString();

	    else if (value instanceof IdEObject)
		paramValue = value;
	    else
		paramValue = value;
	    communication.post(new CheckerInfoEvent(">> " + rule.getRuleID(), "" + paramValue));
	}

    }

    private String getIfcSpatialStructure(org.bimserver.models.ifc2x3tc1.IfcElement ifcObject) {
	String guid = new String();
	List<org.bimserver.models.ifc2x3tc1.IfcRelContainedInSpatialStructure> ircsisss = ifcObject.getContainedInStructure();
	if (ircsisss != null && ircsisss.size() == 1) {
	    org.bimserver.models.ifc2x3tc1.IfcSpatialStructureElement isse = ircsisss.get(0).getRelatingStructure();
	    guid = isse.getGlobalId();
	}
	return guid;
    }

    private String getIfcSpatialStructure(org.bimserver.models.ifc4.IfcElement ifcObject) {
	String guid = new String();
	List<org.bimserver.models.ifc4.IfcRelContainedInSpatialStructure> ircsisss = ifcObject.getContainedInStructure();
	if (ircsisss != null && ircsisss.size() == 1) {
	    org.bimserver.models.ifc4.IfcSpatialStructureElement isse = (org.bimserver.models.ifc4.IfcSpatialStructureElement) ircsisss.get(0).getRelatingStructure();
	    guid = isse.getGlobalId();
	}
	return guid;
    }

    private List<String> getComponantGuids(List<String> guids, org.bimserver.models.ifc2x3tc1.IfcObjectDefinition ifcObject) {
	if (ifcObject.getIsDecomposedBy().size() >= 1) {
	    List<org.bimserver.models.ifc2x3tc1.IfcRelDecomposes> irds = ifcObject.getIsDecomposedBy();
	    for (org.bimserver.models.ifc2x3tc1.IfcRelDecomposes ird : irds) {
		List<org.bimserver.models.ifc2x3tc1.IfcObjectDefinition> ifcObjects = ird.getRelatedObjects();
		for (org.bimserver.models.ifc2x3tc1.IfcObjectDefinition io : ifcObjects)
		    getComponantGuids(guids, io);
	    }
	} else
	    guids.add(ifcObject.getGlobalId());
	return guids;
    }

    private List<String> getComponantGuids(List<String> guids, org.bimserver.models.ifc4.IfcObjectDefinition ifcObject) {
	if (ifcObject.getIsDecomposedBy().size() >= 1) {
	    List<org.bimserver.models.ifc4.IfcRelAggregates> irds = ifcObject.getIsDecomposedBy();
	    for (org.bimserver.models.ifc4.IfcRelAggregates ird : irds) {
		List<org.bimserver.models.ifc4.IfcObjectDefinition> ifcObjects = ird.getRelatedObjects();
		for (org.bimserver.models.ifc4.IfcObjectDefinition io : ifcObjects)
		    getComponantGuids(guids, io);
	    }
	} else
	    guids.add(ifcObject.getGlobalId());
	return guids;
    }

    @SuppressWarnings("rawtypes")
    private String templateLevelRuleCheck(HashMap<AbstractRule, ObjectToValue> hashMap) {
	String report = new String();
	// No effect, since the cardinality check is not valid anymore in the 1.1
	// version of the specification
	Set<AbstractRule> rules = hashMap.keySet();
	for (AbstractRule rule : rules) {
	    ObjectToValue objectToValue = hashMap.get(rule);
	    // Object ifcObject = objectToValue.getIfcObject();
	    Object value = objectToValue.getValue();
	    List<Object> valueList = new ArrayList<Object>();
	    if (value == null) {
		valueList = null;
	    } else if (value instanceof Collection && value != null) {
		for (Object object : ((Collection) value)) {
		    valueList.add(object);
		}
	    } else {
		valueList.add(value);
	    }

	}
	return report;
    }

    private Boolean conceptLevelRuleCheck(String rule, HashMap<AbstractRule, ObjectToValue> hashMap) {
	rule = filterCharacters(rule);
	Boolean result = false;
	CharStream charStream = new ANTLRStringStream(rule);
	MvdXMLv1_1Lexer lexer = new MvdXMLv1_1Lexer(charStream);
	TokenStream tokenStream = new CommonTokenStream(lexer);
	MvdXMLv1_1Parser parser = new MvdXMLv1_1Parser(tokenStream, hashMap);
	try {
	    result = parser.expression();
	} catch (RecognitionException e) {
	    communication.post(new CheckerErrorEvent(this.getClass().getName(), e.getMessage()));
	    e.printStackTrace();
	}
	return result;
    }

    private String filterCharacters(String rule) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < rule.length(); i++) {
	    char ch = rule.charAt(i);
	    if (ch != ';')
		sb.append(ch);
	}
	return sb.toString().trim();
    }

    @SuppressWarnings({ "rawtypes", "unused" })
    private List<Boolean> entityTypeCheck(List<EntityRule> entityRules, List<Object> valueList) {
	List<Boolean> result = new ArrayList<Boolean>();
	List<Class> entityTypes = new ArrayList<Class>();
	for (EntityRule entityRule : entityRules) {
	    try {
		Class cls = null;
		switch (this.ifcversion) {
		case IFC2x3:
		    cls = Class.forName("org.bimserver.models.ifc2x3tc1." + entityRule.getEntityName());
		    break;
		case IFC4:
		    cls = Class.forName("org.bimserver.models.ifc4." + entityRule.getEntityName());
		    break;
		default:
		    throw new RuntimeException("Unsupported IFC type");
		}
		entityTypes.add(cls);
	    } catch (ClassNotFoundException e) {
		communication.post(new CheckerErrorEvent(this.getClass().getName(), e.getMessage()));
		e.printStackTrace();
	    }
	}

	for (int i = 0; i < valueList.size(); i++) {
	    Object value = valueList.get(i);
	    if (value == null) {
		result.add(true);
	    }
	    if (value instanceof Collection) {
		List<Boolean> cTypeCheckResult = new ArrayList<Boolean>();
		for (Object obj : (Collection) value) {
		    for (int j = 0; j < entityTypes.size(); j++) {
			if (entityTypes.get(j).isInstance(value)) {
			    cTypeCheckResult.add(true);
			    break;
			} else if (j == entityTypes.size() - 1)
			    cTypeCheckResult.add(false);
		    }
		}
		for (int j = 0; j < cTypeCheckResult.size(); j++) {
		    if (cTypeCheckResult.get(j) == false) {
			result.add(false);
			break;
		    } else if (cTypeCheckResult.get(j) == true && j == cTypeCheckResult.size() - 1)
			result.add(true);
		}
	    } else {
		for (int j = 0; j < entityTypes.size(); j++) {
		    if (entityTypes.get(j).isInstance(value)) {
			result.add(true);
			break;
		    } else if (j == entityTypes.size() - 1)
			result.add(false);

		}
	    }
	}
	return result;
    }

}
