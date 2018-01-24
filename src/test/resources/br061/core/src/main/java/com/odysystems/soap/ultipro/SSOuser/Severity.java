
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Severity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Severity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Severity")
@XmlEnum
public enum Severity {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    Severity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Severity fromValue(String v) {
        for (Severity c: Severity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
