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
 * <p>Java class for IfcAsymmetricIShapeProfileDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcAsymmetricIShapeProfileDef">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterizedProfileDef">
 *       &lt;attribute name="BottomFlangeWidth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="OverallDepth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="WebThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="BottomFlangeThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="BottomFlangeFilletRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="TopFlangeWidth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="TopFlangeThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="TopFlangeFilletRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="BottomFlangeEdgeRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="BottomFlangeSlope" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlaneAngleMeasure" />
 *       &lt;attribute name="TopFlangeEdgeRadius" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNonNegativeLengthMeasure" />
 *       &lt;attribute name="TopFlangeSlope" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlaneAngleMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcAsymmetricIShapeProfileDef")
public class IfcAsymmetricIShapeProfileDef
    extends IfcParameterizedProfileDef
{

    @XmlAttribute(name = "BottomFlangeWidth")
    protected Double bottomFlangeWidth;
    @XmlAttribute(name = "OverallDepth")
    protected Double overallDepth;
    @XmlAttribute(name = "WebThickness")
    protected Double webThickness;
    @XmlAttribute(name = "BottomFlangeThickness")
    protected Double bottomFlangeThickness;
    @XmlAttribute(name = "BottomFlangeFilletRadius")
    protected Double bottomFlangeFilletRadius;
    @XmlAttribute(name = "TopFlangeWidth")
    protected Double topFlangeWidth;
    @XmlAttribute(name = "TopFlangeThickness")
    protected Double topFlangeThickness;
    @XmlAttribute(name = "TopFlangeFilletRadius")
    protected Double topFlangeFilletRadius;
    @XmlAttribute(name = "BottomFlangeEdgeRadius")
    protected Double bottomFlangeEdgeRadius;
    @XmlAttribute(name = "BottomFlangeSlope")
    protected Double bottomFlangeSlope;
    @XmlAttribute(name = "TopFlangeEdgeRadius")
    protected Double topFlangeEdgeRadius;
    @XmlAttribute(name = "TopFlangeSlope")
    protected Double topFlangeSlope;

    /**
     * Gets the value of the bottomFlangeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFlangeWidth() {
        return bottomFlangeWidth;
    }

    /**
     * Sets the value of the bottomFlangeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFlangeWidth(Double value) {
        this.bottomFlangeWidth = value;
    }

    /**
     * Gets the value of the overallDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverallDepth() {
        return overallDepth;
    }

    /**
     * Sets the value of the overallDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverallDepth(Double value) {
        this.overallDepth = value;
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
     * Gets the value of the bottomFlangeThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFlangeThickness() {
        return bottomFlangeThickness;
    }

    /**
     * Sets the value of the bottomFlangeThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFlangeThickness(Double value) {
        this.bottomFlangeThickness = value;
    }

    /**
     * Gets the value of the bottomFlangeFilletRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFlangeFilletRadius() {
        return bottomFlangeFilletRadius;
    }

    /**
     * Sets the value of the bottomFlangeFilletRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFlangeFilletRadius(Double value) {
        this.bottomFlangeFilletRadius = value;
    }

    /**
     * Gets the value of the topFlangeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFlangeWidth() {
        return topFlangeWidth;
    }

    /**
     * Sets the value of the topFlangeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFlangeWidth(Double value) {
        this.topFlangeWidth = value;
    }

    /**
     * Gets the value of the topFlangeThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFlangeThickness() {
        return topFlangeThickness;
    }

    /**
     * Sets the value of the topFlangeThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFlangeThickness(Double value) {
        this.topFlangeThickness = value;
    }

    /**
     * Gets the value of the topFlangeFilletRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFlangeFilletRadius() {
        return topFlangeFilletRadius;
    }

    /**
     * Sets the value of the topFlangeFilletRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFlangeFilletRadius(Double value) {
        this.topFlangeFilletRadius = value;
    }

    /**
     * Gets the value of the bottomFlangeEdgeRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFlangeEdgeRadius() {
        return bottomFlangeEdgeRadius;
    }

    /**
     * Sets the value of the bottomFlangeEdgeRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFlangeEdgeRadius(Double value) {
        this.bottomFlangeEdgeRadius = value;
    }

    /**
     * Gets the value of the bottomFlangeSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFlangeSlope() {
        return bottomFlangeSlope;
    }

    /**
     * Sets the value of the bottomFlangeSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFlangeSlope(Double value) {
        this.bottomFlangeSlope = value;
    }

    /**
     * Gets the value of the topFlangeEdgeRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFlangeEdgeRadius() {
        return topFlangeEdgeRadius;
    }

    /**
     * Sets the value of the topFlangeEdgeRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFlangeEdgeRadius(Double value) {
        this.topFlangeEdgeRadius = value;
    }

    /**
     * Gets the value of the topFlangeSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFlangeSlope() {
        return topFlangeSlope;
    }

    /**
     * Sets the value of the topFlangeSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFlangeSlope(Double value) {
        this.topFlangeSlope = value;
    }

}
