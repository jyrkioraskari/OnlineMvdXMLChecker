//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcIndexedPolygonalFaceWithVoids complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcIndexedPolygonalFaceWithVoids">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIndexedPolygonalFace">
 *       &lt;sequence>
 *         &lt;element name="InnerCoordIndices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Seq-IfcPositiveInteger-wrapper" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Seq-IfcPositiveInteger" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
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
@XmlType(name = "IfcIndexedPolygonalFaceWithVoids", propOrder = {
    "innerCoordIndices"
})
public class IfcIndexedPolygonalFaceWithVoids
    extends IfcIndexedPolygonalFace
{

    @XmlElement(name = "InnerCoordIndices")
    protected IfcIndexedPolygonalFaceWithVoids.InnerCoordIndices innerCoordIndices;

    /**
     * Gets the value of the innerCoordIndices property.
     * 
     * @return
     *     possible object is
     *     {@link IfcIndexedPolygonalFaceWithVoids.InnerCoordIndices }
     *     
     */
    public IfcIndexedPolygonalFaceWithVoids.InnerCoordIndices getInnerCoordIndices() {
        return innerCoordIndices;
    }

    /**
     * Sets the value of the innerCoordIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcIndexedPolygonalFaceWithVoids.InnerCoordIndices }
     *     
     */
    public void setInnerCoordIndices(IfcIndexedPolygonalFaceWithVoids.InnerCoordIndices value) {
        this.innerCoordIndices = value;
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
     *         &lt;element name="Seq-IfcPositiveInteger-wrapper" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Seq-IfcPositiveInteger" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "seqIfcPositiveIntegerWrapper"
    })
    public static class InnerCoordIndices {

        @XmlElementRef(name = "Seq-IfcPositiveInteger-wrapper", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class)
        protected List<JAXBElement<List<Long>>> seqIfcPositiveIntegerWrapper;

        /**
         * Gets the value of the seqIfcPositiveIntegerWrapper property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seqIfcPositiveIntegerWrapper property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeqIfcPositiveIntegerWrapper().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
         * 
         * 
         */
        public List<JAXBElement<List<Long>>> getSeqIfcPositiveIntegerWrapper() {
            if (seqIfcPositiveIntegerWrapper == null) {
                seqIfcPositiveIntegerWrapper = new ArrayList<JAXBElement<List<Long>>>();
            }
            return this.seqIfcPositiveIntegerWrapper;
        }

    }

}
