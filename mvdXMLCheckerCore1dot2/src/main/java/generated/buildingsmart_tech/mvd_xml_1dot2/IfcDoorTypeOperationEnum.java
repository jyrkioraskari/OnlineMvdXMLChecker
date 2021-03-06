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
 * <p>Java class for IfcDoorTypeOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcDoorTypeOperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single_swing_left"/>
 *     &lt;enumeration value="single_swing_right"/>
 *     &lt;enumeration value="double_door_single_swing"/>
 *     &lt;enumeration value="double_door_single_swing_opposite_left"/>
 *     &lt;enumeration value="double_door_single_swing_opposite_right"/>
 *     &lt;enumeration value="double_swing_left"/>
 *     &lt;enumeration value="double_swing_right"/>
 *     &lt;enumeration value="double_door_double_swing"/>
 *     &lt;enumeration value="sliding_to_left"/>
 *     &lt;enumeration value="sliding_to_right"/>
 *     &lt;enumeration value="double_door_sliding"/>
 *     &lt;enumeration value="folding_to_left"/>
 *     &lt;enumeration value="folding_to_right"/>
 *     &lt;enumeration value="double_door_folding"/>
 *     &lt;enumeration value="revolving"/>
 *     &lt;enumeration value="rollingup"/>
 *     &lt;enumeration value="swing_fixed_left"/>
 *     &lt;enumeration value="swing_fixed_right"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcDoorTypeOperationEnum")
@XmlEnum
public enum IfcDoorTypeOperationEnum {

    @XmlEnumValue("single_swing_left")
    SINGLE_SWING_LEFT("single_swing_left"),
    @XmlEnumValue("single_swing_right")
    SINGLE_SWING_RIGHT("single_swing_right"),
    @XmlEnumValue("double_door_single_swing")
    DOUBLE_DOOR_SINGLE_SWING("double_door_single_swing"),
    @XmlEnumValue("double_door_single_swing_opposite_left")
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_LEFT("double_door_single_swing_opposite_left"),
    @XmlEnumValue("double_door_single_swing_opposite_right")
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_RIGHT("double_door_single_swing_opposite_right"),
    @XmlEnumValue("double_swing_left")
    DOUBLE_SWING_LEFT("double_swing_left"),
    @XmlEnumValue("double_swing_right")
    DOUBLE_SWING_RIGHT("double_swing_right"),
    @XmlEnumValue("double_door_double_swing")
    DOUBLE_DOOR_DOUBLE_SWING("double_door_double_swing"),
    @XmlEnumValue("sliding_to_left")
    SLIDING_TO_LEFT("sliding_to_left"),
    @XmlEnumValue("sliding_to_right")
    SLIDING_TO_RIGHT("sliding_to_right"),
    @XmlEnumValue("double_door_sliding")
    DOUBLE_DOOR_SLIDING("double_door_sliding"),
    @XmlEnumValue("folding_to_left")
    FOLDING_TO_LEFT("folding_to_left"),
    @XmlEnumValue("folding_to_right")
    FOLDING_TO_RIGHT("folding_to_right"),
    @XmlEnumValue("double_door_folding")
    DOUBLE_DOOR_FOLDING("double_door_folding"),
    @XmlEnumValue("revolving")
    REVOLVING("revolving"),
    @XmlEnumValue("rollingup")
    ROLLINGUP("rollingup"),
    @XmlEnumValue("swing_fixed_left")
    SWING_FIXED_LEFT("swing_fixed_left"),
    @XmlEnumValue("swing_fixed_right")
    SWING_FIXED_RIGHT("swing_fixed_right"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcDoorTypeOperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcDoorTypeOperationEnum fromValue(String v) {
        for (IfcDoorTypeOperationEnum c: IfcDoorTypeOperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
