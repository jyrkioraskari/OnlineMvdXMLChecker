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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcWindowPanelProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcWindowPanelProperties">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPreDefinedPropertySet">
 *       &lt;sequence>
 *         &lt;element name="ShapeAspectStyle" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcShapeAspect" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OperationType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcWindowPanelOperationEnum" />
 *       &lt;attribute name="PanelPosition" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcWindowPanelPositionEnum" />
 *       &lt;attribute name="FrameDepth" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="FrameThickness" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcWindowPanelProperties", propOrder = {
    "shapeAspectStyle"
})
public class IfcWindowPanelProperties
    extends IfcPreDefinedPropertySet
{

    @XmlElementRef(name = "ShapeAspectStyle", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcShapeAspect> shapeAspectStyle;
    @XmlAttribute(name = "OperationType")
    protected IfcWindowPanelOperationEnum operationType;
    @XmlAttribute(name = "PanelPosition")
    protected IfcWindowPanelPositionEnum panelPosition;
    @XmlAttribute(name = "FrameDepth")
    protected Double frameDepth;
    @XmlAttribute(name = "FrameThickness")
    protected Double frameThickness;

    /**
     * Gets the value of the shapeAspectStyle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcShapeAspect }{@code >}
     *     
     */
    public JAXBElement<IfcShapeAspect> getShapeAspectStyle() {
        return shapeAspectStyle;
    }

    /**
     * Sets the value of the shapeAspectStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcShapeAspect }{@code >}
     *     
     */
    public void setShapeAspectStyle(JAXBElement<IfcShapeAspect> value) {
        this.shapeAspectStyle = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcWindowPanelOperationEnum }
     *     
     */
    public IfcWindowPanelOperationEnum getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcWindowPanelOperationEnum }
     *     
     */
    public void setOperationType(IfcWindowPanelOperationEnum value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the panelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link IfcWindowPanelPositionEnum }
     *     
     */
    public IfcWindowPanelPositionEnum getPanelPosition() {
        return panelPosition;
    }

    /**
     * Sets the value of the panelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcWindowPanelPositionEnum }
     *     
     */
    public void setPanelPosition(IfcWindowPanelPositionEnum value) {
        this.panelPosition = value;
    }

    /**
     * Gets the value of the frameDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrameDepth() {
        return frameDepth;
    }

    /**
     * Sets the value of the frameDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrameDepth(Double value) {
        this.frameDepth = value;
    }

    /**
     * Gets the value of the frameThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrameThickness() {
        return frameThickness;
    }

    /**
     * Sets the value of the frameThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrameThickness(Double value) {
        this.frameThickness = value;
    }

}
