
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
 *         &lt;element name="UpdateJobResult" type="{http://www.ultipro.com/contracts}JobUpdateResponse" minOccurs="0"/>
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
    "updateJobResult"
})
@XmlRootElement(name = "UpdateJobResponse", namespace = "http://www.ultipro.com/services/employeejob")
public class UpdateJobResponse {

    @XmlElementRef(name = "UpdateJobResult", namespace = "http://www.ultipro.com/services/employeejob", type = JAXBElement.class, required = false)
    protected JAXBElement<JobUpdateResponse> updateJobResult;

    /**
     * Gets the value of the updateJobResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobUpdateResponse }{@code >}
     *     
     */
    public JAXBElement<JobUpdateResponse> getUpdateJobResult() {
        return updateJobResult;
    }

    /**
     * Sets the value of the updateJobResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobUpdateResponse }{@code >}
     *     
     */
    public void setUpdateJobResult(JAXBElement<JobUpdateResponse> value) {
        this.updateJobResult = value;
    }

}
