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
 * <p>Java class for IfcCurveStyleFontPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcCurveStyleFontPattern">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPresentationItem">
 *       &lt;attribute name="VisibleSegmentLength" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="InvisibleSegmentLength" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcCurveStyleFontPattern")
public class IfcCurveStyleFontPattern
    extends IfcPresentationItem
{

    @XmlAttribute(name = "VisibleSegmentLength")
    protected Double visibleSegmentLength;
    @XmlAttribute(name = "InvisibleSegmentLength")
    protected Double invisibleSegmentLength;

    /**
     * Gets the value of the visibleSegmentLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVisibleSegmentLength() {
        return visibleSegmentLength;
    }

    /**
     * Sets the value of the visibleSegmentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVisibleSegmentLength(Double value) {
        this.visibleSegmentLength = value;
    }

    /**
     * Gets the value of the invisibleSegmentLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvisibleSegmentLength() {
        return invisibleSegmentLength;
    }

    /**
     * Sets the value of the invisibleSegmentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvisibleSegmentLength(Double value) {
        this.invisibleSegmentLength = value;
    }

}