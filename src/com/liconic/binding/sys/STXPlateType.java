//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 12:23:44 AM GST 
//


package com.liconic.binding.sys;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STXPlateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STXPlateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCavities" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TubeRack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXPlateType", propOrder = {
    "id",
    "name",
    "numCavities",
    "tubeRack",
    "height"
})
public class STXPlateType {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NumCavities", required = true)
    protected BigInteger numCavities;
    @XmlElement(name = "TubeRack")
    protected boolean tubeRack;
    @XmlElement(name = "Height")
    protected float height;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
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
     * Gets the value of the numCavities property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumCavities() {
        return numCavities;
    }

    /**
     * Sets the value of the numCavities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumCavities(BigInteger value) {
        this.numCavities = value;
    }

    /**
     * Gets the value of the tubeRack property.
     * 
     */
    public boolean isTubeRack() {
        return tubeRack;
    }

    /**
     * Sets the value of the tubeRack property.
     * 
     */
    public void setTubeRack(boolean value) {
        this.tubeRack = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

}
