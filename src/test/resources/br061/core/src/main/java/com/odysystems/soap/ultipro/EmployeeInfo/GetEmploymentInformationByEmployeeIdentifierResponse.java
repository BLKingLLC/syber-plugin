
package com.odysystems.soap.ultipro.EmployeeInfo;

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
 *         &lt;element name="GetEmploymentInformationByEmployeeIdentifierResult" type="{http://www.ultipro.com/contracts}EmploymentInformationGetResponse" minOccurs="0"/>
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
    "getEmploymentInformationByEmployeeIdentifierResult"
})
@XmlRootElement(name = "GetEmploymentInformationByEmployeeIdentifierResponse", namespace = "http://www.ultipro.com/services/employeeemploymentinformation")
public class GetEmploymentInformationByEmployeeIdentifierResponse {

    @XmlElementRef(name = "GetEmploymentInformationByEmployeeIdentifierResult", namespace = "http://www.ultipro.com/services/employeeemploymentinformation", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentInformationGetResponse> getEmploymentInformationByEmployeeIdentifierResult;

    /**
     * Gets the value of the getEmploymentInformationByEmployeeIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentInformationGetResponse }{@code >}
     *     
     */
    public JAXBElement<EmploymentInformationGetResponse> getGetEmploymentInformationByEmployeeIdentifierResult() {
        return getEmploymentInformationByEmployeeIdentifierResult;
    }

    /**
     * Sets the value of the getEmploymentInformationByEmployeeIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentInformationGetResponse }{@code >}
     *     
     */
    public void setGetEmploymentInformationByEmployeeIdentifierResult(JAXBElement<EmploymentInformationGetResponse> value) {
        this.getEmploymentInformationByEmployeeIdentifierResult = value;
    }

}
