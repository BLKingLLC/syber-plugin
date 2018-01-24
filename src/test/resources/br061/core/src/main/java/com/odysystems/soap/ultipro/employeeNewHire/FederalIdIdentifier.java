
package com.odysystems.soap.ultipro.employeeNewHire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FederalIdIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FederalIdIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}CompanyIdentifier">
 *       &lt;sequence>
 *         &lt;element name="FederalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FederalIdIdentifier", propOrder = {
    "federalId"
})
public class FederalIdIdentifier
    extends CompanyIdentifier
{

    @XmlElementRef(name = "FederalId", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalId;

    /**
     * Gets the value of the federalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalId() {
        return federalId;
    }

    /**
     * Sets the value of the federalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalId(JAXBElement<String> value) {
        this.federalId = value;
    }

}
