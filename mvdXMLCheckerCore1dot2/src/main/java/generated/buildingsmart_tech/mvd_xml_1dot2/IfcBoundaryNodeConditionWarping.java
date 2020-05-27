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
 * <p>Java class for IfcBoundaryNodeConditionWarping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcBoundaryNodeConditionWarping">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcBoundaryNodeCondition">
 *       &lt;sequence>
 *         &lt;element name="WarpingStiffness" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcWarpingStiffnessSelect"/>
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
@XmlType(name = "IfcBoundaryNodeConditionWarping", propOrder = {
    "warpingStiffness"
})
public class IfcBoundaryNodeConditionWarping
    extends IfcBoundaryNodeCondition
{

    @XmlElementRef(name = "WarpingStiffness", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcBoundaryNodeConditionWarping.WarpingStiffness> warpingStiffness;

    /**
     * Gets the value of the warpingStiffness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcBoundaryNodeConditionWarping.WarpingStiffness }{@code >}
     *     
     */
    public JAXBElement<IfcBoundaryNodeConditionWarping.WarpingStiffness> getWarpingStiffness() {
        return warpingStiffness;
    }

    /**
     * Sets the value of the warpingStiffness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcBoundaryNodeConditionWarping.WarpingStiffness }{@code >}
     *     
     */
    public void setWarpingStiffness(JAXBElement<IfcBoundaryNodeConditionWarping.WarpingStiffness> value) {
        this.warpingStiffness = value;
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
     *       &lt;group ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcWarpingStiffnessSelect"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcBooleanWrapper",
        "ifcWarpingMomentMeasureWrapper"
    })
    public static class WarpingStiffness {

        @XmlElement(name = "IfcBoolean-wrapper", nillable = true)
        protected IfcBooleanWrapper ifcBooleanWrapper;
        @XmlElement(name = "IfcWarpingMomentMeasure-wrapper", nillable = true)
        protected IfcWarpingMomentMeasureWrapper ifcWarpingMomentMeasureWrapper;

        /**
         * Gets the value of the ifcBooleanWrapper property.
         * 
         * @return
         *     possible object is
         *     {@link IfcBooleanWrapper }
         *     
         */
        public IfcBooleanWrapper getIfcBooleanWrapper() {
            return ifcBooleanWrapper;
        }

        /**
         * Sets the value of the ifcBooleanWrapper property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcBooleanWrapper }
         *     
         */
        public void setIfcBooleanWrapper(IfcBooleanWrapper value) {
            this.ifcBooleanWrapper = value;
        }

        /**
         * Gets the value of the ifcWarpingMomentMeasureWrapper property.
         * 
         * @return
         *     possible object is
         *     {@link IfcWarpingMomentMeasureWrapper }
         *     
         */
        public IfcWarpingMomentMeasureWrapper getIfcWarpingMomentMeasureWrapper() {
            return ifcWarpingMomentMeasureWrapper;
        }

        /**
         * Sets the value of the ifcWarpingMomentMeasureWrapper property.
         * 
         * @param value
         *     allowed object is
         *     {@link IfcWarpingMomentMeasureWrapper }
         *     
         */
        public void setIfcWarpingMomentMeasureWrapper(IfcWarpingMomentMeasureWrapper value) {
            this.ifcWarpingMomentMeasureWrapper = value;
        }

    }

}
