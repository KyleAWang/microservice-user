
package com.kyle.microservices.service.userLogin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for map-Key complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="map-Key"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{http://ofbiz.apache.org/service/}std-String"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "map-Key", propOrder = {

})
public class MapKey {

    @XmlElement(name = "std-String", required = true)
    protected StdString stdString;

    /**
     * Gets the value of the stdString property.
     * 
     * @return
     *     possible object is
     *     {@link StdString }
     *     
     */
    public StdString getStdString() {
        return stdString;
    }

    /**
     * Sets the value of the stdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdString }
     *     
     */
    public void setStdString(StdString value) {
        this.stdString = value;
    }

}
