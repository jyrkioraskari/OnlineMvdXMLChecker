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
 * <p>Java class for IfcEllipse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcEllipse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcConic">
 *       &lt;attribute name="SemiAxis1" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="SemiAxis2" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcEllipse")
public class IfcEllipse
    extends IfcConic
{

    @XmlAttribute(name = "SemiAxis1")
    protected Double semiAxis1;
    @XmlAttribute(name = "SemiAxis2")
    protected Double semiAxis2;

    /**
     * Gets the value of the semiAxis1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSemiAxis1() {
        return semiAxis1;
    }

    /**
     * Sets the value of the semiAxis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSemiAxis1(Double value) {
        this.semiAxis1 = value;
    }

    /**
     * Gets the value of the semiAxis2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSemiAxis2() {
        return semiAxis2;
    }

    /**
     * Sets the value of the semiAxis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSemiAxis2(Double value) {
        this.semiAxis2 = value;
    }

}
