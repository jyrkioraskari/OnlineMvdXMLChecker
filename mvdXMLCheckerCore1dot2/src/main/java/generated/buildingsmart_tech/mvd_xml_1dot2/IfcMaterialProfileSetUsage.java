//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcMaterialProfileSetUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMaterialProfileSetUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterialUsageDefinition">
 *       &lt;sequence>
 *         &lt;element name="ForProfileSet" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterialProfileSet"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CardinalPoint" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCardinalPointReference" />
 *       &lt;attribute name="ReferenceExtent" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMaterialProfileSetUsage", propOrder = {
    "forProfileSet"
})
@XmlSeeAlso({
    IfcMaterialProfileSetUsageTapering.class
})
public class IfcMaterialProfileSetUsage
    extends IfcMaterialUsageDefinition
{

    @XmlElement(name = "ForProfileSet", required = true, nillable = true)
    protected IfcMaterialProfileSet forProfileSet;
    @XmlAttribute(name = "CardinalPoint")
    protected Long cardinalPoint;
    @XmlAttribute(name = "ReferenceExtent")
    protected Double referenceExtent;

    /**
     * Gets the value of the forProfileSet property.
     * 
     * @return
     *     possible object is
     *     {@link IfcMaterialProfileSet }
     *     
     */
    public IfcMaterialProfileSet getForProfileSet() {
        return forProfileSet;
    }

    /**
     * Sets the value of the forProfileSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcMaterialProfileSet }
     *     
     */
    public void setForProfileSet(IfcMaterialProfileSet value) {
        this.forProfileSet = value;
    }

    /**
     * Gets the value of the cardinalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardinalPoint() {
        return cardinalPoint;
    }

    /**
     * Sets the value of the cardinalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardinalPoint(Long value) {
        this.cardinalPoint = value;
    }

    /**
     * Gets the value of the referenceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReferenceExtent() {
        return referenceExtent;
    }

    /**
     * Sets the value of the referenceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReferenceExtent(Double value) {
        this.referenceExtent = value;
    }

}
