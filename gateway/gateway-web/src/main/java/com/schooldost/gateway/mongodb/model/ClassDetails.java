/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "class_details" )
public class ClassDetails extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1442507956826094846L;
	private String className;
	private String sectionName;
	private Student student;
	
	@DBRef()
	private Set<Student> students;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "ClassDetails [className=" + className + ", sectionName=" + sectionName + ", student=" + student
				+ ", students=" + students + "]";
	}
	
}
