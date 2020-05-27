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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcRelAssignsToActor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelAssignsToActor">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelAssigns">
 *       &lt;sequence>
 *         &lt;element name="RelatingActor" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcActor"/>
 *         &lt;element name="ActingRole" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcActorRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelAssignsToActor", propOrder = {
    "relatingActor",
    "actingRole"
})
public class IfcRelAssignsToActor
    extends IfcRelAssigns
{

    @XmlElement(name = "RelatingActor", required = true, nillable = true)
    protected IfcActor relatingActor;
    @XmlElementRef(name = "ActingRole", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcActorRole> actingRole;

    /**
     * Gets the value of the relatingActor property.
     * 
     * @return
     *     possible object is
     *     {@link IfcActor }
     *     
     */
    public IfcActor getRelatingActor() {
        return relatingActor;
    }

    /**
     * Sets the value of the relatingActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcActor }
     *     
     */
    public void setRelatingActor(IfcActor value) {
        this.relatingActor = value;
    }

    /**
     * Gets the value of the actingRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcActorRole }{@code >}
     *     
     */
    public JAXBElement<IfcActorRole> getActingRole() {
        return actingRole;
    }

    /**
     * Sets the value of the actingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcActorRole }{@code >}
     *     
     */
    public void setActingRole(JAXBElement<IfcActorRole> value) {
        this.actingRole = value;
    }

}
