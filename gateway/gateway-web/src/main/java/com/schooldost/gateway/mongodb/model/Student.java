package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student" )
public class Student extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1402285462376182562L;
	
	//@Indexed(unique = true)
	private String rollNumber;
	
	//@DBRef
	//private User student;
	
	@DBRef
	private User mother;
	
	@DBRef
	private User father;
	
	@DBRef
	private Transport transport;
	
	private String pickupPoint;
	private String dropPoint;
	/*public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}*/
	public User getMother() {
		return mother;
	}
	public void setMother(User mother) {
		this.mother = mother;
	}
	public User getFather() {
		return father;
	}
	public void setFather(User father) {
		this.father = father;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public String getPickupPoint() {
		return pickupPoint;
	}
	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}
	public String getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", mother=" + mother + ", father=" + father + ", transport="
				+ transport + ", pickupPoint=" + pickupPoint + ", dropPoint=" + dropPoint + "]";
	}
	
	
}
