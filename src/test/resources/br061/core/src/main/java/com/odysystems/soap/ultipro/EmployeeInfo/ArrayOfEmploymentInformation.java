
package com.odysystems.soap.ultipro.EmployeeInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmploymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmploymentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentInformation" type="{http://www.ultipro.com/contracts}EmploymentInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmploymentInformation", propOrder = {
    "employmentInformation"
})
public class ArrayOfEmploymentInformation {

    @XmlElement(name = "EmploymentInformation", nillable = true)
    protected List<EmploymentInformation> employmentInformation;

    /**
     * Gets the value of the employmentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentInformation }
     * 
     * 
     */
    public List<EmploymentInformation> getEmploymentInformation() {
        if (employmentInformation == null) {
            employmentInformation = new ArrayList<EmploymentInformation>();
        }
        return this.employmentInformation;
    }

}
