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
 * <p>Java class for IfcBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcBlock">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCsgPrimitive3D">
 *       &lt;attribute name="XLength" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="YLength" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="ZLength" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcBlock")
public class IfcBlock
    extends IfcCsgPrimitive3D
{

    @XmlAttribute(name = "XLength")
    protected Double xLength;
    @XmlAttribute(name = "YLength")
    protected Double yLength;
    @XmlAttribute(name = "ZLength")
    protected Double zLength;

    /**
     * Gets the value of the xLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXLength() {
        return xLength;
    }

    /**
     * Sets the value of the xLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXLength(Double value) {
        this.xLength = value;
    }

    /**
     * Gets the value of the yLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYLength() {
        return yLength;
    }

    /**
     * Sets the value of the yLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYLength(Double value) {
        this.yLength = value;
    }

    /**
     * Gets the value of the zLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZLength() {
        return zLength;
    }

    /**
     * Sets the value of the zLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZLength(Double value) {
        this.zLength = value;
    }

}