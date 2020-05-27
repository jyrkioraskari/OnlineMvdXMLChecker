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
 * <p>Java class for IfcRelConnectsPorts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelConnectsPorts">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelConnects">
 *       &lt;sequence>
 *         &lt;element name="RelatingPort" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPort"/>
 *         &lt;element name="RelatedPort" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPort"/>
 *         &lt;element name="RealizingElement" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelConnectsPorts", propOrder = {
    "relatingPort",
    "relatedPort",
    "realizingElement"
})
public class IfcRelConnectsPorts
    extends IfcRelConnects
{

    @XmlElement(name = "RelatingPort", required = true, nillable = true)
    protected IfcPort relatingPort;
    @XmlElement(name = "RelatedPort", required = true, nillable = true)
    protected IfcPort relatedPort;
    @XmlElementRef(name = "RealizingElement", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcElement> realizingElement;

    /**
     * Gets the value of the relatingPort property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPort }
     *     
     */
    public IfcPort getRelatingPort() {
        return relatingPort;
    }

    /**
     * Sets the value of the relatingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPort }
     *     
     */
    public void setRelatingPort(IfcPort value) {
        this.relatingPort = value;
    }

    /**
     * Gets the value of the relatedPort property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPort }
     *     
     */
    public IfcPort getRelatedPort() {
        return relatedPort;
    }

    /**
     * Sets the value of the relatedPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPort }
     *     
     */
    public void setRelatedPort(IfcPort value) {
        this.relatedPort = value;
    }

    /**
     * Gets the value of the realizingElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcElement }{@code >}
     *     
     */
    public JAXBElement<IfcElement> getRealizingElement() {
        return realizingElement;
    }

    /**
     * Sets the value of the realizingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcElement }{@code >}
     *     
     */
    public void setRealizingElement(JAXBElement<IfcElement> value) {
        this.realizingElement = value;
    }

}
