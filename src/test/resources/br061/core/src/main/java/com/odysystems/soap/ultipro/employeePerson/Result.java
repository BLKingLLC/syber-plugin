
package com.odysystems.soap.ultipro.employeePerson;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://www.ultipro.com/contracts}ArrayOfOperationMessage" minOccurs="0"/>
 *         &lt;element name="PagingInfo" type="{http://www.ultipro.com/contracts}PagingInfo" minOccurs="0"/>
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "Result", propOrder = {
    "hasErrors",
    "hasWarnings",
    "messages",
    "pagingInfo",
    "requestNumber",
    "success"
})
public class Result {

    @XmlElement(name = "HasErrors")
    protected Boolean hasErrors;
    @XmlElement(name = "HasWarnings")
    protected Boolean hasWarnings;
    @XmlElementRef(name = "Messages", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOperationMessage> messages;
    @XmlElementRef(name = "PagingInfo", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PagingInfo> pagingInfo;
    @XmlElementRef(name = "RequestNumber", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requestNumber;
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
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperationMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOperationMessage> getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperationMessage }{@code >}
     *     
     */
    public void setMessages(JAXBElement<ArrayOfOperationMessage> value) {
        this.messages = value;
    }

    /**
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}
     *     
     */
    public JAXBElement<PagingInfo> getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}
     *     
     */
    public void setPagingInfo(JAXBElement<PagingInfo> value) {
        this.pagingInfo = value;
    }

    /**
     * Gets the value of the requestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRequestNumber() {
        return requestNumber;
    }

    /**
     * Sets the value of the requestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRequestNumber(JAXBElement<Integer> value) {
        this.requestNumber = value;
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
