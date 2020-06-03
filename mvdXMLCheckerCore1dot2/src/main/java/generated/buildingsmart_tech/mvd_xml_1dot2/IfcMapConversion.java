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
 * <p>Java class for IfcMapConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMapConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCoordinateOperation">
 *       &lt;attribute name="Eastings" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="Northings" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="OrthogonalHeight" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="XAxisAbscissa" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcReal" />
 *       &lt;attribute name="XAxisOrdinate" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcReal" />
 *       &lt;attribute name="Scale" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcReal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMapConversion")
public class IfcMapConversion
    extends IfcCoordinateOperation
{

    @XmlAttribute(name = "Eastings")
    protected Double eastings;
    @XmlAttribute(name = "Northings")
    protected Double northings;
    @XmlAttribute(name = "OrthogonalHeight")
    protected Double orthogonalHeight;
    @XmlAttribute(name = "XAxisAbscissa")
    protected Double xAxisAbscissa;
    @XmlAttribute(name = "XAxisOrdinate")
    protected Double xAxisOrdinate;
    @XmlAttribute(name = "Scale")
    protected Double scale;

    /**
     * Gets the value of the eastings property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEastings() {
        return eastings;
    }

    /**
     * Sets the value of the eastings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEastings(Double value) {
        this.eastings = value;
    }

    /**
     * Gets the value of the northings property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNorthings() {
        return northings;
    }

    /**
     * Sets the value of the northings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNorthings(Double value) {
        this.northings = value;
    }

    /**
     * Gets the value of the orthogonalHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrthogonalHeight() {
        return orthogonalHeight;
    }

    /**
     * Sets the value of the orthogonalHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrthogonalHeight(Double value) {
        this.orthogonalHeight = value;
    }

    /**
     * Gets the value of the xAxisAbscissa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisAbscissa() {
        return xAxisAbscissa;
    }

    /**
     * Sets the value of the xAxisAbscissa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisAbscissa(Double value) {
        this.xAxisAbscissa = value;
    }

    /**
     * Gets the value of the xAxisOrdinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisOrdinate() {
        return xAxisOrdinate;
    }

    /**
     * Sets the value of the xAxisOrdinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisOrdinate(Double value) {
        this.xAxisOrdinate = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScale(Double value) {
        this.scale = value;
    }

}