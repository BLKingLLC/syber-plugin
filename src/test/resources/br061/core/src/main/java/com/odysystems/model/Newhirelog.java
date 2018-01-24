package com.odysystems.model;

import com.odysystems.model.BaseObject;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@Entity
@Table(name="newhirelog",catalog="brabbit")
@Indexed
@XmlRootElement
public class Newhirelog extends BaseObject implements Serializable {
    private Integer id;
    private Newuserrun newuserrun;
    private String name;
    private Boolean sso;
    private Boolean emailAddress;
    private Boolean welcomeEmail;
    private String googleClientId;
    private String ssoClientId;
    private String primaryEmail;
    private String employeeID;

    @Id  @DocumentId    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fkid", nullable=false)
    public Newuserrun getNewuserrun() {
        return this.newuserrun;
    }
    
    public void setNewuserrun(Newuserrun newuserrun) {
        this.newuserrun = newuserrun;
    }
    
    @Column(name="name", length=45)
    @Field
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="sso")
    public Boolean getSso() {
        return this.sso;
    }
    
    public void setSso(Boolean sso) {
        this.sso = sso;
    }
    
    @Column(name="emailAddress")
    public Boolean getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(Boolean emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    @Column(name="welcomeEmail")
    public Boolean getWelcomeEmail() {
        return this.welcomeEmail;
    }
    
    public void setWelcomeEmail(Boolean welcomeEmail) {
        this.welcomeEmail = welcomeEmail;
    }
    
    @Column(name="googleClientID", length=45)
    @Field
    public String getGoogleClientId() {
        return this.googleClientId;
    }
    
    public void setGoogleClientId(String googleClientId) {
        this.googleClientId = googleClientId;
    }
    
    @Column(name="ssoClientID", length=45)
    @Field
    public String getSsoClientId() {
        return this.ssoClientId;
    }
    
    public void setSsoClientId(String ssoClientId) {
        this.ssoClientId = ssoClientId;
    }

    @Column(name="primary_email", length=100)
    @Field
    public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

    @Column(name="employee_id", length=10)
    @Field
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Newhirelog pojo = (Newhirelog) o;

        if (newuserrun != null ? !newuserrun.equals(pojo.newuserrun) : pojo.newuserrun != null) return false;
        if (name != null ? !name.equals(pojo.name) : pojo.name != null) return false;
        if (sso != null ? !sso.equals(pojo.sso) : pojo.sso != null) return false;
        if (emailAddress != null ? !emailAddress.equals(pojo.emailAddress) : pojo.emailAddress != null) return false;
        if (welcomeEmail != null ? !welcomeEmail.equals(pojo.welcomeEmail) : pojo.welcomeEmail != null) return false;
        if (googleClientId != null ? !googleClientId.equals(pojo.googleClientId) : pojo.googleClientId != null) return false;
        if (ssoClientId != null ? !ssoClientId.equals(pojo.ssoClientId) : pojo.ssoClientId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (newuserrun != null ? newuserrun.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sso != null ? sso.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (welcomeEmail != null ? welcomeEmail.hashCode() : 0);
        result = 31 * result + (googleClientId != null ? googleClientId.hashCode() : 0);
        result = 31 * result + (ssoClientId != null ? ssoClientId.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("id").append("='").append(getId()).append("', ");
        sb.append("newuserrun").append("='").append(getNewuserrun()).append("', ");
        sb.append("name").append("='").append(getName()).append("', ");
        sb.append("sso").append("='").append(getSso()).append("', ");
        sb.append("emailAddress").append("='").append(getEmailAddress()).append("', ");
        sb.append("welcomeEmail").append("='").append(getWelcomeEmail()).append("', ");
        sb.append("googleClientId").append("='").append(getGoogleClientId()).append("', ");
        sb.append("ssoClientId").append("='").append(getSsoClientId()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
