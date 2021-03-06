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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcConnectionVolumeGeometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcConnectionVolumeGeometry">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcConnectionGeometry">
 *       &lt;sequence>
 *         &lt;element name="VolumeOnRelatingElement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSolidOrShell"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VolumeOnRelatedElement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSolidOrShell"/>
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
@XmlType(name = "IfcConnectionVolumeGeometry", propOrder = {
    "volumeOnRelatingElement",
    "volumeOnRelatedElement"
})
public class IfcConnectionVolumeGeometry
    extends IfcConnectionGeometry
{

    @XmlElement(name = "VolumeOnRelatingElement", required = true)
    protected IfcConnectionVolumeGeometry.VolumeOnRelatingElement volumeOnRelatingElement;
    @XmlElementRef(name = "VolumeOnRelatedElement", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcConnectionVolumeGeometry.VolumeOnRelatedElement> volumeOnRelatedElement;

    /**
     * Gets the value of the volumeOnRelatingElement property.
     * 
     * @return
     *     possible object is
     *     {@link IfcConnectionVolumeGeometry.VolumeOnRelatingElement }
     *     
     */
    public IfcConnectionVolumeGeometry.VolumeOnRelatingElement getVolumeOnRelatingElement() {
        return volumeOnRelatingElement;
    }

    /**
     * Sets the value of the volumeOnRelatingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcConnectionVolumeGeometry.VolumeOnRelatingElement }
     *     
     */
    public void setVolumeOnRelatingElement(IfcConnectionVolumeGeometry.VolumeOnRelatingElement value) {
        this.volumeOnRelatingElement = value;
    }

    /**
     * Gets the value of the volumeOnRelatedElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcConnectionVolumeGeometry.VolumeOnRelatedElement }{@code >}
     *     
     */
    public JAXBElement<IfcConnectionVolumeGeometry.VolumeOnRelatedElement> getVolumeOnRelatedElement() {
        return volumeOnRelatedElement;
    }

    /**
     * Sets the value of the volumeOnRelatedElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcConnectionVolumeGeometry.VolumeOnRelatedElement }{@code >}
     *     
     */
    public void setVolumeOnRelatedElement(JAXBElement<IfcConnectionVolumeGeometry.VolumeOnRelatedElement> value) {
        this.volumeOnRelatedElement = value;
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
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSolidOrShell"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcClosedShell",
        "ifcSolidModel"
    })
    public static class VolumeOnRelatedElement {

        @XmlElement(name = "IfcClosedShell", nillable = true)
        protected IfcClosedShell ifcClosedShell;
        @XmlElementRef(name = "IfcSolidModel", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends IfcSolidModel> ifcSolidModel;

        /**
         * Gets the value of the ifcClosedShell property.
         * 
         * @return
         *     possible object is
         *     {@link IfcClosedShell }
         *     
         */
        public IfcClosedShell getIfcClosedShell() {
            return ifcClosedShell;
        }

        /**
         * Sets the value of the ifcClosedShell property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcClosedShell }
         *     
         */
        public void setIfcClosedShell(IfcClosedShell value) {
            this.ifcClosedShell = value;
        }

        /**
         * Gets the value of the ifcSolidModel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link IfcCsgSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSurfaceCurveSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSolidModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolidTapered }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolidPolygonal }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcManifoldSolidBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFixedReferenceSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolidTapered }{@code >}
         *     
         */
        public JAXBElement<? extends IfcSolidModel> getIfcSolidModel() {
            return ifcSolidModel;
        }

        /**
         * Sets the value of the ifcSolidModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link IfcCsgSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSurfaceCurveSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSolidModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolidTapered }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolidPolygonal }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcManifoldSolidBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFixedReferenceSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolidTapered }{@code >}
         *     
         */
        public void setIfcSolidModel(JAXBElement<? extends IfcSolidModel> value) {
            this.ifcSolidModel = value;
        }

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
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSolidOrShell"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcClosedShell",
        "ifcSolidModel"
    })
    public static class VolumeOnRelatingElement {

        @XmlElement(name = "IfcClosedShell", nillable = true)
        protected IfcClosedShell ifcClosedShell;
        @XmlElementRef(name = "IfcSolidModel", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends IfcSolidModel> ifcSolidModel;

        /**
         * Gets the value of the ifcClosedShell property.
         * 
         * @return
         *     possible object is
         *     {@link IfcClosedShell }
         *     
         */
        public IfcClosedShell getIfcClosedShell() {
            return ifcClosedShell;
        }

        /**
         * Sets the value of the ifcClosedShell property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcClosedShell }
         *     
         */
        public void setIfcClosedShell(IfcClosedShell value) {
            this.ifcClosedShell = value;
        }

        /**
         * Gets the value of the ifcSolidModel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link IfcCsgSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSurfaceCurveSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSolidModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolidTapered }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolidPolygonal }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcManifoldSolidBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFixedReferenceSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolidTapered }{@code >}
         *     
         */
        public JAXBElement<? extends IfcSolidModel> getIfcSolidModel() {
            return ifcSolidModel;
        }

        /**
         * Sets the value of the ifcSolidModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link IfcCsgSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSurfaceCurveSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSolidModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcExtrudedAreaSolidTapered }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFacetedBrepWithVoids }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcSweptDiskSolidPolygonal }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcAdvancedBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcManifoldSolidBrep }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcFixedReferenceSweptAreaSolid }{@code >}
         *     {@link JAXBElement }{@code <}{@link IfcRevolvedAreaSolidTapered }{@code >}
         *     
         */
        public void setIfcSolidModel(JAXBElement<? extends IfcSolidModel> value) {
            this.ifcSolidModel = value;
        }

    }

}
