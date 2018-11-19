//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 12:23:44 AM GST 
//
package com.liconic.binding.stx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for STXPartition complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="STXPartition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartUserId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartFolder" type="{}STXFolder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartCassId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PartLvlId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlateTypes" type="{}STXPlateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXPartition", propOrder = {
    "name",
    "partUserId",
    "partFolder",
    "partCassId",
    "id",
    "partLvlId",
    "plateTypes"
})
public class STXPartition {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "PartUserId", nillable = true)
    protected List<Integer> partUserId;
    @XmlElement(name = "PartFolder", nillable = true)
    protected List<STXFolder> partFolder;
    @XmlElement(name = "PartCassId", type = Integer.class)
    protected List<Integer> partCassId;
    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElement(name = "PartLvlId", type = Integer.class)
    protected List<Integer> partLvlId;
    @XmlElement(name = "PlateTypes")
    protected List<STXPlateType> plateTypes;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the partUserId property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the partUserId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartUserId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Integer }
     *
     *
     */
    public List<Integer> getPartUserId() {
        if (partUserId == null) {
            partUserId = new ArrayList<Integer>();
        }
        return this.partUserId;
    }

    /**
     * Gets the value of the partFolder property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the partFolder property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartFolder().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXFolder }
     *
     *
     */
    public List<STXFolder> getPartFolder() {
        if (partFolder == null) {
            partFolder = new ArrayList<STXFolder>();
        }
        return this.partFolder;
    }

    /**
     * Gets the value of the partCassId property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the partCassId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartCassId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Integer }
     *
     *
     */
    public List<Integer> getPartCassId() {
        if (partCassId == null) {
            partCassId = new ArrayList<Integer>();
        }
        return this.partCassId;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the partLvlId property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the partLvlId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartLvlId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Integer }
     *
     *
     */
    public List<Integer> getPartLvlId() {
        if (partLvlId == null) {
            partLvlId = new ArrayList<Integer>();
        }
        return this.partLvlId;
    }

    /**
     * Gets the value of the plateTypes property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the plateTypes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlateTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXPlateType }
     *
     *
     */
    public List<STXPlateType> getPlateTypes() {
        if (plateTypes == null) {
            plateTypes = new ArrayList<STXPlateType>();
        }
        return this.plateTypes;
    }

}
