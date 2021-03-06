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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcHalfSpaceSolid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcHalfSpaceSolid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcGeometricRepresentationItem">
 *       &lt;sequence>
 *         &lt;element name="BaseSurface" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSurface"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AgreementFlag" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcBoolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcHalfSpaceSolid", propOrder = {
    "baseSurface"
})
@XmlSeeAlso({
    IfcBoxedHalfSpace.class,
    IfcPolygonalBoundedHalfSpace.class
})
public class IfcHalfSpaceSolid
    extends IfcGeometricRepresentationItem
{

    @XmlElement(name = "BaseSurface", required = true, nillable = true)
    protected IfcSurface baseSurface;
    @XmlAttribute(name = "AgreementFlag")
    protected Boolean agreementFlag;

    /**
     * Gets the value of the baseSurface property.
     * 
     * @return
     *     possible object is
     *     {@link IfcSurface }
     *     
     */
    public IfcSurface getBaseSurface() {
        return baseSurface;
    }

    /**
     * Sets the value of the baseSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcSurface }
     *     
     */
    public void setBaseSurface(IfcSurface value) {
        this.baseSurface = value;
    }

    /**
     * Gets the value of the agreementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreementFlag() {
        return agreementFlag;
    }

    /**
     * Sets the value of the agreementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreementFlag(Boolean value) {
        this.agreementFlag = value;
    }

}
