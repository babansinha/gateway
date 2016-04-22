/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "class_teacher_subject" )
public class ClassTeacherSubject extends Base {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8028407324464901013L;

	private String className;
	private String subject;
	private String classTeacher;
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
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
	 * @return the classTeacher
	 */
	public String getClassTeacher() {
		return classTeacher;
	}
	/**
	 * @param classTeacher the classTeacher to set
	 */
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClassTeacherSubject [className=");
		builder.append(className);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", classTeacher=");
		builder.append(classTeacher);
		builder.append("]");
		return builder.toString();
	}
	
}
