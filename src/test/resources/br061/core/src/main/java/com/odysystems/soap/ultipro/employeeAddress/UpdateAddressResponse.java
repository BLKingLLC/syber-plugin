
package com.odysystems.soap.ultipro.employeeAddress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="UpdateAddressResult" type="{http://www.ultipro.com/contracts}AddressUpdateResponse" minOccurs="0"/>
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
    "updateAddressResult"
})
@XmlRootElement(name = "UpdateAddressResponse", namespace = "http://www.ultipro.com/services/employeeaddress")
public class UpdateAddressResponse {

    @XmlElementRef(name = "UpdateAddressResult", namespace = "http://www.ultipro.com/services/employeeaddress", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressUpdateResponse> updateAddressResult;

    /**
     * Gets the value of the updateAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressUpdateResponse }{@code >}
     *     
     */
    public JAXBElement<AddressUpdateResponse> getUpdateAddressResult() {
        return updateAddressResult;
    }

    /**
     * Sets the value of the updateAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressUpdateResponse }{@code >}
     *     
     */
    public void setUpdateAddressResult(JAXBElement<AddressUpdateResponse> value) {
        this.updateAddressResult = value;
    }

}
