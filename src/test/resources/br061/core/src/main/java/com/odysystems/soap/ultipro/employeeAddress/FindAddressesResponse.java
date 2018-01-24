
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
 *         &lt;element name="FindAddressesResult" type="{http://www.ultipro.com/contracts}AddressFindResponse" minOccurs="0"/>
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
    "findAddressesResult"
})
@XmlRootElement(name = "FindAddressesResponse", namespace = "http://www.ultipro.com/services/employeeaddress")
public class FindAddressesResponse {

    @XmlElementRef(name = "FindAddressesResult", namespace = "http://www.ultipro.com/services/employeeaddress", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressFindResponse> findAddressesResult;

    /**
     * Gets the value of the findAddressesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressFindResponse }{@code >}
     *     
     */
    public JAXBElement<AddressFindResponse> getFindAddressesResult() {
        return findAddressesResult;
    }

    /**
     * Sets the value of the findAddressesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressFindResponse }{@code >}
     *     
     */
    public void setFindAddressesResult(JAXBElement<AddressFindResponse> value) {
        this.findAddressesResult = value;
    }

}
