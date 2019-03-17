//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 12:23:44 AM GST 
//
package com.liconic.binding.stx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for STXTubeType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="STXTubeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbTHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TbTDiam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TbTInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXTubeType", propOrder = {
    "id",
    "name",
    "tbTHeight",
    "tbTDiam",
    "tbTInfo",
    "tbFixed"
})
public class STXTubeType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "TbTHeight")
    protected int tbTHeight;
    @XmlElement(name = "TbTDiam")
    protected int tbTDiam;
    @XmlElement(name = "TbTInfo", required = true)
    protected String tbTInfo;
    @XmlElement(name = "TbFixed")
    protected Boolean tbFixed;

    /**
     * Gets the value of the id property.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Gets the value of the tbTHeight property.
     *
     */
    public int getTbTHeight() {
        return tbTHeight;
    }

    /**
     * Sets the value of the tbTHeight property.
     *
     */
    public void setTbTHeight(int value) {
        this.tbTHeight = value;
    }

    /**
     * Gets the value of the tbTDiam property.
     *
     */
    public int getTbTDiam() {
        return tbTDiam;
    }

    /**
     * Sets the value of the tbTDiam property.
     *
     */
    public void setTbTDiam(int value) {
        this.tbTDiam = value;
    }

    /**
     * Gets the value of the tbTInfo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTbTInfo() {
        return tbTInfo;
    }

    /**
     * Sets the value of the tbTInfo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTbTInfo(String value) {
        this.tbTInfo = value;
    }

    /**
     * Gets the value of the tbFixed property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isTbFixed() {
        return tbFixed;
    }

    /**
     * Sets the value of the tbFixed property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setTbFixed(Boolean value) {
        this.tbFixed = value;
    }

}
