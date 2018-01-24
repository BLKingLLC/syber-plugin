
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
 *         &lt;element name="entities" type="{http://www.ultipro.com/contracts}ArrayOfJob" minOccurs="0"/>
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
@XmlRootElement(name = "UpdateJob", namespace = "http://www.ultipro.com/services/employeejob")
public class UpdateJob {

    @XmlElementRef(name = "entities", namespace = "http://www.ultipro.com/services/employeejob", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJob> entities;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJob }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJob> getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJob }{@code >}
     *     
     */
    public void setEntities(JAXBElement<ArrayOfJob> value) {
        this.entities = value;
    }

}
