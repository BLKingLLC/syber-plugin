
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoUserFindResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoUserFindResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}FindResponse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.ultipro.com/contracts}ArrayOfEmployeeSsoUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoUserFindResponse", propOrder = {
    "results"
})
public class SsoUserFindResponse
    extends FindResponse
{

    @XmlElementRef(name = "Results", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmployeeSsoUser> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeSsoUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmployeeSsoUser> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeSsoUser }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfEmployeeSsoUser> value) {
        this.results = value;
    }

}
