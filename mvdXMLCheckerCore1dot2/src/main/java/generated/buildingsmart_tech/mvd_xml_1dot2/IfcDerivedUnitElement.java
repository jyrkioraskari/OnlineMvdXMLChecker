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
 * <p>Java class for IfcDerivedUnitElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcDerivedUnitElement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNamedUnit"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Exponent" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcDerivedUnitElement", propOrder = {
    "unit"
})
public class IfcDerivedUnitElement
    extends Entity
{

    @XmlElement(name = "Unit", required = true, nillable = true)
    protected IfcNamedUnit unit;
    @XmlAttribute(name = "Exponent")
    protected Long exponent;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link IfcNamedUnit }
     *     
     */
    public IfcNamedUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcNamedUnit }
     *     
     */
    public void setUnit(IfcNamedUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExponent(Long value) {
        this.exponent = value;
    }

}