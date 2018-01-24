
package com.odysystems.soap.ultipro.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationStatus")
@XmlEnum
public enum AuthenticationStatus {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    AuthenticationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationStatus fromValue(String v) {
        for (AuthenticationStatus c: AuthenticationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
