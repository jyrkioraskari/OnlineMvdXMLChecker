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
 * <p>Java class for IfcAlarmTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcAlarmTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bell"/>
 *     &lt;enumeration value="breakglassbutton"/>
 *     &lt;enumeration value="light"/>
 *     &lt;enumeration value="manualpullbox"/>
 *     &lt;enumeration value="siren"/>
 *     &lt;enumeration value="whistle"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcAlarmTypeEnum")
@XmlEnum
public enum IfcAlarmTypeEnum {

    @XmlEnumValue("bell")
    BELL("bell"),
    @XmlEnumValue("breakglassbutton")
    BREAKGLASSBUTTON("breakglassbutton"),
    @XmlEnumValue("light")
    LIGHT("light"),
    @XmlEnumValue("manualpullbox")
    MANUALPULLBOX("manualpullbox"),
    @XmlEnumValue("siren")
    SIREN("siren"),
    @XmlEnumValue("whistle")
    WHISTLE("whistle"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcAlarmTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcAlarmTypeEnum fromValue(String v) {
        for (IfcAlarmTypeEnum c: IfcAlarmTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
