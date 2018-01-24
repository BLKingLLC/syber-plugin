
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoUserGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoUserGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}GetResponse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.ultipro.com/contracts}ArrayOfSsoUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoUserGetResponse", propOrder = {
    "results"
})
public class SsoUserGetResponse
    extends GetResponse
{

    @XmlElementRef(name = "Results", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSsoUser> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSsoUser> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfSsoUser> value) {
        this.results = value;
    }

}
