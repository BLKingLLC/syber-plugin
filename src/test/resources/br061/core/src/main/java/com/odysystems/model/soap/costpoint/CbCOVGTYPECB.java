//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.20 at 04:11:25 PM EST 
//


package com.odysystems.model.soap.costpoint;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cb_COVG_TYPE_CB.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cb_COVG_TYPE_CB">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cb_COVG_TYPE_CB")
@XmlEnum
public enum CbCOVGTYPECB {

    U,
    W,
    B;

    public String value() {
        return name();
    }

    public static CbCOVGTYPECB fromValue(String v) {
        return valueOf(v);
    }

}