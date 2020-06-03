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
 * <p>Java class for IfcPile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPile">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcBuildingElement">
 *       &lt;attribute name="PredefinedType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPileTypeEnum" />
 *       &lt;attribute name="ConstructionType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPileConstructionEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPile")
public class IfcPile
    extends IfcBuildingElement
{

    @XmlAttribute(name = "PredefinedType")
    protected IfcPileTypeEnum predefinedType;
    @XmlAttribute(name = "ConstructionType")
    protected IfcPileConstructionEnum constructionType;

    /**
     * Gets the value of the predefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPileTypeEnum }
     *     
     */
    public IfcPileTypeEnum getPredefinedType() {
        return predefinedType;
    }

    /**
     * Sets the value of the predefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPileTypeEnum }
     *     
     */
    public void setPredefinedType(IfcPileTypeEnum value) {
        this.predefinedType = value;
    }

    /**
     * Gets the value of the constructionType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPileConstructionEnum }
     *     
     */
    public IfcPileConstructionEnum getConstructionType() {
        return constructionType;
    }

    /**
     * Sets the value of the constructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPileConstructionEnum }
     *     
     */
    public void setConstructionType(IfcPileConstructionEnum value) {
        this.constructionType = value;
    }

}