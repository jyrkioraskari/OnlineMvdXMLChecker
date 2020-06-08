//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.08 at 08:46:21 PM CEST 
//


package generated.buildingsmart.bcf.markup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BimSnippet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BimSnippet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceSchema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SnippetType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BimSnippet", propOrder = {
    "reference",
    "referenceSchema"
})
public class BimSnippet {

    @XmlElement(name = "Reference", required = true)
    protected String reference;
    @XmlElement(name = "ReferenceSchema", required = true)
    protected String referenceSchema;
    @XmlAttribute(name = "SnippetType", required = true)
    protected String snippetType;
    @XmlAttribute(name = "isExternal")
    protected Boolean isExternal;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the referenceSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSchema() {
        return referenceSchema;
    }

    /**
     * Sets the value of the referenceSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSchema(String value) {
        this.referenceSchema = value;
    }

    /**
     * Gets the value of the snippetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippetType() {
        return snippetType;
    }

    /**
     * Sets the value of the snippetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippetType(String value) {
        this.snippetType = value;
    }

    /**
     * Gets the value of the isExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsExternal() {
        if (isExternal == null) {
            return false;
        } else {
            return isExternal;
        }
    }

    /**
     * Sets the value of the isExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

}
