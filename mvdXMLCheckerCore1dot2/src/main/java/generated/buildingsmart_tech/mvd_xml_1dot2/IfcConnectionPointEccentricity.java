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
 * <p>Java class for IfcConnectionPointEccentricity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcConnectionPointEccentricity">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcConnectionPointGeometry">
 *       &lt;attribute name="EccentricityInX" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="EccentricityInY" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="EccentricityInZ" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcConnectionPointEccentricity")
public class IfcConnectionPointEccentricity
    extends IfcConnectionPointGeometry
{

    @XmlAttribute(name = "EccentricityInX")
    protected Double eccentricityInX;
    @XmlAttribute(name = "EccentricityInY")
    protected Double eccentricityInY;
    @XmlAttribute(name = "EccentricityInZ")
    protected Double eccentricityInZ;

    /**
     * Gets the value of the eccentricityInX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEccentricityInX() {
        return eccentricityInX;
    }

    /**
     * Sets the value of the eccentricityInX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEccentricityInX(Double value) {
        this.eccentricityInX = value;
    }

    /**
     * Gets the value of the eccentricityInY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEccentricityInY() {
        return eccentricityInY;
    }

    /**
     * Sets the value of the eccentricityInY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEccentricityInY(Double value) {
        this.eccentricityInY = value;
    }

    /**
     * Gets the value of the eccentricityInZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEccentricityInZ() {
        return eccentricityInZ;
    }

    /**
     * Sets the value of the eccentricityInZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEccentricityInZ(Double value) {
        this.eccentricityInZ = value;
    }

}
