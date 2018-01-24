
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

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
 *         &lt;element name="GetGlobalEmployeeByEmployeeIdentifierResult" type="{http://www.ultipro.com/contracts}GlobalEmployeeGetResponse" minOccurs="0"/>
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
    "getGlobalEmployeeByEmployeeIdentifierResult"
})
@XmlRootElement(name = "GetGlobalEmployeeByEmployeeIdentifierResponse", namespace = "http://www.ultipro.com/services/employeeglobalnewhire")
public class GetGlobalEmployeeByEmployeeIdentifierResponse {

    @XmlElementRef(name = "GetGlobalEmployeeByEmployeeIdentifierResult", namespace = "http://www.ultipro.com/services/employeeglobalnewhire", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEmployeeGetResponse> getGlobalEmployeeByEmployeeIdentifierResult;

    /**
     * Gets the value of the getGlobalEmployeeByEmployeeIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeGetResponse }{@code >}
     *     
     */
    public JAXBElement<GlobalEmployeeGetResponse> getGetGlobalEmployeeByEmployeeIdentifierResult() {
        return getGlobalEmployeeByEmployeeIdentifierResult;
    }

    /**
     * Sets the value of the getGlobalEmployeeByEmployeeIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeGetResponse }{@code >}
     *     
     */
    public void setGetGlobalEmployeeByEmployeeIdentifierResult(JAXBElement<GlobalEmployeeGetResponse> value) {
        this.getGlobalEmployeeByEmployeeIdentifierResult = value;
    }

}
