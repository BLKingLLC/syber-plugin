
package com.odysystems.soap.ultipro.EmployeeJob;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOperationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationMessage" type="{http://www.ultipro.com/contracts}OperationMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOperationMessage", propOrder = {
    "operationMessage"
})
public class ArrayOfOperationMessage {

    @XmlElement(name = "OperationMessage", nillable = true)
    protected List<OperationMessage> operationMessage;

    /**
     * Gets the value of the operationMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationMessage }
     * 
     * 
     */
    public List<OperationMessage> getOperationMessage() {
        if (operationMessage == null) {
            operationMessage = new ArrayList<OperationMessage>();
        }
        return this.operationMessage;
    }

}
