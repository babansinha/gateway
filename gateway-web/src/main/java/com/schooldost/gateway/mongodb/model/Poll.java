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
@Document(collection = "poll" )
public class Poll extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8819689640696845114L;
	private String subject;
	private String pollDate;
	private String attachedFileId;
	private String pollMessage;
	private UserTypeEnum userTypeEnum;
	private AnswerType answerType;
	private boolean read;
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
	 * @return the pollDate
	 */
	public String getPollDate() {
		return pollDate;
	}
	/**
	 * @param pollDate the pollDate to set
	 */
	public void setPollDate(String pollDate) {
		this.pollDate = pollDate;
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
	 * @return the pollMessage
	 */
	public String getPollMessage() {
		return pollMessage;
	}
	/**
	 * @param pollMessage the pollMessage to set
	 */
	public void setPollMessage(String pollMessage) {
		this.pollMessage = pollMessage;
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
	
	
	/**
	 * @return the answerType
	 */
	public AnswerType getAnswerType() {
		return answerType;
	}
	/**
	 * @param answerType the answerType to set
	 */
	public void setAnswerType(AnswerType answerType) {
		this.answerType = answerType;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	
	public String getSentBy() {
		return sentBy;
	}
	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}
	@Override
	public String toString() {
		return "Poll [subject=" + subject + ", pollDate=" + pollDate + ", attachedFileId=" + attachedFileId
				+ ", pollMessage=" + pollMessage + ", userTypeEnum=" + userTypeEnum + ", answerType=" + answerType
				+ ", read=" + read + ", sentBy=" + sentBy + "]";
	}
	
}
