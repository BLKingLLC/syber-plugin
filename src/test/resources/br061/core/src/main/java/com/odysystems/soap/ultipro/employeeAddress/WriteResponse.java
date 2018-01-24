
package com.odysystems.soap.ultipro.employeeAddress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationResult" type="{http://www.ultipro.com/contracts}Result" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://www.ultipro.com/contracts}ArrayOfResult" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteResponse", propOrder = {
    "hasErrors",
    "hasWarnings",
    "operationResult",
    "results",
    "success"
})
@XmlSeeAlso({
    UpdateResponse.class
})
public class WriteResponse {

    @XmlElement(name = "HasErrors")
    protected Boolean hasErrors;
    @XmlElement(name = "HasWarnings")
    protected Boolean hasWarnings;
    @XmlElementRef(name = "OperationResult", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> operationResult;
    @XmlElementRef(name = "Results", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResult> results;
    @XmlElement(name = "Success")
    protected Boolean success;

    /**
     * Gets the value of the hasErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasErrors() {
        return hasErrors;
    }

    /**
     * Sets the value of the hasErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasErrors(Boolean value) {
        this.hasErrors = value;
    }

    /**
     * Gets the value of the hasWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWarnings() {
        return hasWarnings;
    }

    /**
     * Sets the value of the hasWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWarnings(Boolean value) {
        this.hasWarnings = value;
    }

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setOperationResult(JAXBElement<Result> value) {
        this.operationResult = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResult> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfResult> value) {
        this.results = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

}
