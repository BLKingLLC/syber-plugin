
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalNewHire complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalNewHire">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}GlobalHireBase">
 *       &lt;sequence>
 *         &lt;element name="CompanyIdentifier" type="{http://www.ultipro.com/contracts}CompanyIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalNewHire", propOrder = {
    "companyIdentifier"
})
public class GlobalNewHire
    extends GlobalHireBase
{

    @XmlElementRef(name = "CompanyIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CompanyIdentifier> companyIdentifier;

    /**
     * Gets the value of the companyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}
     *     
     */
    public JAXBElement<CompanyIdentifier> getCompanyIdentifier() {
        return companyIdentifier;
    }

    /**
     * Sets the value of the companyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}
     *     
     */
    public void setCompanyIdentifier(JAXBElement<CompanyIdentifier> value) {
        this.companyIdentifier = value;
    }

}
