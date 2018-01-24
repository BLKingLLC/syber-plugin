
package com.odysystems.soap.ultipro.employeePerson;

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
 *         &lt;element name="GetPersonByEmployeeIdentifierResult" type="{http://www.ultipro.com/contracts}PersonGetResponse" minOccurs="0"/>
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
    "getPersonByEmployeeIdentifierResult"
})
@XmlRootElement(name = "GetPersonByEmployeeIdentifierResponse", namespace = "http://www.ultipro.com/services/employeeperson")
public class GetPersonByEmployeeIdentifierResponse {

    @XmlElementRef(name = "GetPersonByEmployeeIdentifierResult", namespace = "http://www.ultipro.com/services/employeeperson", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonGetResponse> getPersonByEmployeeIdentifierResult;

    /**
     * Gets the value of the getPersonByEmployeeIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonGetResponse }{@code >}
     *     
     */
    public JAXBElement<PersonGetResponse> getGetPersonByEmployeeIdentifierResult() {
        return getPersonByEmployeeIdentifierResult;
    }

    /**
     * Sets the value of the getPersonByEmployeeIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonGetResponse }{@code >}
     *     
     */
    public void setGetPersonByEmployeeIdentifierResult(JAXBElement<PersonGetResponse> value) {
        this.getPersonByEmployeeIdentifierResult = value;
    }

}
