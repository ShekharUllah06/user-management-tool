/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Abdullah Shekhar
 */
@Entity
@Table(name = "UserLogin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserLogin.findAll", query = "SELECT u FROM UserLogin u"),
    @NamedQuery(name = "UserLogin.findById", query = "SELECT u FROM UserLogin u WHERE u.id = :id"),
    @NamedQuery(name = "UserLogin.findByFullName", query = "SELECT u FROM UserLogin u WHERE u.fullName = :fullName"),
    @NamedQuery(name = "UserLogin.findByUsername", query = "SELECT u FROM UserLogin u WHERE u.username = :username"),
    @NamedQuery(name = "UserLogin.findByPassword", query = "SELECT u FROM UserLogin u WHERE u.password = :password"),
    @NamedQuery(name = "UserLogin.findByEmail", query = "SELECT u FROM UserLogin u WHERE u.email = :email"),
    @NamedQuery(name = "UserLogin.findByAdmin", query = "SELECT u FROM UserLogin u WHERE u.admin = :admin"),
    @NamedQuery(name = "UserLogin.findByAddress", query = "SELECT u FROM UserLogin u WHERE u.address = :address"),
    @NamedQuery(name = "UserLogin.findByCity", query = "SELECT u FROM UserLogin u WHERE u.city = :city"),
    @NamedQuery(name = "UserLogin.findByZipCode", query = "SELECT u FROM UserLogin u WHERE u.zipCode = :zipCode"),
    @NamedQuery(name = "UserLogin.findByCreatedBy", query = "SELECT u FROM UserLogin u WHERE u.createdBy = :createdBy"),
    @NamedQuery(name = "UserLogin.findByCreateOn", query = "SELECT u FROM UserLogin u WHERE u.createOn = :createOn"),
    @NamedQuery(name = "UserLogin.findByIsActive", query = "SELECT u FROM UserLogin u WHERE u.isActive = :isActive"),
    @NamedQuery(name = "UserLogin.findByIsDeleted", query = "SELECT u FROM UserLogin u WHERE u.isDeleted = :isDeleted"),
    @NamedQuery(name = "UserLogin.findByIsPasswordChangeRequired", query = "SELECT u FROM UserLogin u WHERE u.isPasswordChangeRequired = :isPasswordChangeRequired")})
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Column(name = "Email")
    private String email;
    @Column(name = "Admin")
    private Boolean admin;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "ZipCode")
    private String zipCode;
    @Column(name = "CreatedBy")
    private Integer createdBy;
    @Column(name = "CreateOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createOn;
    @Column(name = "IsActive")
    private Boolean isActive;
    @Column(name = "IsDeleted")
    private Boolean isDeleted;
    @Column(name = "IsPasswordChangeRequired")
    private Boolean isPasswordChangeRequired;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Collection<ManageSID> manageSIDCollection;
    @OneToMany(mappedBy = "deletedBy")
    private Collection<ManageSID> manageSIDCollection1;

    public UserLogin() {
    }

    public UserLogin(Integer id) {
        this.id = id;
    }

    public UserLogin(Integer id, String fullName, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsPasswordChangeRequired() {
        return isPasswordChangeRequired;
    }

    public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
        this.isPasswordChangeRequired = isPasswordChangeRequired;
    }

    @XmlTransient
    public Collection<ManageSID> getManageSIDCollection() {
        return manageSIDCollection;
    }

    public void setManageSIDCollection(Collection<ManageSID> manageSIDCollection) {
        this.manageSIDCollection = manageSIDCollection;
    }

    @XmlTransient
    public Collection<ManageSID> getManageSIDCollection1() {
        return manageSIDCollection1;
    }

    public void setManageSIDCollection1(Collection<ManageSID> manageSIDCollection1) {
        this.manageSIDCollection1 = manageSIDCollection1;
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
        if (!(object instanceof UserLogin)) {
            return false;
        }
        UserLogin other = (UserLogin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.UserLogin[ id=" + id + " ]";
    }
    
}
