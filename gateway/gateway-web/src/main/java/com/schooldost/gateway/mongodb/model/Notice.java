/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.schooldost.service.constants.UserTypeEnum;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "notice" )
public class Notice extends Base {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7198354236810376400L;
	private String subject;
	private String noticeDate;
	private String attachedFileId;
	private String noticeMessage;
	private UserTypeEnum userTypeEnum;
	private boolean isRead;
	private String sentBy;
	
	
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}


	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}


	/**
	 * @return the noticeDate
	 */
	public String getNoticeDate() {
		return noticeDate;
	}


	/**
	 * @param noticeDate the noticeDate to set
	 */
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}


	/**
	 * @return the attachedFileId
	 */
	public String getAttachedFileId() {
		return attachedFileId;
	}


	/**
	 * @param attachedFileId the attachedFileId to set
	 */
	public void setAttachedFileId(String attachedFileId) {
		this.attachedFileId = attachedFileId;
	}


	/**
	 * @return the noticeMessage
	 */
	public String getNoticeMessage() {
		return noticeMessage;
	}


	/**
	 * @param noticeMessage the noticeMessage to set
	 */
	public void setNoticeMessage(String noticeMessage) {
		this.noticeMessage = noticeMessage;
	}


	/**
	 * @return the userTypeEnum
	 */
	public UserTypeEnum getUserTypeEnum() {
		return userTypeEnum;
	}


	/**
	 * @param userTypeEnum the userTypeEnum to set
	 */
	public void setUserTypeEnum(UserTypeEnum userTypeEnum) {
		this.userTypeEnum = userTypeEnum;
	}


	public boolean isRead() {
		return isRead;
	}


	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}


	public String getSentBy() {
		return sentBy;
	}


	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}


	@Override
	public String toString() {
		return "Notice [subject=" + subject + ", noticeDate=" + noticeDate + ", attachedFileId=" + attachedFileId
				+ ", noticeMessage=" + noticeMessage + ", userTypeEnum=" + userTypeEnum + ", isRead=" + isRead
				+ ", sentBy=" + sentBy + "]";
	}


}
