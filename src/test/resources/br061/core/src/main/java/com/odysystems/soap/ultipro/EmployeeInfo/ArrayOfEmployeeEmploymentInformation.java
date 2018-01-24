
package com.odysystems.soap.ultipro.EmployeeInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmployeeEmploymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmployeeEmploymentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeEmploymentInformation" type="{http://www.ultipro.com/contracts}EmployeeEmploymentInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmployeeEmploymentInformation", propOrder = {
    "employeeEmploymentInformation"
})
public class ArrayOfEmployeeEmploymentInformation {

    @XmlElement(name = "EmployeeEmploymentInformation", nillable = true)
    protected List<EmployeeEmploymentInformation> employeeEmploymentInformation;

    /**
     * Gets the value of the employeeEmploymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeEmploymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeEmploymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeEmploymentInformation }
     * 
     * 
     */
    public List<EmployeeEmploymentInformation> getEmployeeEmploymentInformation() {
        if (employeeEmploymentInformation == null) {
            employeeEmploymentInformation = new ArrayList<EmployeeEmploymentInformation>();
        }
        return this.employeeEmploymentInformation;
    }

}
