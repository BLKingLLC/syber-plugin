
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
 *         &lt;element name="UpdateGlobalEmployeeResult" type="{http://www.ultipro.com/contracts}GlobalEmployeeUpdateResponse" minOccurs="0"/>
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
    "updateGlobalEmployeeResult"
})
@XmlRootElement(name = "UpdateGlobalEmployeeResponse", namespace = "http://www.ultipro.com/services/employeeglobalnewhire")
public class UpdateGlobalEmployeeResponse {

    @XmlElementRef(name = "UpdateGlobalEmployeeResult", namespace = "http://www.ultipro.com/services/employeeglobalnewhire", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEmployeeUpdateResponse> updateGlobalEmployeeResult;

    /**
     * Gets the value of the updateGlobalEmployeeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeUpdateResponse }{@code >}
     *     
     */
    public JAXBElement<GlobalEmployeeUpdateResponse> getUpdateGlobalEmployeeResult() {
        return updateGlobalEmployeeResult;
    }

    /**
     * Sets the value of the updateGlobalEmployeeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeUpdateResponse }{@code >}
     *     
     */
    public void setUpdateGlobalEmployeeResult(JAXBElement<GlobalEmployeeUpdateResponse> value) {
        this.updateGlobalEmployeeResult = value;
    }

}
