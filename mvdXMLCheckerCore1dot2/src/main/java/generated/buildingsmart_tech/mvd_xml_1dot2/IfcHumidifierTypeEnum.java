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
 * <p>Java class for IfcHumidifierTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcHumidifierTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="steaminjection"/>
 *     &lt;enumeration value="adiabaticairwasher"/>
 *     &lt;enumeration value="adiabaticpan"/>
 *     &lt;enumeration value="adiabaticwettedelement"/>
 *     &lt;enumeration value="adiabaticatomizing"/>
 *     &lt;enumeration value="adiabaticultrasonic"/>
 *     &lt;enumeration value="adiabaticrigidmedia"/>
 *     &lt;enumeration value="adiabaticcompressedairnozzle"/>
 *     &lt;enumeration value="assistedelectric"/>
 *     &lt;enumeration value="assistednaturalgas"/>
 *     &lt;enumeration value="assistedpropane"/>
 *     &lt;enumeration value="assistedbutane"/>
 *     &lt;enumeration value="assistedsteam"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcHumidifierTypeEnum")
@XmlEnum
public enum IfcHumidifierTypeEnum {

    @XmlEnumValue("steaminjection")
    STEAMINJECTION("steaminjection"),
    @XmlEnumValue("adiabaticairwasher")
    ADIABATICAIRWASHER("adiabaticairwasher"),
    @XmlEnumValue("adiabaticpan")
    ADIABATICPAN("adiabaticpan"),
    @XmlEnumValue("adiabaticwettedelement")
    ADIABATICWETTEDELEMENT("adiabaticwettedelement"),
    @XmlEnumValue("adiabaticatomizing")
    ADIABATICATOMIZING("adiabaticatomizing"),
    @XmlEnumValue("adiabaticultrasonic")
    ADIABATICULTRASONIC("adiabaticultrasonic"),
    @XmlEnumValue("adiabaticrigidmedia")
    ADIABATICRIGIDMEDIA("adiabaticrigidmedia"),
    @XmlEnumValue("adiabaticcompressedairnozzle")
    ADIABATICCOMPRESSEDAIRNOZZLE("adiabaticcompressedairnozzle"),
    @XmlEnumValue("assistedelectric")
    ASSISTEDELECTRIC("assistedelectric"),
    @XmlEnumValue("assistednaturalgas")
    ASSISTEDNATURALGAS("assistednaturalgas"),
    @XmlEnumValue("assistedpropane")
    ASSISTEDPROPANE("assistedpropane"),
    @XmlEnumValue("assistedbutane")
    ASSISTEDBUTANE("assistedbutane"),
    @XmlEnumValue("assistedsteam")
    ASSISTEDSTEAM("assistedsteam"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcHumidifierTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcHumidifierTypeEnum fromValue(String v) {
        for (IfcHumidifierTypeEnum c: IfcHumidifierTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
