package com.odysystems.breerabit.webapp.controller;

import java.util.Arrays;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Command class to handle uploading of a file.
 *
 * <p>
 * <a href="FileUpload.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class PayrollUpload {
    private String name;
    private byte[] file;
    private String date;
    private String type;

    public String getDate() {
		return date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDate(String date) {
		this.date = date;
	}

	/**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public byte[] getFile() {
        return file;
    }
}
