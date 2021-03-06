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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcRelAssociatesConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelAssociatesConstraint">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelAssociates">
 *       &lt;sequence>
 *         &lt;element name="RelatingConstraint" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcConstraint"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Intent" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelAssociatesConstraint", propOrder = {
    "relatingConstraint"
})
public class IfcRelAssociatesConstraint
    extends IfcRelAssociates
{

    @XmlElement(name = "RelatingConstraint", required = true, nillable = true)
    protected IfcConstraint relatingConstraint;
    @XmlAttribute(name = "Intent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String intent;

    /**
     * Gets the value of the relatingConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link IfcConstraint }
     *     
     */
    public IfcConstraint getRelatingConstraint() {
        return relatingConstraint;
    }

    /**
     * Sets the value of the relatingConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcConstraint }
     *     
     */
    public void setRelatingConstraint(IfcConstraint value) {
        this.relatingConstraint = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

}
