//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcLayerSetDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcLayerSetDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="axis1"/>
 *     &lt;enumeration value="axis2"/>
 *     &lt;enumeration value="axis3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcLayerSetDirectionEnum")
@XmlEnum
public enum IfcLayerSetDirectionEnum {

    @XmlEnumValue("axis1")
    AXIS_1("axis1"),
    @XmlEnumValue("axis2")
    AXIS_2("axis2"),
    @XmlEnumValue("axis3")
    AXIS_3("axis3");
    private final String value;

    IfcLayerSetDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcLayerSetDirectionEnum fromValue(String v) {
        for (IfcLayerSetDirectionEnum c: IfcLayerSetDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
