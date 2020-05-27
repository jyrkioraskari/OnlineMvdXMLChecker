//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for IfcRelReferencedInSpatialStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRelReferencedInSpatialStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRelConnects">
 *       &lt;sequence>
 *         &lt;element name="RelatedElements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProduct" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcProduct""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="set""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRelReferencedInSpatialStructure", propOrder = {
    "relatedElements"
})
public class IfcRelReferencedInSpatialStructure
    extends IfcRelConnects
{

    @XmlElement(name = "RelatedElements", required = true)
    protected IfcRelReferencedInSpatialStructure.RelatedElements relatedElements;

    /**
     * Gets the value of the relatedElements property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRelReferencedInSpatialStructure.RelatedElements }
     *     
     */
    public IfcRelReferencedInSpatialStructure.RelatedElements getRelatedElements() {
        return relatedElements;
    }

    /**
     * Sets the value of the relatedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRelReferencedInSpatialStructure.RelatedElements }
     *     
     */
    public void setRelatedElements(IfcRelReferencedInSpatialStructure.RelatedElements value) {
        this.relatedElements = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProduct" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcProduct""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="set""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcProduct"
    })
    public static class RelatedElements {

        @XmlElementRef(name = "IfcProduct", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class)
        protected List<JAXBElement<? extends IfcProduct>> ifcProduct;
        @XmlAttribute(name = "itemType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<QName> itemType;
        @XmlAttribute(name = "cType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<AggregateType> cType;
        @XmlAttribute(name = "arraySize", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<BigInteger> arraySize;

        /**
         * Gets the value of the ifcProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link IfcCoil }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBuildingElementPart }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBeamStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPlateStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBoiler }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcOutlet }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricAppliance }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralReaction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWall }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralItem }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSlab }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDuctSegment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSolarDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralPlanarAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralMember }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMember }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricDistributionBoard }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcLightFixture }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBuilding }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWallElementedCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAirToAirHeatRecovery }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElementAssembly }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProduct }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPile }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcEngine }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcHumidifier }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTendon }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDiscreteAccessory }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDoor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSurfaceFeature }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricGenerator }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralPointReaction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMedicalDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcController }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPlate }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElementComponent }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFeatureElementSubtraction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowFitting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralActivity }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRampFlight }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionFlowElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDuctSilencer }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSpatialElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAirTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralSurfaceMember }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcOpeningStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBuildingElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCommunicationsAppliance }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcUnitaryControlElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcReinforcingElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFan }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCompressor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcVirtualElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWindow }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWindowStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBuildingElementProxy }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSystemFurnitureElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralConnection }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProtectiveDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRailing }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcChimney }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcGeographicElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCivilElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcInterceptor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowStorageDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricFlowStorageDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowInstrument }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAnnotation }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStairFlight }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCableCarrierSegment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowSegment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPump }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProjectionElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcUnitaryEquipment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCondenser }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWallStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFooting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcValve }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralCurveConnection }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDoorStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFilter }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcEvaporator }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcActuator }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcExternalSpatialElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFurnishingElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcVoidingFeature }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcOpeningElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcVibrationIsolator }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcColumnStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFireSuppressionTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcWasteTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcExternalSpatialStructureElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPort }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionPort }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMemberStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSpatialStructureElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBurner }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCableFitting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcGrid }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSwitchingDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFurniture }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCooledBeam }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralCurveReaction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcColumn }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStackTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSlabStandardCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTransformer }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricMotor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionControlElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowMovingDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralCurveMemberVarying }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcReinforcingMesh }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcShadingDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralCurveMember }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralSurfaceAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPipeFitting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTank }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSpace }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBeam }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralPointConnection }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralSurfaceConnection }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTendonAnchor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcEnergyConversionDevice }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCableCarrierFitting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSpaceHeater }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFeatureElementAddition }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralSurfaceMemberVarying }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSlabElementedCase }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFeatureElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowController }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCurtainWall }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDamper }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDistributionChamberElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralPointAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProtectiveDeviceTrippingUnit }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralSurfaceReaction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralCurveAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcHeatExchanger }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCovering }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcJunctionBox }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralLinearAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcPipeSegment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDuctFitting }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTubeBundle }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMotorConnection }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFastener }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTransportElement }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAlarm }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRoof }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSensor }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSite }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStructuralAction }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcStair }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAirTerminalBox }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCoolingTower }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcBuildingStorey }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProxy }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcElectricTimeControl }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRamp }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSanitaryTerminal }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcAudioVisualAppliance }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCableSegment }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcEvaporativeCooler }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcSpatialZone }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcReinforcingBar }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowMeter }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcChiller }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcLamp }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMechanicalFastener }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcFlowTreatmentDevice }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends IfcProduct>> getIfcProduct() {
            if (ifcProduct == null) {
                ifcProduct = new ArrayList<JAXBElement<? extends IfcProduct>>();
            }
            return this.ifcProduct;
        }

        /**
         * Gets the value of the itemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QName }
         * 
         * 
         */
        public List<QName> getItemType() {
            if (itemType == null) {
                itemType = new ArrayList<QName>();
            }
            return this.itemType;
        }

        /**
         * Gets the value of the cType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AggregateType }
         * 
         * 
         */
        public List<AggregateType> getCType() {
            if (cType == null) {
                cType = new ArrayList<AggregateType>();
            }
            return this.cType;
        }

        /**
         * Gets the value of the arraySize property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arraySize property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArraySize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getArraySize() {
            if (arraySize == null) {
                arraySize = new ArrayList<BigInteger>();
            }
            return this.arraySize;
        }

    }

}
