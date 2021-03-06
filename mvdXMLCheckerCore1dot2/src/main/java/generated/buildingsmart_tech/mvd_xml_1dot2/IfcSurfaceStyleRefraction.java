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
 * <p>Java class for IfcSurfaceStyleRefraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSurfaceStyleRefraction">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPresentationItem">
 *       &lt;attribute name="RefractionIndex" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcReal" />
 *       &lt;attribute name="DispersionFactor" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcReal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSurfaceStyleRefraction")
public class IfcSurfaceStyleRefraction
    extends IfcPresentationItem
{

    @XmlAttribute(name = "RefractionIndex")
    protected Double refractionIndex;
    @XmlAttribute(name = "DispersionFactor")
    protected Double dispersionFactor;

    /**
     * Gets the value of the refractionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRefractionIndex() {
        return refractionIndex;
    }

    /**
     * Sets the value of the refractionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRefractionIndex(Double value) {
        this.refractionIndex = value;
    }

    /**
     * Gets the value of the dispersionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDispersionFactor() {
        return dispersionFactor;
    }

    /**
     * Sets the value of the dispersionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDispersionFactor(Double value) {
        this.dispersionFactor = value;
    }

}
