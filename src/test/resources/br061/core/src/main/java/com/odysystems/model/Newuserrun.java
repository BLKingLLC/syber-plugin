package com.odysystems.model;

import com.odysystems.model.BaseObject;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@Entity
@Table(name="newuserrun",catalog="brabbit")
@Indexed
@XmlRootElement
public class Newuserrun extends BaseObject implements Serializable {
    private int id;
    private Date date;
    private Set<Newhirelog> newhirelogs = new HashSet<Newhirelog>(0);

    @Id  @DocumentId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", length=19)
    @Field
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="newuserrun")
    public Set<Newhirelog> getNewhirelogs() {
        return this.newhirelogs;
    }
    
    public void setNewhirelogs(Set<Newhirelog> newhirelogs) {
        this.newhirelogs = newhirelogs;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Newuserrun pojo = (Newuserrun) o;

        if (date != null ? !date.equals(pojo.date) : pojo.date != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (date != null ? date.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("id").append("='").append(getId()).append("', ");
        sb.append("date").append("='").append(getDate()).append("', ");
        
        sb.append("]");
      
        return sb.toString();
    }

}
