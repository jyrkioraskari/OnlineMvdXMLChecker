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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSurfaceCurveSweptAreaSolid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSurfaceCurveSweptAreaSolid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSweptAreaSolid">
 *       &lt;sequence>
 *         &lt;element name="Directrix" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCurve"/>
 *         &lt;element name="ReferenceSurface" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcSurface"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartParam" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterValue" />
 *       &lt;attribute name="EndParam" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterValue" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSurfaceCurveSweptAreaSolid", propOrder = {
    "directrix",
    "referenceSurface"
})
public class IfcSurfaceCurveSweptAreaSolid
    extends IfcSweptAreaSolid
{

    @XmlElement(name = "Directrix", required = true, nillable = true)
    protected IfcCurve directrix;
    @XmlElement(name = "ReferenceSurface", required = true, nillable = true)
    protected IfcSurface referenceSurface;
    @XmlAttribute(name = "StartParam")
    protected Double startParam;
    @XmlAttribute(name = "EndParam")
    protected Double endParam;

    /**
     * Gets the value of the directrix property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCurve }
     *     
     */
    public IfcCurve getDirectrix() {
        return directrix;
    }

    /**
     * Sets the value of the directrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCurve }
     *     
     */
    public void setDirectrix(IfcCurve value) {
        this.directrix = value;
    }

    /**
     * Gets the value of the referenceSurface property.
     * 
     * @return
     *     possible object is
     *     {@link IfcSurface }
     *     
     */
    public IfcSurface getReferenceSurface() {
        return referenceSurface;
    }

    /**
     * Sets the value of the referenceSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcSurface }
     *     
     */
    public void setReferenceSurface(IfcSurface value) {
        this.referenceSurface = value;
    }

    /**
     * Gets the value of the startParam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartParam() {
        return startParam;
    }

    /**
     * Sets the value of the startParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartParam(Double value) {
        this.startParam = value;
    }

    /**
     * Gets the value of the endParam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndParam() {
        return endParam;
    }

    /**
     * Sets the value of the endParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndParam(Double value) {
        this.endParam = value;
    }

}
