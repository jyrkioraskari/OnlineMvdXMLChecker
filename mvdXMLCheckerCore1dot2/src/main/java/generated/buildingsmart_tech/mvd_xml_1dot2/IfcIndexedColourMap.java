//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcIndexedColourMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcIndexedColourMap">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPresentationItem">
 *       &lt;sequence>
 *         &lt;element name="Colours" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcColourRgbList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Opacity" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcNormalisedRatioMeasure" />
 *       &lt;attribute name="ColourIndex">
 *         &lt;simpleType>
 *           &lt;restriction>
 *             &lt;simpleType>
 *               &lt;list itemType="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveInteger" />
 *             &lt;/simpleType>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcIndexedColourMap", propOrder = {
    "colours"
})
public class IfcIndexedColourMap
    extends IfcPresentationItem
{

    @XmlElement(name = "Colours", required = true, nillable = true)
    protected IfcColourRgbList colours;
    @XmlAttribute(name = "Opacity")
    protected Double opacity;
    @XmlAttribute(name = "ColourIndex")
    protected List<Long> colourIndex;

    /**
     * Gets the value of the colours property.
     * 
     * @return
     *     possible object is
     *     {@link IfcColourRgbList }
     *     
     */
    public IfcColourRgbList getColours() {
        return colours;
    }

    /**
     * Sets the value of the colours property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcColourRgbList }
     *     
     */
    public void setColours(IfcColourRgbList value) {
        this.colours = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpacity(Double value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the colourIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colourIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColourIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getColourIndex() {
        if (colourIndex == null) {
            colourIndex = new ArrayList<Long>();
        }
        return this.colourIndex;
    }

}
