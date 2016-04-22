package com.schooldost.gateway.mongodb.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

public abstract class Base implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7385590384667489006L;
	
	@Id
	protected String domainId;

	protected Date createdDate;
	protected Date modifiedDate;
	protected String createdBy;
	protected String modifiedBy;
	protected Integer versionNumber;
	protected String objectType;
	public String getDomainId() {
		return domainId;
	}
	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Integer getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	@Override
	public String toString() {
		return "Base [domainId=" + domainId + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", versionNumber=" + versionNumber
				+ ", objectType=" + objectType + "]";
	}

}
