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
 * <p>Java class for IfcFailureConnectionCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcFailureConnectionCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcStructuralConnectionCondition">
 *       &lt;attribute name="TensionFailureX" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *       &lt;attribute name="TensionFailureY" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *       &lt;attribute name="TensionFailureZ" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *       &lt;attribute name="CompressionFailureX" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *       &lt;attribute name="CompressionFailureY" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *       &lt;attribute name="CompressionFailureZ" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcForceMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcFailureConnectionCondition")
public class IfcFailureConnectionCondition
    extends IfcStructuralConnectionCondition
{

    @XmlAttribute(name = "TensionFailureX")
    protected Double tensionFailureX;
    @XmlAttribute(name = "TensionFailureY")
    protected Double tensionFailureY;
    @XmlAttribute(name = "TensionFailureZ")
    protected Double tensionFailureZ;
    @XmlAttribute(name = "CompressionFailureX")
    protected Double compressionFailureX;
    @XmlAttribute(name = "CompressionFailureY")
    protected Double compressionFailureY;
    @XmlAttribute(name = "CompressionFailureZ")
    protected Double compressionFailureZ;

    /**
     * Gets the value of the tensionFailureX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTensionFailureX() {
        return tensionFailureX;
    }

    /**
     * Sets the value of the tensionFailureX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTensionFailureX(Double value) {
        this.tensionFailureX = value;
    }

    /**
     * Gets the value of the tensionFailureY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTensionFailureY() {
        return tensionFailureY;
    }

    /**
     * Sets the value of the tensionFailureY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTensionFailureY(Double value) {
        this.tensionFailureY = value;
    }

    /**
     * Gets the value of the tensionFailureZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTensionFailureZ() {
        return tensionFailureZ;
    }

    /**
     * Sets the value of the tensionFailureZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTensionFailureZ(Double value) {
        this.tensionFailureZ = value;
    }

    /**
     * Gets the value of the compressionFailureX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompressionFailureX() {
        return compressionFailureX;
    }

    /**
     * Sets the value of the compressionFailureX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompressionFailureX(Double value) {
        this.compressionFailureX = value;
    }

    /**
     * Gets the value of the compressionFailureY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompressionFailureY() {
        return compressionFailureY;
    }

    /**
     * Sets the value of the compressionFailureY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompressionFailureY(Double value) {
        this.compressionFailureY = value;
    }

    /**
     * Gets the value of the compressionFailureZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompressionFailureZ() {
        return compressionFailureZ;
    }

    /**
     * Sets the value of the compressionFailureZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompressionFailureZ(Double value) {
        this.compressionFailureZ = value;
    }

}
