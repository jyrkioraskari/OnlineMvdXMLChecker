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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcTextLiteral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcTextLiteral">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcGeometricRepresentationItem">
 *       &lt;sequence>
 *         &lt;element name="Placement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Literal" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPresentableText" />
 *       &lt;attribute name="Path" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcTextPath" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcTextLiteral", propOrder = {
    "placement"
})
@XmlSeeAlso({
    IfcTextLiteralWithExtent.class
})
public class IfcTextLiteral
    extends IfcGeometricRepresentationItem
{

    @XmlElement(name = "Placement", required = true)
    protected IfcTextLiteral.Placement placement;
    @XmlAttribute(name = "Literal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String literal;
    @XmlAttribute(name = "Path")
    protected IfcTextPath path;

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link IfcTextLiteral.Placement }
     *     
     */
    public IfcTextLiteral.Placement getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcTextLiteral.Placement }
     *     
     */
    public void setPlacement(IfcTextLiteral.Placement value) {
        this.placement = value;
    }

    /**
     * Gets the value of the literal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Sets the value of the literal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteral(String value) {
        this.literal = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link IfcTextPath }
     *     
     */
    public IfcTextPath getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcTextPath }
     *     
     */
    public void setPath(IfcTextPath value) {
        this.path = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcAxis2Placement2D",
        "ifcAxis2Placement3D"
    })
    public static class Placement {

        @XmlElement(name = "IfcAxis2Placement2D", nillable = true)
        protected IfcAxis2Placement2D ifcAxis2Placement2D;
        @XmlElement(name = "IfcAxis2Placement3D", nillable = true)
        protected IfcAxis2Placement3D ifcAxis2Placement3D;

        /**
         * Gets the value of the ifcAxis2Placement2D property.
         * 
         * @return
         *     possible object is
         *     {@link IfcAxis2Placement2D }
         *     
         */
        public IfcAxis2Placement2D getIfcAxis2Placement2D() {
            return ifcAxis2Placement2D;
        }

        /**
         * Sets the value of the ifcAxis2Placement2D property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcAxis2Placement2D }
         *     
         */
        public void setIfcAxis2Placement2D(IfcAxis2Placement2D value) {
            this.ifcAxis2Placement2D = value;
        }

        /**
         * Gets the value of the ifcAxis2Placement3D property.
         * 
         * @return
         *     possible object is
         *     {@link IfcAxis2Placement3D }
         *     
         */
        public IfcAxis2Placement3D getIfcAxis2Placement3D() {
            return ifcAxis2Placement3D;
        }

        /**
         * Sets the value of the ifcAxis2Placement3D property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcAxis2Placement3D }
         *     
         */
        public void setIfcAxis2Placement3D(IfcAxis2Placement3D value) {
            this.ifcAxis2Placement3D = value;
        }

    }

}
