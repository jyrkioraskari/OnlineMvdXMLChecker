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
 * <p>Java class for IfcCoilTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcCoilTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dxcoolingcoil"/>
 *     &lt;enumeration value="electricheatingcoil"/>
 *     &lt;enumeration value="gasheatingcoil"/>
 *     &lt;enumeration value="hydroniccoil"/>
 *     &lt;enumeration value="steamheatingcoil"/>
 *     &lt;enumeration value="watercoolingcoil"/>
 *     &lt;enumeration value="waterheatingcoil"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcCoilTypeEnum")
@XmlEnum
public enum IfcCoilTypeEnum {

    @XmlEnumValue("dxcoolingcoil")
    DXCOOLINGCOIL("dxcoolingcoil"),
    @XmlEnumValue("electricheatingcoil")
    ELECTRICHEATINGCOIL("electricheatingcoil"),
    @XmlEnumValue("gasheatingcoil")
    GASHEATINGCOIL("gasheatingcoil"),
    @XmlEnumValue("hydroniccoil")
    HYDRONICCOIL("hydroniccoil"),
    @XmlEnumValue("steamheatingcoil")
    STEAMHEATINGCOIL("steamheatingcoil"),
    @XmlEnumValue("watercoolingcoil")
    WATERCOOLINGCOIL("watercoolingcoil"),
    @XmlEnumValue("waterheatingcoil")
    WATERHEATINGCOIL("waterheatingcoil"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcCoilTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcCoilTypeEnum fromValue(String v) {
        for (IfcCoilTypeEnum c: IfcCoilTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
