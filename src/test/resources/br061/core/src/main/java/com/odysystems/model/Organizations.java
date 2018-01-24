package com.odysystems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name="organizations",catalog="brabbit")
@Indexed
@XmlRootElement
public class Organizations extends BaseObject implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -234486006492344849L;
	private Integer id;
    private String active;
    private String code;
    private String level;
    private String name;
    private String type;

    @Id  @DocumentId    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="active", length=5)
    @Field
    public String getActive() {
        return this.active;
    }
    
    public void setActive(String active) {
        this.active = active;
    }
    
    @Column(name="code", length=45)
    @Field
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    @Column(name="level", length=45)
    @Field
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    @Column(name="name", length=45)
    @Field
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="type", length=45)
    @Field
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organizations pojo = (Organizations) o;

        if (active != null ? !active.equals(pojo.active) : pojo.active != null) return false;
        if (code != null ? !code.equals(pojo.code) : pojo.code != null) return false;
        if (level != null ? !level.equals(pojo.level) : pojo.level != null) return false;
        if (name != null ? !name.equals(pojo.name) : pojo.name != null) return false;
        if (type != null ? !type.equals(pojo.type) : pojo.type != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (active != null ? active.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("id").append("='").append(getId()).append("', ");
        sb.append("active").append("='").append(getActive()).append("', ");
        sb.append("code").append("='").append(getCode()).append("', ");
        sb.append("level").append("='").append(getLevel()).append("', ");
        sb.append("name").append("='").append(getName()).append("', ");
        sb.append("type").append("='").append(getType()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
