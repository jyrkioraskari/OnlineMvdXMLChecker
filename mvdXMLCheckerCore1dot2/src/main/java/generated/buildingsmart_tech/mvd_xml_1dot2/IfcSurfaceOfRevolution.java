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
 * <p>Java class for IfcSurfaceOfRevolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSurfaceOfRevolution">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSweptSurface">
 *       &lt;sequence>
 *         &lt;element name="AxisPosition" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis1Placement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSurfaceOfRevolution", propOrder = {
    "axisPosition"
})
public class IfcSurfaceOfRevolution
    extends IfcSweptSurface
{

    @XmlElement(name = "AxisPosition", required = true, nillable = true)
    protected IfcAxis1Placement axisPosition;

    /**
     * Gets the value of the axisPosition property.
     * 
     * @return
     *     possible object is
     *     {@link IfcAxis1Placement }
     *     
     */
    public IfcAxis1Placement getAxisPosition() {
        return axisPosition;
    }

    /**
     * Sets the value of the axisPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcAxis1Placement }
     *     
     */
    public void setAxisPosition(IfcAxis1Placement value) {
        this.axisPosition = value;
    }

}
