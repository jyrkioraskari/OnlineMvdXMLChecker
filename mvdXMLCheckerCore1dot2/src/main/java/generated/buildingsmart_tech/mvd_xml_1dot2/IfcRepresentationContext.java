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
 * <p>Java class for IfcRepresentationContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRepresentationContext">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;attribute name="ContextIdentifier" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *       &lt;attribute name="ContextType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRepresentationContext")
@XmlSeeAlso({
    IfcGeometricRepresentationContext.class
})
public abstract class IfcRepresentationContext
    extends Entity
{

    @XmlAttribute(name = "ContextIdentifier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contextIdentifier;
    @XmlAttribute(name = "ContextType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contextType;

    /**
     * Gets the value of the contextIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextIdentifier() {
        return contextIdentifier;
    }

    /**
     * Sets the value of the contextIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextIdentifier(String value) {
        this.contextIdentifier = value;
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextType(String value) {
        this.contextType = value;
    }

}
