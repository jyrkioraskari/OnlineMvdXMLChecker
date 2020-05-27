//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.rwth_aachen.dc.mvd.mvdxml1dot2.AbstractRule;


/**
 * <p>Java class for EntityRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="References" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.2}GenericReference"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IdPrefix" type="{http://buildingsmart-tech.org/mvd/XML/1.2}ruleId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AttributeRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}AttributeRule"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Constraint">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EntityName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleID" type="{http://buildingsmart-tech.org/mvd/XML/1.2}ruleId" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRule", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", propOrder = {
    "references",
    "attributeRules",
    "constraints"
})
public class EntityRule extends AbstractRule{

    @XmlElement(name = "References")
    protected EntityRule.References references;
    @XmlElement(name = "AttributeRules")
    protected EntityRule.AttributeRules attributeRules;
    @XmlElement(name = "Constraints")
    protected EntityRule.Constraints constraints;
    @XmlAttribute(name = "EntityName", required = true)
    protected String entityName;
    @XmlAttribute(name = "RuleID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ruleID;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.References }
     *     
     */
    public EntityRule.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.References }
     *     
     */
    public void setReferences(EntityRule.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the attributeRules property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public EntityRule.AttributeRules getAttributeRules() {
        return attributeRules;
    }

    /**
     * Sets the value of the attributeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public void setAttributeRules(EntityRule.AttributeRules value) {
        this.attributeRules = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public EntityRule.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public void setConstraints(EntityRule.Constraints value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}AttributeRule"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attributeRule"
    })
    public static class AttributeRules {

        @XmlElement(name = "AttributeRule", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true, nillable = true)
        protected List<AttributeRule> attributeRule;

        /**
         * Gets the value of the attributeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeRule }
         * 
         * 
         */
        public List<AttributeRule> getAttributeRule() {
            if (attributeRule == null) {
                attributeRule = new ArrayList<AttributeRule>();
            }
            return this.attributeRule;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Constraint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "constraint"
    })
    public static class Constraints {

        @XmlElement(name = "Constraint", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true)
        protected List<EntityRule.Constraints.Constraint> constraint;

        /**
         * Gets the value of the constraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityRule.Constraints.Constraint }
         * 
         * 
         */
        public List<EntityRule.Constraints.Constraint> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<EntityRule.Constraints.Constraint>();
            }
            return this.constraint;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Constraint {

            @XmlAttribute(name = "Expression", required = true)
            protected String expression;

            /**
             * Gets the value of the expression property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Sets the value of the expression property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpression(String value) {
                this.expression = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.2}GenericReference"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IdPrefix" type="{http://buildingsmart-tech.org/mvd/XML/1.2}ruleId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "template"
    })
    public static class References {

        @XmlElement(name = "Template", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true)
        protected GenericReference template;
        @XmlAttribute(name = "IdPrefix")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String idPrefix;

        /**
         * Gets the value of the template property.
         * 
         * @return
         *     possible object is
         *     {@link GenericReference }
         *     
         */
        public GenericReference getTemplate() {
            return template;
        }

        /**
         * Sets the value of the template property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericReference }
         *     
         */
        public void setTemplate(GenericReference value) {
            this.template = value;
        }

        /**
         * Gets the value of the idPrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdPrefix() {
            return idPrefix;
        }

        /**
         * Sets the value of the idPrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdPrefix(String value) {
            this.idPrefix = value;
        }

    }

}
