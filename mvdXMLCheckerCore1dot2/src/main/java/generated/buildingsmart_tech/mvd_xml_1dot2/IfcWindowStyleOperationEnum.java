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
 * <p>Java class for IfcWindowStyleOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcWindowStyleOperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single_panel"/>
 *     &lt;enumeration value="double_panel_vertical"/>
 *     &lt;enumeration value="double_panel_horizontal"/>
 *     &lt;enumeration value="triple_panel_vertical"/>
 *     &lt;enumeration value="triple_panel_bottom"/>
 *     &lt;enumeration value="triple_panel_top"/>
 *     &lt;enumeration value="triple_panel_left"/>
 *     &lt;enumeration value="triple_panel_right"/>
 *     &lt;enumeration value="triple_panel_horizontal"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcWindowStyleOperationEnum")
@XmlEnum
public enum IfcWindowStyleOperationEnum {

    @XmlEnumValue("single_panel")
    SINGLE_PANEL("single_panel"),
    @XmlEnumValue("double_panel_vertical")
    DOUBLE_PANEL_VERTICAL("double_panel_vertical"),
    @XmlEnumValue("double_panel_horizontal")
    DOUBLE_PANEL_HORIZONTAL("double_panel_horizontal"),
    @XmlEnumValue("triple_panel_vertical")
    TRIPLE_PANEL_VERTICAL("triple_panel_vertical"),
    @XmlEnumValue("triple_panel_bottom")
    TRIPLE_PANEL_BOTTOM("triple_panel_bottom"),
    @XmlEnumValue("triple_panel_top")
    TRIPLE_PANEL_TOP("triple_panel_top"),
    @XmlEnumValue("triple_panel_left")
    TRIPLE_PANEL_LEFT("triple_panel_left"),
    @XmlEnumValue("triple_panel_right")
    TRIPLE_PANEL_RIGHT("triple_panel_right"),
    @XmlEnumValue("triple_panel_horizontal")
    TRIPLE_PANEL_HORIZONTAL("triple_panel_horizontal"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcWindowStyleOperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcWindowStyleOperationEnum fromValue(String v) {
        for (IfcWindowStyleOperationEnum c: IfcWindowStyleOperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
