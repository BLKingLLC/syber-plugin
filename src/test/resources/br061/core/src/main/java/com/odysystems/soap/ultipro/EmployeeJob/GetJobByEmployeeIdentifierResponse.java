
package com.odysystems.soap.ultipro.EmployeeJob;

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
 *         &lt;element name="GetJobByEmployeeIdentifierResult" type="{http://www.ultipro.com/contracts}JobGetResponse" minOccurs="0"/>
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
    "getJobByEmployeeIdentifierResult"
})
@XmlRootElement(name = "GetJobByEmployeeIdentifierResponse", namespace = "http://www.ultipro.com/services/employeejob")
public class GetJobByEmployeeIdentifierResponse {

    @XmlElementRef(name = "GetJobByEmployeeIdentifierResult", namespace = "http://www.ultipro.com/services/employeejob", type = JAXBElement.class, required = false)
    protected JAXBElement<JobGetResponse> getJobByEmployeeIdentifierResult;

    /**
     * Gets the value of the getJobByEmployeeIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobGetResponse }{@code >}
     *     
     */
    public JAXBElement<JobGetResponse> getGetJobByEmployeeIdentifierResult() {
        return getJobByEmployeeIdentifierResult;
    }

    /**
     * Sets the value of the getJobByEmployeeIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobGetResponse }{@code >}
     *     
     */
    public void setGetJobByEmployeeIdentifierResult(JAXBElement<JobGetResponse> value) {
        this.getJobByEmployeeIdentifierResult = value;
    }

}
