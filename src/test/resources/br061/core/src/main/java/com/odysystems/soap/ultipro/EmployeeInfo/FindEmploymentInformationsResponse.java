
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
 *         &lt;element name="FindEmploymentInformationsResult" type="{http://www.ultipro.com/contracts}EmploymentInformationFindResponse" minOccurs="0"/>
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
    "findEmploymentInformationsResult"
})
@XmlRootElement(name = "FindEmploymentInformationsResponse", namespace = "http://www.ultipro.com/services/employeeemploymentinformation")
public class FindEmploymentInformationsResponse {

    @XmlElementRef(name = "FindEmploymentInformationsResult", namespace = "http://www.ultipro.com/services/employeeemploymentinformation", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentInformationFindResponse> findEmploymentInformationsResult;

    /**
     * Gets the value of the findEmploymentInformationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentInformationFindResponse }{@code >}
     *     
     */
    public JAXBElement<EmploymentInformationFindResponse> getFindEmploymentInformationsResult() {
        return findEmploymentInformationsResult;
    }

    /**
     * Sets the value of the findEmploymentInformationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentInformationFindResponse }{@code >}
     *     
     */
    public void setFindEmploymentInformationsResult(JAXBElement<EmploymentInformationFindResponse> value) {
        this.findEmploymentInformationsResult = value;
    }

}
