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
 * <p>Java class for IfcDerivedProfileDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcDerivedProfileDef">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef">
 *       &lt;sequence>
 *         &lt;element name="ParentProfile" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef"/>
 *         &lt;element name="Operator" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCartesianTransformationOperator2D" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Label" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcDerivedProfileDef", propOrder = {
    "parentProfile",
    "operator"
})
@XmlSeeAlso({
    IfcMirroredProfileDefTemp.class
})
public class IfcDerivedProfileDef
    extends IfcProfileDef
{

    @XmlElement(name = "ParentProfile", required = true, nillable = true)
    protected IfcProfileDef parentProfile;
    @XmlElementRef(name = "Operator", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcCartesianTransformationOperator2D> operator;
    @XmlAttribute(name = "Label")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String label;

    /**
     * Gets the value of the parentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IfcProfileDef }
     *     
     */
    public IfcProfileDef getParentProfile() {
        return parentProfile;
    }

    /**
     * Sets the value of the parentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcProfileDef }
     *     
     */
    public void setParentProfile(IfcProfileDef value) {
        this.parentProfile = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcCartesianTransformationOperator2D }{@code >}
     *     
     */
    public JAXBElement<IfcCartesianTransformationOperator2D> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcCartesianTransformationOperator2D }{@code >}
     *     
     */
    public void setOperator(JAXBElement<IfcCartesianTransformationOperator2D> value) {
        this.operator = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}