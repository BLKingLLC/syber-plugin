
package com.odysystems.soap.ultipro.EmployeeJob;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeJob">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}Employee">
 *       &lt;sequence>
 *         &lt;element name="Jobs" type="{http://www.ultipro.com/contracts}ArrayOfJob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeJob", propOrder = {
    "jobs"
})
public class EmployeeJob
    extends Employee
{

    @XmlElementRef(name = "Jobs", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJob> jobs;

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJob }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJob> getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJob }{@code >}
     *     
     */
    public void setJobs(JAXBElement<ArrayOfJob> value) {
        this.jobs = value;
    }

}
