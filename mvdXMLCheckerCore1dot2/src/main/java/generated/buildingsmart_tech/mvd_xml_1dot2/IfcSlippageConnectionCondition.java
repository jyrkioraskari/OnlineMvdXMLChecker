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
 * <p>Java class for IfcSlippageConnectionCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSlippageConnectionCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcStructuralConnectionCondition">
 *       &lt;attribute name="SlippageX" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="SlippageY" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="SlippageZ" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSlippageConnectionCondition")
public class IfcSlippageConnectionCondition
    extends IfcStructuralConnectionCondition
{

    @XmlAttribute(name = "SlippageX")
    protected Double slippageX;
    @XmlAttribute(name = "SlippageY")
    protected Double slippageY;
    @XmlAttribute(name = "SlippageZ")
    protected Double slippageZ;

    /**
     * Gets the value of the slippageX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlippageX() {
        return slippageX;
    }

    /**
     * Sets the value of the slippageX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlippageX(Double value) {
        this.slippageX = value;
    }

    /**
     * Gets the value of the slippageY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlippageY() {
        return slippageY;
    }

    /**
     * Sets the value of the slippageY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlippageY(Double value) {
        this.slippageY = value;
    }

    /**
     * Gets the value of the slippageZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlippageZ() {
        return slippageZ;
    }

    /**
     * Sets the value of the slippageZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlippageZ(Double value) {
        this.slippageZ = value;
    }

}