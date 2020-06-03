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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcMaterialProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMaterialProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterialDefinition">
 *       &lt;sequence>
 *         &lt;element name="Material" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcMaterial" minOccurs="0"/>
 *         &lt;element name="Profile" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *       &lt;attribute name="Description" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcText" />
 *       &lt;attribute name="Priority" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcInteger" />
 *       &lt;attribute name="Category" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMaterialProfile", propOrder = {
    "material",
    "profile"
})
@XmlSeeAlso({
    IfcMaterialProfileWithOffsets.class
})
public class IfcMaterialProfile
    extends IfcMaterialDefinition
{

    @XmlElementRef(name = "Material", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcMaterial> material;
    @XmlElement(name = "Profile", required = true, nillable = true)
    protected IfcProfileDef profile;
    @XmlAttribute(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "Priority")
    protected Long priority;
    @XmlAttribute(name = "Category")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String category;

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcMaterial }{@code >}
     *     
     */
    public JAXBElement<IfcMaterial> getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcMaterial }{@code >}
     *     
     */
    public void setMaterial(JAXBElement<IfcMaterial> value) {
        this.material = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link IfcProfileDef }
     *     
     */
    public IfcProfileDef getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcProfileDef }
     *     
     */
    public void setProfile(IfcProfileDef value) {
        this.profile = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}