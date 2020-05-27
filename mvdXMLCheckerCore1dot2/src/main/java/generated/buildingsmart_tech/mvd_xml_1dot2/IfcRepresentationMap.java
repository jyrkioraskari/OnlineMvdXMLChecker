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
 * <p>Java class for IfcRepresentationMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRepresentationMap">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;sequence>
 *         &lt;element name="MappingOrigin">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MappedRepresentation" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRepresentation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRepresentationMap", propOrder = {
    "mappingOrigin",
    "mappedRepresentation"
})
public class IfcRepresentationMap
    extends Entity
{

    @XmlElement(name = "MappingOrigin", required = true)
    protected IfcRepresentationMap.MappingOrigin mappingOrigin;
    @XmlElement(name = "MappedRepresentation", required = true, nillable = true)
    protected IfcRepresentation mappedRepresentation;

    /**
     * Gets the value of the mappingOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRepresentationMap.MappingOrigin }
     *     
     */
    public IfcRepresentationMap.MappingOrigin getMappingOrigin() {
        return mappingOrigin;
    }

    /**
     * Sets the value of the mappingOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRepresentationMap.MappingOrigin }
     *     
     */
    public void setMappingOrigin(IfcRepresentationMap.MappingOrigin value) {
        this.mappingOrigin = value;
    }

    /**
     * Gets the value of the mappedRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRepresentation }
     *     
     */
    public IfcRepresentation getMappedRepresentation() {
        return mappedRepresentation;
    }

    /**
     * Sets the value of the mappedRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRepresentation }
     *     
     */
    public void setMappedRepresentation(IfcRepresentation value) {
        this.mappedRepresentation = value;
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
    public static class MappingOrigin {

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
