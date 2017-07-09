
package com.kyle.microservices.service.userLogin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="currentPassword" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hasLoggedOut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastUpdatedStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastUpdatedTxStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="partyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="successiveFailedLogins" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="userLoginId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdTxStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "eeval-UserLogin")
public class EevalUserLogin {

    @XmlAttribute(name = "currentPassword")
    protected String currentPassword;
    @XmlAttribute(name = "enabled")
    protected String enabled;
    @XmlAttribute(name = "hasLoggedOut")
    protected String hasLoggedOut;
    @XmlAttribute(name = "lastUpdatedStamp")
    protected String lastUpdatedStamp;
    @XmlAttribute(name = "lastUpdatedTxStamp")
    protected String lastUpdatedTxStamp;
    @XmlAttribute(name = "partyId")
    protected String partyId;
    @XmlAttribute(name = "successiveFailedLogins")
    protected String successiveFailedLogins;
    @XmlAttribute(name = "userLoginId")
    protected String userLoginId;
    @XmlAttribute(name = "createdStamp")
    protected String createdStamp;
    @XmlAttribute(name = "createdTxStamp")
    protected String createdTxStamp;

    /**
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the hasLoggedOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasLoggedOut() {
        return hasLoggedOut;
    }

    /**
     * Sets the value of the hasLoggedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasLoggedOut(String value) {
        this.hasLoggedOut = value;
    }

    /**
     * Gets the value of the lastUpdatedStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    /**
     * Sets the value of the lastUpdatedStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedStamp(String value) {
        this.lastUpdatedStamp = value;
    }

    /**
     * Gets the value of the lastUpdatedTxStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    /**
     * Sets the value of the lastUpdatedTxStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTxStamp(String value) {
        this.lastUpdatedTxStamp = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the successiveFailedLogins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessiveFailedLogins() {
        return successiveFailedLogins;
    }

    /**
     * Sets the value of the successiveFailedLogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessiveFailedLogins(String value) {
        this.successiveFailedLogins = value;
    }

    /**
     * Gets the value of the userLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginId() {
        return userLoginId;
    }

    /**
     * Sets the value of the userLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginId(String value) {
        this.userLoginId = value;
    }

    /**
     * Gets the value of the createdStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedStamp() {
        return createdStamp;
    }

    /**
     * Sets the value of the createdStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedStamp(String value) {
        this.createdStamp = value;
    }

    /**
     * Gets the value of the createdTxStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTxStamp() {
        return createdTxStamp;
    }

    /**
     * Sets the value of the createdTxStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTxStamp(String value) {
        this.createdTxStamp = value;
    }

}
