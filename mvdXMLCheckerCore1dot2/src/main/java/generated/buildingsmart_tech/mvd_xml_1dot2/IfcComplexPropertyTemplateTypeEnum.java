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
 * <p>Java class for IfcComplexPropertyTemplateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcComplexPropertyTemplateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="p_complex"/>
 *     &lt;enumeration value="q_complex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcComplexPropertyTemplateTypeEnum")
@XmlEnum
public enum IfcComplexPropertyTemplateTypeEnum {

    @XmlEnumValue("p_complex")
    P_COMPLEX("p_complex"),
    @XmlEnumValue("q_complex")
    Q_COMPLEX("q_complex");
    private final String value;

    IfcComplexPropertyTemplateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcComplexPropertyTemplateTypeEnum fromValue(String v) {
        for (IfcComplexPropertyTemplateTypeEnum c: IfcComplexPropertyTemplateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
