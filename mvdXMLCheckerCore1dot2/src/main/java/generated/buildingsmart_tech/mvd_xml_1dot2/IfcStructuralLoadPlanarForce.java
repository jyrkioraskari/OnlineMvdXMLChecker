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
 * <p>Java class for IfcStructuralLoadPlanarForce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcStructuralLoadPlanarForce">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcStructuralLoadStatic">
 *       &lt;attribute name="PlanarForceX" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlanarForceMeasure" />
 *       &lt;attribute name="PlanarForceY" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlanarForceMeasure" />
 *       &lt;attribute name="PlanarForceZ" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlanarForceMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcStructuralLoadPlanarForce")
public class IfcStructuralLoadPlanarForce
    extends IfcStructuralLoadStatic
{

    @XmlAttribute(name = "PlanarForceX")
    protected Double planarForceX;
    @XmlAttribute(name = "PlanarForceY")
    protected Double planarForceY;
    @XmlAttribute(name = "PlanarForceZ")
    protected Double planarForceZ;

    /**
     * Gets the value of the planarForceX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanarForceX() {
        return planarForceX;
    }

    /**
     * Sets the value of the planarForceX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanarForceX(Double value) {
        this.planarForceX = value;
    }

    /**
     * Gets the value of the planarForceY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanarForceY() {
        return planarForceY;
    }

    /**
     * Sets the value of the planarForceY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanarForceY(Double value) {
        this.planarForceY = value;
    }

    /**
     * Gets the value of the planarForceZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanarForceZ() {
        return planarForceZ;
    }

    /**
     * Sets the value of the planarForceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanarForceZ(Double value) {
        this.planarForceZ = value;
    }

}
