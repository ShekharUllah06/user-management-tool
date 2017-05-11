
package com.logicaldoc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://ws.logicaldoc.com}WSAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deleteUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="docRefType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="exportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exportStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="immutable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indexed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passwordProtected" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="signed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stamped" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startPublishing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stopPublishing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDocument", propOrder = {
    "attributes",
    "comment",
    "creation",
    "creator",
    "creatorId",
    "customId",
    "date",
    "deleteUserId",
    "digest",
    "docRef",
    "docRefType",
    "exportId",
    "exportName",
    "exportStatus",
    "fileName",
    "fileSize",
    "fileVersion",
    "folderId",
    "formId",
    "icon",
    "id",
    "immutable",
    "indexed",
    "language",
    "lastModified",
    "lockUserId",
    "nature",
    "pages",
    "passwordProtected",
    "path",
    "published",
    "publisher",
    "publisherId",
    "rating",
    "score",
    "signed",
    "stamped",
    "startPublishing",
    "status",
    "stopPublishing",
    "summary",
    "tags",
    "templateId",
    "title",
    "type",
    "version",
    "workflowStatus"
})
public class WSDocument {

    @XmlElement(nillable = true)
    protected List<WSAttribute> attributes;
    protected String comment;
    protected String creation;
    protected String creator;
    protected long creatorId;
    protected String customId;
    protected String date;
    protected Long deleteUserId;
    protected String digest;
    protected Long docRef;
    protected String docRefType;
    protected Long exportId;
    protected String exportName;
    protected int exportStatus;
    protected String fileName;
    protected long fileSize;
    protected String fileVersion;
    protected Long folderId;
    protected Long formId;
    protected String icon;
    protected long id;
    protected int immutable;
    protected int indexed;
    protected String language;
    protected String lastModified;
    protected Long lockUserId;
    protected int nature;
    protected int pages;
    protected Integer passwordProtected;
    protected String path;
    protected int published;
    protected String publisher;
    protected long publisherId;
    protected Integer rating;
    protected Integer score;
    protected int signed;
    protected int stamped;
    protected String startPublishing;
    protected int status;
    protected String stopPublishing;
    protected String summary;
    @XmlElement(nillable = true)
    protected List<String> tags;
    protected Long templateId;
    protected String title;
    protected String type;
    protected String version;
    protected String workflowStatus;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSAttribute }
     * 
     * 
     */
    public List<WSAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<WSAttribute>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreation(String value) {
        this.creation = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     */
    public long getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     */
    public void setCreatorId(long value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the customId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * Sets the value of the customId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomId(String value) {
        this.customId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the deleteUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * Sets the value of the deleteUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeleteUserId(Long value) {
        this.deleteUserId = value;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigest(String value) {
        this.digest = value;
    }

    /**
     * Gets the value of the docRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocRef() {
        return docRef;
    }

    /**
     * Sets the value of the docRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocRef(Long value) {
        this.docRef = value;
    }

    /**
     * Gets the value of the docRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefType() {
        return docRefType;
    }

    /**
     * Sets the value of the docRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefType(String value) {
        this.docRefType = value;
    }

    /**
     * Gets the value of the exportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExportId() {
        return exportId;
    }

    /**
     * Sets the value of the exportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExportId(Long value) {
        this.exportId = value;
    }

    /**
     * Gets the value of the exportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportName() {
        return exportName;
    }

    /**
     * Sets the value of the exportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportName(String value) {
        this.exportName = value;
    }

    /**
     * Gets the value of the exportStatus property.
     * 
     */
    public int getExportStatus() {
        return exportStatus;
    }

    /**
     * Sets the value of the exportStatus property.
     * 
     */
    public void setExportStatus(int value) {
        this.exportStatus = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderId(Long value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormId(Long value) {
        this.formId = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the immutable property.
     * 
     */
    public int getImmutable() {
        return immutable;
    }

    /**
     * Sets the value of the immutable property.
     * 
     */
    public void setImmutable(int value) {
        this.immutable = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     */
    public int getIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     */
    public void setIndexed(int value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the lockUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockUserId() {
        return lockUserId;
    }

    /**
     * Sets the value of the lockUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockUserId(Long value) {
        this.lockUserId = value;
    }

    /**
     * Gets the value of the nature property.
     * 
     */
    public int getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     */
    public void setNature(int value) {
        this.nature = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     */
    public void setPages(int value) {
        this.pages = value;
    }

    /**
     * Gets the value of the passwordProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordProtected() {
        return passwordProtected;
    }

    /**
     * Sets the value of the passwordProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordProtected(Integer value) {
        this.passwordProtected = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the published property.
     * 
     */
    public int getPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     */
    public void setPublished(int value) {
        this.published = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the publisherId property.
     * 
     */
    public long getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     */
    public void setPublisherId(long value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRating(Integer value) {
        this.rating = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the signed property.
     * 
     */
    public int getSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     */
    public void setSigned(int value) {
        this.signed = value;
    }

    /**
     * Gets the value of the stamped property.
     * 
     */
    public int getStamped() {
        return stamped;
    }

    /**
     * Sets the value of the stamped property.
     * 
     */
    public void setStamped(int value) {
        this.stamped = value;
    }

    /**
     * Gets the value of the startPublishing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPublishing() {
        return startPublishing;
    }

    /**
     * Sets the value of the startPublishing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPublishing(String value) {
        this.startPublishing = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the stopPublishing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPublishing() {
        return stopPublishing;
    }

    /**
     * Sets the value of the stopPublishing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPublishing(String value) {
        this.stopPublishing = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTags() {
        if (tags == null) {
            tags = new ArrayList<String>();
        }
        return this.tags;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

}
