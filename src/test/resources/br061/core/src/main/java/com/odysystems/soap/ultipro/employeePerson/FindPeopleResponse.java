
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
 *         &lt;element name="FindPeopleResult" type="{http://www.ultipro.com/contracts}PersonFindResponse" minOccurs="0"/>
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
    "findPeopleResult"
})
@XmlRootElement(name = "FindPeopleResponse", namespace = "http://www.ultipro.com/services/employeeperson")
public class FindPeopleResponse {

    @XmlElementRef(name = "FindPeopleResult", namespace = "http://www.ultipro.com/services/employeeperson", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonFindResponse> findPeopleResult;

    /**
     * Gets the value of the findPeopleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonFindResponse }{@code >}
     *     
     */
    public JAXBElement<PersonFindResponse> getFindPeopleResult() {
        return findPeopleResult;
    }

    /**
     * Sets the value of the findPeopleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonFindResponse }{@code >}
     *     
     */
    public void setFindPeopleResult(JAXBElement<PersonFindResponse> value) {
        this.findPeopleResult = value;
    }

}
