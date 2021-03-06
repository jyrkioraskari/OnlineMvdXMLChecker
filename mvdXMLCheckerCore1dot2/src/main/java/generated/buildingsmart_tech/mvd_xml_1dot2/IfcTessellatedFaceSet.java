//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for IfcTessellatedFaceSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcTessellatedFaceSet">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcTessellatedItem">
 *       &lt;sequence>
 *         &lt;element name="Coordinates" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCartesianPointList3D"/>
 *         &lt;element name="HasColours" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIndexedColourMap" minOccurs="0"/>
 *         &lt;element name="HasTextures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIndexedTextureMap" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcIndexedTextureMap""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="set""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
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
@XmlType(name = "IfcTessellatedFaceSet", propOrder = {
    "coordinates",
    "hasColours",
    "hasTextures"
})
@XmlSeeAlso({
    IfcTriangulatedFaceSet.class,
    IfcPolygonalFaceSet.class
})
public abstract class IfcTessellatedFaceSet
    extends IfcTessellatedItem
{

    @XmlElement(name = "Coordinates", required = true, nillable = true)
    protected IfcCartesianPointList3D coordinates;
    @XmlElementRef(name = "HasColours", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcIndexedColourMap> hasColours;
    @XmlElementRef(name = "HasTextures", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcTessellatedFaceSet.HasTextures> hasTextures;

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCartesianPointList3D }
     *     
     */
    public IfcCartesianPointList3D getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCartesianPointList3D }
     *     
     */
    public void setCoordinates(IfcCartesianPointList3D value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the hasColours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcIndexedColourMap }{@code >}
     *     
     */
    public JAXBElement<IfcIndexedColourMap> getHasColours() {
        return hasColours;
    }

    /**
     * Sets the value of the hasColours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcIndexedColourMap }{@code >}
     *     
     */
    public void setHasColours(JAXBElement<IfcIndexedColourMap> value) {
        this.hasColours = value;
    }

    /**
     * Gets the value of the hasTextures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcTessellatedFaceSet.HasTextures }{@code >}
     *     
     */
    public JAXBElement<IfcTessellatedFaceSet.HasTextures> getHasTextures() {
        return hasTextures;
    }

    /**
     * Sets the value of the hasTextures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcTessellatedFaceSet.HasTextures }{@code >}
     *     
     */
    public void setHasTextures(JAXBElement<IfcTessellatedFaceSet.HasTextures> value) {
        this.hasTextures = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIndexedTextureMap" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcIndexedTextureMap""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="set""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcIndexedTextureMap"
    })
    public static class HasTextures {

        @XmlElementRef(name = "IfcIndexedTextureMap", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
        protected List<JAXBElement<? extends IfcIndexedTextureMap>> ifcIndexedTextureMap;
        @XmlAttribute(name = "itemType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<QName> itemType;
        @XmlAttribute(name = "cType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<AggregateType> cType;
        @XmlAttribute(name = "arraySize", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<BigInteger> arraySize;

        /**
         * Gets the value of the ifcIndexedTextureMap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcIndexedTextureMap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcIndexedTextureMap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link IfcIndexedTriangleTextureMap }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcIndexedTextureMap }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends IfcIndexedTextureMap>> getIfcIndexedTextureMap() {
            if (ifcIndexedTextureMap == null) {
                ifcIndexedTextureMap = new ArrayList<JAXBElement<? extends IfcIndexedTextureMap>>();
            }
            return this.ifcIndexedTextureMap;
        }

        /**
         * Gets the value of the itemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QName }
         * 
         * 
         */
        public List<QName> getItemType() {
            if (itemType == null) {
                itemType = new ArrayList<QName>();
            }
            return this.itemType;
        }

        /**
         * Gets the value of the cType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AggregateType }
         * 
         * 
         */
        public List<AggregateType> getCType() {
            if (cType == null) {
                cType = new ArrayList<AggregateType>();
            }
            return this.cType;
        }

        /**
         * Gets the value of the arraySize property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arraySize property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArraySize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getArraySize() {
            if (arraySize == null) {
                arraySize = new ArrayList<BigInteger>();
            }
            return this.arraySize;
        }

    }

}
