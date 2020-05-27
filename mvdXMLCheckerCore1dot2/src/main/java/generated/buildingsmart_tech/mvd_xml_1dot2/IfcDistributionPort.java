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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcDistributionPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcDistributionPort">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPort">
 *       &lt;attribute name="FlowDirection" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcFlowDirectionEnum" />
 *       &lt;attribute name="PredefinedType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDistributionPortTypeEnum" />
 *       &lt;attribute name="SystemType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDistributionSystemEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcDistributionPort")
public class IfcDistributionPort
    extends IfcPort
{

    @XmlAttribute(name = "FlowDirection")
    protected IfcFlowDirectionEnum flowDirection;
    @XmlAttribute(name = "PredefinedType")
    protected IfcDistributionPortTypeEnum predefinedType;
    @XmlAttribute(name = "SystemType")
    protected IfcDistributionSystemEnum systemType;

    /**
     * Gets the value of the flowDirection property.
     * 
     * @return
     *     possible object is
     *     {@link IfcFlowDirectionEnum }
     *     
     */
    public IfcFlowDirectionEnum getFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcFlowDirectionEnum }
     *     
     */
    public void setFlowDirection(IfcFlowDirectionEnum value) {
        this.flowDirection = value;
    }

    /**
     * Gets the value of the predefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcDistributionPortTypeEnum }
     *     
     */
    public IfcDistributionPortTypeEnum getPredefinedType() {
        return predefinedType;
    }

    /**
     * Sets the value of the predefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcDistributionPortTypeEnum }
     *     
     */
    public void setPredefinedType(IfcDistributionPortTypeEnum value) {
        this.predefinedType = value;
    }

    /**
     * Gets the value of the systemType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcDistributionSystemEnum }
     *     
     */
    public IfcDistributionSystemEnum getSystemType() {
        return systemType;
    }

    /**
     * Sets the value of the systemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcDistributionSystemEnum }
     *     
     */
    public void setSystemType(IfcDistributionSystemEnum value) {
        this.systemType = value;
    }

}
