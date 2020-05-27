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
 * <p>Java class for IfcElementAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcElementAssembly">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcElement">
 *       &lt;attribute name="AssemblyPlace" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAssemblyPlaceEnum" />
 *       &lt;attribute name="PredefinedType" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcElementAssemblyTypeEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcElementAssembly")
public class IfcElementAssembly
    extends IfcElement
{

    @XmlAttribute(name = "AssemblyPlace")
    protected IfcAssemblyPlaceEnum assemblyPlace;
    @XmlAttribute(name = "PredefinedType")
    protected IfcElementAssemblyTypeEnum predefinedType;

    /**
     * Gets the value of the assemblyPlace property.
     * 
     * @return
     *     possible object is
     *     {@link IfcAssemblyPlaceEnum }
     *     
     */
    public IfcAssemblyPlaceEnum getAssemblyPlace() {
        return assemblyPlace;
    }

    /**
     * Sets the value of the assemblyPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcAssemblyPlaceEnum }
     *     
     */
    public void setAssemblyPlace(IfcAssemblyPlaceEnum value) {
        this.assemblyPlace = value;
    }

    /**
     * Gets the value of the predefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcElementAssemblyTypeEnum }
     *     
     */
    public IfcElementAssemblyTypeEnum getPredefinedType() {
        return predefinedType;
    }

    /**
     * Sets the value of the predefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcElementAssemblyTypeEnum }
     *     
     */
    public void setPredefinedType(IfcElementAssemblyTypeEnum value) {
        this.predefinedType = value;
    }

}
