//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 12:23:44 AM GST 
//


package com.liconic.binding.sys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STXCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STXCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cmd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GetCmdStatus"/>
 *               &lt;enumeration value="GetSTXInfo"/>
 *               &lt;enumeration value="GetPlateInfo"/>
 *               &lt;enumeration value="GetTubeInfo"/>
 *               &lt;enumeration value="StorePlate"/>
 *               &lt;enumeration value="RetrievePlate"/>
 *               &lt;enumeration value="PickTubes"/>
 *               &lt;enumeration value="Inventory"/>
 *               &lt;enumeration value="ReadyForStorePlate"/>
 *               &lt;enumeration value="ReadyForRetrievePlate"/>
 *               &lt;enumeration value="AbortCmd"/>
 *               &lt;enumeration value="Activate"/>
 *               &lt;enumeration value="Deactivate"/>
 *               &lt;enumeration value="GetDeviceStatus"/>
 *               &lt;enumeration value="GetSystemStatus"/>
 *               &lt;enumeration value="GetCommandsInfo"/>
 *               &lt;enumeration value="GetPartitionPlatesList"/>
 *               &lt;enumeration value="GetPartitionTubesList"/>
 *               &lt;enumeration value="Consolidate"/>
 *               &lt;enumeration value="MoveTubes"/>
 *               &lt;enumeration value="GetUpdateMessage"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transferstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{}STXParameter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXCommand", propOrder = {
    "id",
    "cmd",
    "user",
    "partition",
    "transferstation",
    "parameters"
})
public class STXCommand {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Cmd", required = true)
    protected String cmd;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "Partition")
    protected String partition;
    @XmlElement(name = "Transferstation")
    protected String transferstation;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected List<STXParameter> parameters;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * Sets the value of the cmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmd(String value) {
        this.cmd = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartition(String value) {
        this.partition = value;
    }

    /**
     * Gets the value of the transferstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferstation() {
        return transferstation;
    }

    /**
     * Sets the value of the transferstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferstation(String value) {
        this.transferstation = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXParameter }
     * 
     * 
     */
    public List<STXParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<STXParameter>();
        }
        return this.parameters;
    }

}
