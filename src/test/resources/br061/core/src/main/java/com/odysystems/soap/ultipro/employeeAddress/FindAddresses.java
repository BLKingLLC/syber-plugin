
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
 *         &lt;element name="query" type="{http://www.ultipro.com/contracts}EmployeeQuery" minOccurs="0"/>
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
    "query"
})
@XmlRootElement(name = "FindAddresses", namespace = "http://www.ultipro.com/services/employeeaddress")
public class FindAddresses {

    @XmlElementRef(name = "query", namespace = "http://www.ultipro.com/services/employeeaddress", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeQuery> query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}
     *     
     */
    public JAXBElement<EmployeeQuery> getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}
     *     
     */
    public void setQuery(JAXBElement<EmployeeQuery> value) {
        this.query = value;
    }

}
