package com.odysystems.breerabit.webapp.pojo;
/**
 * Command class to handle creating a new Google User.
 *
 * <p>
 * <a href="GoogleInitializer.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:bobby.king@blking.net>Bobby King</a>
 */
public class GoogleUserPojo {
	private String firstName;
	private String lastName;
	
	/**
     * @return Returns the First Name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param name The First Name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
	/**
     * @return Returns the Last Name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param name The Last Name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
