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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcLibraryReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcLibraryReference">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcExternalReference">
 *       &lt;sequence>
 *         &lt;element name="ReferencedLibrary" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLibraryInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Description" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcText" />
 *       &lt;attribute name="Language" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLanguageId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcLibraryReference", propOrder = {
    "referencedLibrary"
})
public class IfcLibraryReference
    extends IfcExternalReference
{

    @XmlElementRef(name = "ReferencedLibrary", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcLibraryInformation> referencedLibrary;
    @XmlAttribute(name = "Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String language;

    /**
     * Gets the value of the referencedLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcLibraryInformation }{@code >}
     *     
     */
    public JAXBElement<IfcLibraryInformation> getReferencedLibrary() {
        return referencedLibrary;
    }

    /**
     * Sets the value of the referencedLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcLibraryInformation }{@code >}
     *     
     */
    public void setReferencedLibrary(JAXBElement<IfcLibraryInformation> value) {
        this.referencedLibrary = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
