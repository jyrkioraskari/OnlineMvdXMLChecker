//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcRelAssociatesLibrary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelAssociatesLibrary">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelAssociates">
 *       &lt;sequence>
 *         &lt;element name="RelatingLibrary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLibrarySelect"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelAssociatesLibrary", propOrder = {
    "relatingLibrary"
})
public class IfcRelAssociatesLibrary
    extends IfcRelAssociates
{

    @XmlElement(name = "RelatingLibrary", required = true)
    protected IfcRelAssociatesLibrary.RelatingLibrary relatingLibrary;

    /**
     * Gets the value of the relatingLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRelAssociatesLibrary.RelatingLibrary }
     *     
     */
    public IfcRelAssociatesLibrary.RelatingLibrary getRelatingLibrary() {
        return relatingLibrary;
    }

    /**
     * Sets the value of the relatingLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRelAssociatesLibrary.RelatingLibrary }
     *     
     */
    public void setRelatingLibrary(IfcRelAssociatesLibrary.RelatingLibrary value) {
        this.relatingLibrary = value;
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
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLibrarySelect"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcLibraryInformation",
        "ifcLibraryReference"
    })
    public static class RelatingLibrary {

        @XmlElement(name = "IfcLibraryInformation", nillable = true)
        protected IfcLibraryInformation ifcLibraryInformation;
        @XmlElement(name = "IfcLibraryReference", nillable = true)
        protected IfcLibraryReference ifcLibraryReference;

        /**
         * Gets the value of the ifcLibraryInformation property.
         * 
         * @return
         *     possible object is
         *     {@link IfcLibraryInformation }
         *     
         */
        public IfcLibraryInformation getIfcLibraryInformation() {
            return ifcLibraryInformation;
        }

        /**
         * Sets the value of the ifcLibraryInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcLibraryInformation }
         *     
         */
        public void setIfcLibraryInformation(IfcLibraryInformation value) {
            this.ifcLibraryInformation = value;
        }

        /**
         * Gets the value of the ifcLibraryReference property.
         * 
         * @return
         *     possible object is
         *     {@link IfcLibraryReference }
         *     
         */
        public IfcLibraryReference getIfcLibraryReference() {
            return ifcLibraryReference;
        }

        /**
         * Sets the value of the ifcLibraryReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcLibraryReference }
         *     
         */
        public void setIfcLibraryReference(IfcLibraryReference value) {
            this.ifcLibraryReference = value;
        }

    }

}