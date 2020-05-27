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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcEdge">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcTopologicalRepresentationItem">
 *       &lt;sequence>
 *         &lt;element name="EdgeStart" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcVertex" minOccurs="0"/>
 *         &lt;element name="EdgeEnd" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcVertex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcEdge", propOrder = {
    "edgeStart",
    "edgeEnd"
})
@XmlSeeAlso({
    IfcEdgeCurve.class,
    IfcSubedge.class,
    IfcOrientedEdgeTemp.class
})
public class IfcEdge
    extends IfcTopologicalRepresentationItem
{

    @XmlElementRef(name = "EdgeStart", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcVertex> edgeStart;
    @XmlElementRef(name = "EdgeEnd", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcVertex> edgeEnd;

    /**
     * Gets the value of the edgeStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcVertex }{@code >}
     *     
     */
    public JAXBElement<IfcVertex> getEdgeStart() {
        return edgeStart;
    }

    /**
     * Sets the value of the edgeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcVertex }{@code >}
     *     
     */
    public void setEdgeStart(JAXBElement<IfcVertex> value) {
        this.edgeStart = value;
    }

    /**
     * Gets the value of the edgeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcVertex }{@code >}
     *     
     */
    public JAXBElement<IfcVertex> getEdgeEnd() {
        return edgeEnd;
    }

    /**
     * Sets the value of the edgeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcVertex }{@code >}
     *     
     */
    public void setEdgeEnd(JAXBElement<IfcVertex> value) {
        this.edgeEnd = value;
    }

}
