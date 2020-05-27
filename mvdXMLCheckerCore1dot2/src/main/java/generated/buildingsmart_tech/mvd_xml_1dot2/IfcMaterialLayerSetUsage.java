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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcMaterialLayerSetUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMaterialLayerSetUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterialUsageDefinition">
 *       &lt;sequence>
 *         &lt;element name="ForLayerSet" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterialLayerSet"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LayerSetDirection" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLayerSetDirectionEnum" />
 *       &lt;attribute name="DirectionSense" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDirectionSenseEnum" />
 *       &lt;attribute name="OffsetFromReferenceLine" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="ReferenceExtent" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMaterialLayerSetUsage", propOrder = {
    "forLayerSet"
})
public class IfcMaterialLayerSetUsage
    extends IfcMaterialUsageDefinition
{

    @XmlElement(name = "ForLayerSet", required = true, nillable = true)
    protected IfcMaterialLayerSet forLayerSet;
    @XmlAttribute(name = "LayerSetDirection")
    protected IfcLayerSetDirectionEnum layerSetDirection;
    @XmlAttribute(name = "DirectionSense")
    protected IfcDirectionSenseEnum directionSense;
    @XmlAttribute(name = "OffsetFromReferenceLine")
    protected Double offsetFromReferenceLine;
    @XmlAttribute(name = "ReferenceExtent")
    protected Double referenceExtent;

    /**
     * Gets the value of the forLayerSet property.
     * 
     * @return
     *     possible object is
     *     {@link IfcMaterialLayerSet }
     *     
     */
    public IfcMaterialLayerSet getForLayerSet() {
        return forLayerSet;
    }

    /**
     * Sets the value of the forLayerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcMaterialLayerSet }
     *     
     */
    public void setForLayerSet(IfcMaterialLayerSet value) {
        this.forLayerSet = value;
    }

    /**
     * Gets the value of the layerSetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link IfcLayerSetDirectionEnum }
     *     
     */
    public IfcLayerSetDirectionEnum getLayerSetDirection() {
        return layerSetDirection;
    }

    /**
     * Sets the value of the layerSetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcLayerSetDirectionEnum }
     *     
     */
    public void setLayerSetDirection(IfcLayerSetDirectionEnum value) {
        this.layerSetDirection = value;
    }

    /**
     * Gets the value of the directionSense property.
     * 
     * @return
     *     possible object is
     *     {@link IfcDirectionSenseEnum }
     *     
     */
    public IfcDirectionSenseEnum getDirectionSense() {
        return directionSense;
    }

    /**
     * Sets the value of the directionSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcDirectionSenseEnum }
     *     
     */
    public void setDirectionSense(IfcDirectionSenseEnum value) {
        this.directionSense = value;
    }

    /**
     * Gets the value of the offsetFromReferenceLine property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffsetFromReferenceLine() {
        return offsetFromReferenceLine;
    }

    /**
     * Sets the value of the offsetFromReferenceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetFromReferenceLine(Double value) {
        this.offsetFromReferenceLine = value;
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
