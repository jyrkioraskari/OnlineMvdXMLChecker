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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcProjectedCRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcProjectedCRS">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCoordinateReferenceSystem">
 *       &lt;sequence>
 *         &lt;element name="MapUnit" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNamedUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MapProjection" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIdentifier" />
 *       &lt;attribute name="MapZone" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcIdentifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcProjectedCRS", propOrder = {
    "mapUnit"
})
public class IfcProjectedCRS
    extends IfcCoordinateReferenceSystem
{

    @XmlElementRef(name = "MapUnit", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcNamedUnit> mapUnit;
    @XmlAttribute(name = "MapProjection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mapProjection;
    @XmlAttribute(name = "MapZone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mapZone;

    /**
     * Gets the value of the mapUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcNamedUnit }{@code >}
     *     
     */
    public JAXBElement<IfcNamedUnit> getMapUnit() {
        return mapUnit;
    }

    /**
     * Sets the value of the mapUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcNamedUnit }{@code >}
     *     
     */
    public void setMapUnit(JAXBElement<IfcNamedUnit> value) {
        this.mapUnit = value;
    }

    /**
     * Gets the value of the mapProjection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapProjection() {
        return mapProjection;
    }

    /**
     * Sets the value of the mapProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapProjection(String value) {
        this.mapProjection = value;
    }

    /**
     * Gets the value of the mapZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapZone() {
        return mapZone;
    }

    /**
     * Sets the value of the mapZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapZone(String value) {
        this.mapZone = value;
    }

}