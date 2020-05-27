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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;attribute name="Purpose" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAddressTypeEnum" />
 *       &lt;attribute name="Description" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcText" />
 *       &lt;attribute name="UserDefinedPurpose" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcAddress")
@XmlSeeAlso({
    IfcTelecomAddress.class,
    IfcPostalAddress.class
})
public abstract class IfcAddress
    extends Entity
{

    @XmlAttribute(name = "Purpose")
    protected IfcAddressTypeEnum purpose;
    @XmlAttribute(name = "Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "UserDefinedPurpose")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userDefinedPurpose;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link IfcAddressTypeEnum }
     *     
     */
    public IfcAddressTypeEnum getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcAddressTypeEnum }
     *     
     */
    public void setPurpose(IfcAddressTypeEnum value) {
        this.purpose = value;
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
     * Gets the value of the userDefinedPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefinedPurpose() {
        return userDefinedPurpose;
    }

    /**
     * Sets the value of the userDefinedPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefinedPurpose(String value) {
        this.userDefinedPurpose = value;
    }

}
