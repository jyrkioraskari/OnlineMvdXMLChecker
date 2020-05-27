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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcTShapeProfileDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcTShapeProfileDef">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterizedProfileDef">
 *       &lt;attribute name="Depth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="FlangeWidth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="WebThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="FlangeThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="FilletRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="FlangeEdgeRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="WebEdgeRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="WebSlope" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlaneAngleMeasure" />
 *       &lt;attribute name="FlangeSlope" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlaneAngleMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcTShapeProfileDef")
public class IfcTShapeProfileDef
    extends IfcParameterizedProfileDef
{

    @XmlAttribute(name = "Depth")
    protected Double depth;
    @XmlAttribute(name = "FlangeWidth")
    protected Double flangeWidth;
    @XmlAttribute(name = "WebThickness")
    protected Double webThickness;
    @XmlAttribute(name = "FlangeThickness")
    protected Double flangeThickness;
    @XmlAttribute(name = "FilletRadius")
    protected Double filletRadius;
    @XmlAttribute(name = "FlangeEdgeRadius")
    protected Double flangeEdgeRadius;
    @XmlAttribute(name = "WebEdgeRadius")
    protected Double webEdgeRadius;
    @XmlAttribute(name = "WebSlope")
    protected Double webSlope;
    @XmlAttribute(name = "FlangeSlope")
    protected Double flangeSlope;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepth(Double value) {
        this.depth = value;
    }

    /**
     * Gets the value of the flangeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlangeWidth() {
        return flangeWidth;
    }

    /**
     * Sets the value of the flangeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlangeWidth(Double value) {
        this.flangeWidth = value;
    }

    /**
     * Gets the value of the webThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWebThickness() {
        return webThickness;
    }

    /**
     * Sets the value of the webThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWebThickness(Double value) {
        this.webThickness = value;
    }

    /**
     * Gets the value of the flangeThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlangeThickness() {
        return flangeThickness;
    }

    /**
     * Sets the value of the flangeThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlangeThickness(Double value) {
        this.flangeThickness = value;
    }

    /**
     * Gets the value of the filletRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFilletRadius() {
        return filletRadius;
    }

    /**
     * Sets the value of the filletRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFilletRadius(Double value) {
        this.filletRadius = value;
    }

    /**
     * Gets the value of the flangeEdgeRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlangeEdgeRadius() {
        return flangeEdgeRadius;
    }

    /**
     * Sets the value of the flangeEdgeRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlangeEdgeRadius(Double value) {
        this.flangeEdgeRadius = value;
    }

    /**
     * Gets the value of the webEdgeRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWebEdgeRadius() {
        return webEdgeRadius;
    }

    /**
     * Sets the value of the webEdgeRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWebEdgeRadius(Double value) {
        this.webEdgeRadius = value;
    }

    /**
     * Gets the value of the webSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWebSlope() {
        return webSlope;
    }

    /**
     * Sets the value of the webSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWebSlope(Double value) {
        this.webSlope = value;
    }

    /**
     * Gets the value of the flangeSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlangeSlope() {
        return flangeSlope;
    }

    /**
     * Sets the value of the flangeSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlangeSlope(Double value) {
        this.flangeSlope = value;
    }

}
