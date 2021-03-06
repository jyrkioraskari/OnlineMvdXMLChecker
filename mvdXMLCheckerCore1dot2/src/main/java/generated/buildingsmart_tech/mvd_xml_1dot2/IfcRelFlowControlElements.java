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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for IfcRelFlowControlElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelFlowControlElements">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelConnects">
 *       &lt;sequence>
 *         &lt;element name="RelatedControlElements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDistributionControlElement" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcDistributionControlElement""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="set""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelatingFlowElement" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDistributionFlowElement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelFlowControlElements", propOrder = {
    "relatedControlElements",
    "relatingFlowElement"
})
public class IfcRelFlowControlElements
    extends IfcRelConnects
{

    @XmlElement(name = "RelatedControlElements", required = true)
    protected IfcRelFlowControlElements.RelatedControlElements relatedControlElements;
    @XmlElement(name = "RelatingFlowElement", required = true, nillable = true)
    protected IfcDistributionFlowElement relatingFlowElement;

    /**
     * Gets the value of the relatedControlElements property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRelFlowControlElements.RelatedControlElements }
     *     
     */
    public IfcRelFlowControlElements.RelatedControlElements getRelatedControlElements() {
        return relatedControlElements;
    }

    /**
     * Sets the value of the relatedControlElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRelFlowControlElements.RelatedControlElements }
     *     
     */
    public void setRelatedControlElements(IfcRelFlowControlElements.RelatedControlElements value) {
        this.relatedControlElements = value;
    }

    /**
     * Gets the value of the relatingFlowElement property.
     * 
     * @return
     *     possible object is
     *     {@link IfcDistributionFlowElement }
     *     
     */
    public IfcDistributionFlowElement getRelatingFlowElement() {
        return relatingFlowElement;
    }

    /**
     * Sets the value of the relatingFlowElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcDistributionFlowElement }
     *     
     */
    public void setRelatingFlowElement(IfcDistributionFlowElement value) {
        this.relatingFlowElement = value;
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
     *         &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDistributionControlElement" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcDistributionControlElement""/>
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
        "ifcDistributionControlElement"
    })
    public static class RelatedControlElements {

        @XmlElementRef(name = "IfcDistributionControlElement", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class)
        protected List<JAXBElement<? extends IfcDistributionControlElement>> ifcDistributionControlElement;
        @XmlAttribute(name = "itemType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<QName> itemType;
        @XmlAttribute(name = "cType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<AggregateType> cType;
        @XmlAttribute(name = "arraySize", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<BigInteger> arraySize;

        /**
         * Gets the value of the ifcDistributionControlElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcDistributionControlElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcDistributionControlElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link IfcAlarm }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcActuator }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowInstrument }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSensor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionControlElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProtectiveDeviceTrippingUnit }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcController }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcUnitaryControlElement }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends IfcDistributionControlElement>> getIfcDistributionControlElement() {
            if (ifcDistributionControlElement == null) {
                ifcDistributionControlElement = new ArrayList<JAXBElement<? extends IfcDistributionControlElement>>();
            }
            return this.ifcDistributionControlElement;
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
