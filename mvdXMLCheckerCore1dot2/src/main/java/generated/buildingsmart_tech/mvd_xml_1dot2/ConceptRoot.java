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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConceptRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
 *         &lt;element name="Applicability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
 *                   &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.2}GenericReference"/>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}TemplateRules"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Specializations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
 *                   &lt;element name="Specialization" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
 *                             &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}ConceptRoot" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Concepts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}Concept" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.2}identity"/>
 *       &lt;attribute name="applicableRootEntity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="minOccurrence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="maxOccurrence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptRoot", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", propOrder = {
    "definitions",
    "applicability",
    "specializations",
    "concepts"
})
public class ConceptRoot {

    @XmlElement(name = "Definitions")
    protected Definitions definitions;
    @XmlElement(name = "Applicability")
    protected ConceptRoot.Applicability applicability;
    @XmlElement(name = "Specializations")
    protected ConceptRoot.Specializations specializations;
    @XmlElement(name = "Concepts")
    protected ConceptRoot.Concepts concepts;
    @XmlAttribute(name = "applicableRootEntity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String applicableRootEntity;
    @XmlAttribute(name = "minOccurrence")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurrence;
    @XmlAttribute(name = "maxOccurrence")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxOccurrence;
    @XmlAttribute(name = "uuid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String uuid;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlAttribute(name = "code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String code;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String version;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "author")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String author;
    @XmlAttribute(name = "owner")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String owner;
    @XmlAttribute(name = "copyright")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String copyright;

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link Definitions }
     *     
     */
    public Definitions getDefinitions() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definitions }
     *     
     */
    public void setDefinitions(Definitions value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptRoot.Applicability }
     *     
     */
    public ConceptRoot.Applicability getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptRoot.Applicability }
     *     
     */
    public void setApplicability(ConceptRoot.Applicability value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the specializations property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptRoot.Specializations }
     *     
     */
    public ConceptRoot.Specializations getSpecializations() {
        return specializations;
    }

    /**
     * Sets the value of the specializations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptRoot.Specializations }
     *     
     */
    public void setSpecializations(ConceptRoot.Specializations value) {
        this.specializations = value;
    }

    /**
     * Gets the value of the concepts property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptRoot.Concepts }
     *     
     */
    public ConceptRoot.Concepts getConcepts() {
        return concepts;
    }

    /**
     * Sets the value of the concepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptRoot.Concepts }
     *     
     */
    public void setConcepts(ConceptRoot.Concepts value) {
        this.concepts = value;
    }

    /**
     * Gets the value of the applicableRootEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableRootEntity() {
        return applicableRootEntity;
    }

    /**
     * Sets the value of the applicableRootEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableRootEntity(String value) {
        this.applicableRootEntity = value;
    }

    /**
     * Gets the value of the minOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccurrence() {
        return minOccurrence;
    }

    /**
     * Sets the value of the minOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccurrence(BigInteger value) {
        this.minOccurrence = value;
    }

    /**
     * Gets the value of the maxOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccurrence() {
        return maxOccurrence;
    }

    /**
     * Sets the value of the maxOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccurrence(BigInteger value) {
        this.maxOccurrence = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
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
     *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
     *         &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.2}GenericReference"/>
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}TemplateRules"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "definitions",
        "template",
        "templateRules"
    })
    public static class Applicability {

        @XmlElement(name = "Definitions", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2")
        protected Definitions definitions;
        @XmlElement(name = "Template", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true)
        protected GenericReference template;
        @XmlElement(name = "TemplateRules", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true)
        protected TemplateRules templateRules;

        /**
         * Gets the value of the definitions property.
         * 
         * @return
         *     possible object is
         *     {@link Definitions }
         *     
         */
        public Definitions getDefinitions() {
            return definitions;
        }

        /**
         * Sets the value of the definitions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Definitions }
         *     
         */
        public void setDefinitions(Definitions value) {
            this.definitions = value;
        }

        /**
         * Gets the value of the template property.
         * 
         * @return
         *     possible object is
         *     {@link GenericReference }
         *     
         */
        public GenericReference getTemplate() {
            return template;
        }

        /**
         * Sets the value of the template property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericReference }
         *     
         */
        public void setTemplate(GenericReference value) {
            this.template = value;
        }

        /**
         * Gets the value of the templateRules property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateRules }
         *     
         */
        public TemplateRules getTemplateRules() {
            return templateRules;
        }

        /**
         * Sets the value of the templateRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateRules }
         *     
         */
        public void setTemplateRules(TemplateRules value) {
            this.templateRules = value;
        }

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
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}Concept" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "concept"
    })
    public static class Concepts {

        @XmlElement(name = "Concept", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2", required = true)
        protected List<Concept> concept;

        /**
         * Each Concept indicates use of a particular template for the applicable root entity.Gets the value of the concept property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concept property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcept().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Concept }
         * 
         * 
         */
        public List<Concept> getConcept() {
            if (concept == null) {
                concept = new ArrayList<Concept>();
            }
            return this.concept;
        }

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
     *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
     *         &lt;element name="Specialization" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
     *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}ConceptRoot" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "definitions",
        "specialization"
    })
    public static class Specializations {

        @XmlElement(name = "Definitions", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2")
        protected Definitions definitions;
        @XmlElement(name = "Specialization", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2")
        protected ConceptRoot.Specializations.Specialization specialization;

        /**
         * Gets the value of the definitions property.
         * 
         * @return
         *     possible object is
         *     {@link Definitions }
         *     
         */
        public Definitions getDefinitions() {
            return definitions;
        }

        /**
         * Sets the value of the definitions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Definitions }
         *     
         */
        public void setDefinitions(Definitions value) {
            this.definitions = value;
        }

        /**
         * Gets the value of the specialization property.
         * 
         * @return
         *     possible object is
         *     {@link ConceptRoot.Specializations.Specialization }
         *     
         */
        public ConceptRoot.Specializations.Specialization getSpecialization() {
            return specialization;
        }

        /**
         * Sets the value of the specialization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConceptRoot.Specializations.Specialization }
         *     
         */
        public void setSpecialization(ConceptRoot.Specializations.Specialization value) {
            this.specialization = value;
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
         *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.2}Definitions" minOccurs="0"/>
         *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.2}ConceptRoot" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "definitions",
            "conceptRoot"
        })
        public static class Specialization {

            @XmlElement(name = "Definitions", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2")
            protected Definitions definitions;
            @XmlElement(name = "ConceptRoot", namespace = "http://buildingsmart-tech.org/mvd/XML/1.2")
            protected ConceptRoot conceptRoot;
            @XmlAttribute(name = "override")
            protected Boolean override;

            /**
             * Gets the value of the definitions property.
             * 
             * @return
             *     possible object is
             *     {@link Definitions }
             *     
             */
            public Definitions getDefinitions() {
                return definitions;
            }

            /**
             * Sets the value of the definitions property.
             * 
             * @param value
             *     allowed object is
             *     {@link Definitions }
             *     
             */
            public void setDefinitions(Definitions value) {
                this.definitions = value;
            }

            /**
             * Gets the value of the conceptRoot property.
             * 
             * @return
             *     possible object is
             *     {@link ConceptRoot }
             *     
             */
            public ConceptRoot getConceptRoot() {
                return conceptRoot;
            }

            /**
             * Sets the value of the conceptRoot property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConceptRoot }
             *     
             */
            public void setConceptRoot(ConceptRoot value) {
                this.conceptRoot = value;
            }

            /**
             * Gets the value of the override property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isOverride() {
                if (override == null) {
                    return false;
                } else {
                    return override;
                }
            }

            /**
             * Sets the value of the override property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverride(Boolean value) {
                this.override = value;
            }

        }

    }

}