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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcRepresentationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRepresentationItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;sequence>
 *         &lt;element name="StyledByItem" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcStyledItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRepresentationItem", propOrder = {
    "styledByItem"
})
@XmlSeeAlso({
    IfcStyledItem.class,
    IfcMappedItem.class,
    IfcGeometricRepresentationItem.class,
    IfcTopologicalRepresentationItem.class
})
public abstract class IfcRepresentationItem
    extends Entity
{

    @XmlElementRef(name = "StyledByItem", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcStyledItem> styledByItem;

    /**
     * Gets the value of the styledByItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcStyledItem }{@code >}
     *     
     */
    public JAXBElement<IfcStyledItem> getStyledByItem() {
        return styledByItem;
    }

    /**
     * Sets the value of the styledByItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcStyledItem }{@code >}
     *     
     */
    public void setStyledByItem(JAXBElement<IfcStyledItem> value) {
        this.styledByItem = value;
    }

}
