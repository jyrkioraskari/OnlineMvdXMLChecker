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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcRectangleProfileDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRectangleProfileDef">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterizedProfileDef">
 *       &lt;attribute name="XDim" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="YDim" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRectangleProfileDef")
@XmlSeeAlso({
    IfcRectangleHollowProfileDef.class,
    IfcRoundedRectangleProfileDef.class
})
public class IfcRectangleProfileDef
    extends IfcParameterizedProfileDef
{

    @XmlAttribute(name = "XDim")
    protected Double xDim;
    @XmlAttribute(name = "YDim")
    protected Double yDim;

    /**
     * Gets the value of the xDim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXDim() {
        return xDim;
    }

    /**
     * Sets the value of the xDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXDim(Double value) {
        this.xDim = value;
    }

    /**
     * Gets the value of the yDim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYDim() {
        return yDim;
    }

    /**
     * Sets the value of the yDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYDim(Double value) {
        this.yDim = value;
    }

}
