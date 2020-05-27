//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSweptSurface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSweptSurface">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSurface">
 *       &lt;sequence>
 *         &lt;element name="SweptCurve" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef"/>
 *         &lt;element name="Position" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement3D" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSweptSurface", propOrder = {
    "sweptCurve",
    "position"
})
@XmlSeeAlso({
    IfcSurfaceOfRevolution.class,
    IfcSurfaceOfLinearExtrusion.class
})
public abstract class IfcSweptSurface
    extends IfcSurface
{

    @XmlElement(name = "SweptCurve", required = true, nillable = true)
    protected IfcProfileDef sweptCurve;
    @XmlElementRef(name = "Position", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcAxis2Placement3D> position;

    /**
     * Gets the value of the sweptCurve property.
     * 
     * @return
     *     possible object is
     *     {@link IfcProfileDef }
     *     
     */
    public IfcProfileDef getSweptCurve() {
        return sweptCurve;
    }

    /**
     * Sets the value of the sweptCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcProfileDef }
     *     
     */
    public void setSweptCurve(IfcProfileDef value) {
        this.sweptCurve = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcAxis2Placement3D }{@code >}
     *     
     */
    public JAXBElement<IfcAxis2Placement3D> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcAxis2Placement3D }{@code >}
     *     
     */
    public void setPosition(JAXBElement<IfcAxis2Placement3D> value) {
        this.position = value;
    }

}
