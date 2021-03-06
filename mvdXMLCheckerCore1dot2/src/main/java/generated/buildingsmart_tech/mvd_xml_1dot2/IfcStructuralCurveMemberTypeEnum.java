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
 * <p>Java class for IfcStructuralCurveMemberTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcStructuralCurveMemberTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rigid_joined_member"/>
 *     &lt;enumeration value="pin_joined_member"/>
 *     &lt;enumeration value="cable"/>
 *     &lt;enumeration value="tension_member"/>
 *     &lt;enumeration value="compression_member"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcStructuralCurveMemberTypeEnum")
@XmlEnum
public enum IfcStructuralCurveMemberTypeEnum {

    @XmlEnumValue("rigid_joined_member")
    RIGID_JOINED_MEMBER("rigid_joined_member"),
    @XmlEnumValue("pin_joined_member")
    PIN_JOINED_MEMBER("pin_joined_member"),
    @XmlEnumValue("cable")
    CABLE("cable"),
    @XmlEnumValue("tension_member")
    TENSION_MEMBER("tension_member"),
    @XmlEnumValue("compression_member")
    COMPRESSION_MEMBER("compression_member"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcStructuralCurveMemberTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcStructuralCurveMemberTypeEnum fromValue(String v) {
        for (IfcStructuralCurveMemberTypeEnum c: IfcStructuralCurveMemberTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
