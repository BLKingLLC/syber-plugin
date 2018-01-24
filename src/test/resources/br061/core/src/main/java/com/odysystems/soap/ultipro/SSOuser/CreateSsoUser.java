
package com.odysystems.soap.ultipro.SSOuser;

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
 *         &lt;element name="entities" type="{http://www.ultipro.com/contracts}ArrayOfSsoUser" minOccurs="0"/>
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
    "entities"
})
@XmlRootElement(name = "CreateSsoUser", namespace = "http://www.ultipro.com/services/employeessouser")
public class CreateSsoUser {

    @XmlElementRef(name = "entities", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSsoUser> entities;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSsoUser> getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public void setEntities(JAXBElement<ArrayOfSsoUser> value) {
        this.entities = value;
    }

}
