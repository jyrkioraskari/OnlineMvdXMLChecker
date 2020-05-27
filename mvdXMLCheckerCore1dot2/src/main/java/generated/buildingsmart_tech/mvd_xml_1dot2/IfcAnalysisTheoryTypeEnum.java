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
 * <p>Java class for IfcAnalysisTheoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcAnalysisTheoryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="first_order_theory"/>
 *     &lt;enumeration value="second_order_theory"/>
 *     &lt;enumeration value="third_order_theory"/>
 *     &lt;enumeration value="full_nonlinear_theory"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcAnalysisTheoryTypeEnum")
@XmlEnum
public enum IfcAnalysisTheoryTypeEnum {

    @XmlEnumValue("first_order_theory")
    FIRST_ORDER_THEORY("first_order_theory"),
    @XmlEnumValue("second_order_theory")
    SECOND_ORDER_THEORY("second_order_theory"),
    @XmlEnumValue("third_order_theory")
    THIRD_ORDER_THEORY("third_order_theory"),
    @XmlEnumValue("full_nonlinear_theory")
    FULL_NONLINEAR_THEORY("full_nonlinear_theory"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcAnalysisTheoryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcAnalysisTheoryTypeEnum fromValue(String v) {
        for (IfcAnalysisTheoryTypeEnum c: IfcAnalysisTheoryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
