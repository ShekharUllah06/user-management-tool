/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abdullah Shekhar
 */
@Entity
@Table(name = "ManageSID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManageSID.findAll", query = "SELECT m FROM ManageSID m"),
    @NamedQuery(name = "ManageSID.findById", query = "SELECT m FROM ManageSID m WHERE m.id = :id"),
    @NamedQuery(name = "ManageSID.findBySid", query = "SELECT m FROM ManageSID m WHERE m.sid = :sid"),
    @NamedQuery(name = "ManageSID.findByCreatedOn", query = "SELECT m FROM ManageSID m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "ManageSID.findByIsDeleted", query = "SELECT m FROM ManageSID m WHERE m.isDeleted = :isDeleted"),
    @NamedQuery(name = "ManageSID.findByDeletedOn", query = "SELECT m FROM ManageSID m WHERE m.deletedOn = :deletedOn")})
public class ManageSID implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "SID")
    private String sid;
    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "IsDeleted")
    private Boolean isDeleted;
    @Column(name = "DeletedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedOn;
    @JoinColumn(name = "CreatedBy", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private UserLogin createdBy;
    @JoinColumn(name = "DeletedBy", referencedColumnName = "Id")
    @ManyToOne
    private UserLogin deletedBy;

    public ManageSID() {
    }

    public ManageSID(Long id) {
        this.id = id;
    }

    public ManageSID(Long id, String sid) {
        this.id = id;
        this.sid = sid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Date deletedOn) {
        this.deletedOn = deletedOn;
    }

    public UserLogin getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserLogin createdBy) {
        this.createdBy = createdBy;
    }

    public UserLogin getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(UserLogin deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManageSID)) {
            return false;
        }
        ManageSID other = (ManageSID) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.ManageSID[ id=" + id + " ]";
    }
    
}
