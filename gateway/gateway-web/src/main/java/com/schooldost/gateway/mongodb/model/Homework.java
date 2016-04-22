/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "homework" )
public class Homework extends Base {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5511733589480578375L;
	private String subject;
	private String sDate;
	private String sDueDate;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date date;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dueDate;
	private String book;
	private String chapter;
	private String question;
	private String description;
	private boolean complete;
	
	@DBRef
	private User completedBy;
	
	@DBRef
	private User subjectTeacher;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public String getsDueDate() {
		return sDueDate;
	}

	public void setsDueDate(String sDueDate) {
		this.sDueDate = sDueDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public User getCompletedBy() {
		return completedBy;
	}

	public void setCompletedBy(User completedBy) {
		this.completedBy = completedBy;
	}

	public User getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(User subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

	@Override
	public String toString() {
		return "Homework [subject=" + subject + ", sDate=" + sDate + ", sDueDate=" + sDueDate + ", date=" + date
				+ ", dueDate=" + dueDate + ", book=" + book + ", chapter=" + chapter + ", question=" + question
				+ ", description=" + description + ", complete=" + complete + ", completedBy=" + completedBy
				+ ", subjectTeacher=" + subjectTeacher + "]";
	}
	
	
}
