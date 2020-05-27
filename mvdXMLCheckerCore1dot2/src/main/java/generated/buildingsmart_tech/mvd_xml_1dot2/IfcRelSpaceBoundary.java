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


/**
 * <p>Java class for IfcRelSpaceBoundary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelSpaceBoundary">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelConnects">
 *       &lt;sequence>
 *         &lt;element name="RelatingSpace">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSpaceBoundarySelect"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelatedBuildingElement" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcElement"/>
 *         &lt;element name="ConnectionGeometry" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcConnectionGeometry" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PhysicalOrVirtualBoundary" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPhysicalOrVirtualEnum" />
 *       &lt;attribute name="InternalOrExternalBoundary" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcInternalOrExternalEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelSpaceBoundary", propOrder = {
    "relatingSpace",
    "relatedBuildingElement",
    "connectionGeometry"
})
@XmlSeeAlso({
    IfcRelSpaceBoundary1StLevel.class
})
public class IfcRelSpaceBoundary
    extends IfcRelConnects
{

    @XmlElement(name = "RelatingSpace", required = true)
    protected IfcRelSpaceBoundary.RelatingSpace relatingSpace;
    @XmlElement(name = "RelatedBuildingElement", required = true, nillable = true)
    protected IfcElement relatedBuildingElement;
    @XmlElementRef(name = "ConnectionGeometry", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcConnectionGeometry> connectionGeometry;
    @XmlAttribute(name = "PhysicalOrVirtualBoundary")
    protected IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary;
    @XmlAttribute(name = "InternalOrExternalBoundary")
    protected IfcInternalOrExternalEnum internalOrExternalBoundary;

    /**
     * Gets the value of the relatingSpace property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRelSpaceBoundary.RelatingSpace }
     *     
     */
    public IfcRelSpaceBoundary.RelatingSpace getRelatingSpace() {
        return relatingSpace;
    }

    /**
     * Sets the value of the relatingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRelSpaceBoundary.RelatingSpace }
     *     
     */
    public void setRelatingSpace(IfcRelSpaceBoundary.RelatingSpace value) {
        this.relatingSpace = value;
    }

    /**
     * Gets the value of the relatedBuildingElement property.
     * 
     * @return
     *     possible object is
     *     {@link IfcElement }
     *     
     */
    public IfcElement getRelatedBuildingElement() {
        return relatedBuildingElement;
    }

    /**
     * Sets the value of the relatedBuildingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcElement }
     *     
     */
    public void setRelatedBuildingElement(IfcElement value) {
        this.relatedBuildingElement = value;
    }

    /**
     * Gets the value of the connectionGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcConnectionGeometry }{@code >}
     *     
     */
    public JAXBElement<IfcConnectionGeometry> getConnectionGeometry() {
        return connectionGeometry;
    }

    /**
     * Sets the value of the connectionGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcConnectionGeometry }{@code >}
     *     
     */
    public void setConnectionGeometry(JAXBElement<IfcConnectionGeometry> value) {
        this.connectionGeometry = value;
    }

    /**
     * Gets the value of the physicalOrVirtualBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPhysicalOrVirtualEnum }
     *     
     */
    public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
        return physicalOrVirtualBoundary;
    }

    /**
     * Sets the value of the physicalOrVirtualBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPhysicalOrVirtualEnum }
     *     
     */
    public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum value) {
        this.physicalOrVirtualBoundary = value;
    }

    /**
     * Gets the value of the internalOrExternalBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link IfcInternalOrExternalEnum }
     *     
     */
    public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
        return internalOrExternalBoundary;
    }

    /**
     * Sets the value of the internalOrExternalBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcInternalOrExternalEnum }
     *     
     */
    public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum value) {
        this.internalOrExternalBoundary = value;
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
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSpaceBoundarySelect"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcExternalSpatialElement",
        "ifcSpace"
    })
    public static class RelatingSpace {

        @XmlElement(name = "IfcExternalSpatialElement", nillable = true)
        protected IfcExternalSpatialElement ifcExternalSpatialElement;
        @XmlElement(name = "IfcSpace", nillable = true)
        protected IfcSpace ifcSpace;

        /**
         * Gets the value of the ifcExternalSpatialElement property.
         * 
         * @return
         *     possible object is
         *     {@link IfcExternalSpatialElement }
         *     
         */
        public IfcExternalSpatialElement getIfcExternalSpatialElement() {
            return ifcExternalSpatialElement;
        }

        /**
         * Sets the value of the ifcExternalSpatialElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcExternalSpatialElement }
         *     
         */
        public void setIfcExternalSpatialElement(IfcExternalSpatialElement value) {
            this.ifcExternalSpatialElement = value;
        }

        /**
         * Gets the value of the ifcSpace property.
         * 
         * @return
         *     possible object is
         *     {@link IfcSpace }
         *     
         */
        public IfcSpace getIfcSpace() {
            return ifcSpace;
        }

        /**
         * Sets the value of the ifcSpace property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcSpace }
         *     
         */
        public void setIfcSpace(IfcSpace value) {
            this.ifcSpace = value;
        }

    }

}
