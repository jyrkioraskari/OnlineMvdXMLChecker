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
 * <p>Java class for IfcPropertySetTemplateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcPropertySetTemplateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pset_typedrivenonly"/>
 *     &lt;enumeration value="pset_typedrivenoverride"/>
 *     &lt;enumeration value="pset_occurrencedriven"/>
 *     &lt;enumeration value="pset_performancedriven"/>
 *     &lt;enumeration value="qto_typedrivenonly"/>
 *     &lt;enumeration value="qto_typedrivenoverride"/>
 *     &lt;enumeration value="qto_occurrencedriven"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcPropertySetTemplateTypeEnum")
@XmlEnum
public enum IfcPropertySetTemplateTypeEnum {

    @XmlEnumValue("pset_typedrivenonly")
    PSET_TYPEDRIVENONLY("pset_typedrivenonly"),
    @XmlEnumValue("pset_typedrivenoverride")
    PSET_TYPEDRIVENOVERRIDE("pset_typedrivenoverride"),
    @XmlEnumValue("pset_occurrencedriven")
    PSET_OCCURRENCEDRIVEN("pset_occurrencedriven"),
    @XmlEnumValue("pset_performancedriven")
    PSET_PERFORMANCEDRIVEN("pset_performancedriven"),
    @XmlEnumValue("qto_typedrivenonly")
    QTO_TYPEDRIVENONLY("qto_typedrivenonly"),
    @XmlEnumValue("qto_typedrivenoverride")
    QTO_TYPEDRIVENOVERRIDE("qto_typedrivenoverride"),
    @XmlEnumValue("qto_occurrencedriven")
    QTO_OCCURRENCEDRIVEN("qto_occurrencedriven"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcPropertySetTemplateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcPropertySetTemplateTypeEnum fromValue(String v) {
        for (IfcPropertySetTemplateTypeEnum c: IfcPropertySetTemplateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
