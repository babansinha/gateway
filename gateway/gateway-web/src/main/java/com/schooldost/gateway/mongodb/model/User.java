package com.schooldost.gateway.mongodb.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "user" )
public class User extends Address {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6219661479053650192L;
	private String firstName;
	private String middleName;
	private String lastName;
	
	//@Indexed(unique = true)
	private String username;
	private String password;
	
	//@Indexed(unique = true)
	private String mobileNumber ;
	
	//@Indexed(unique = true)
	private String email ;
	private boolean accountExpired ;
	private boolean accountLocked ;
	private String nickName ;
	private boolean enabled = true;
	private String profileImgId;
	private String dateOfBirth;
	private String description;
	private String employeeCode;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dob;
	
	@DBRef
	private Role role;
	
	@DBRef
	private List<ClassTeacherSubject> classTeacherSubjects;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the accountExpired
	 */
	public boolean isAccountExpired() {
		return accountExpired;
	}

	/**
	 * @param accountExpired the accountExpired to set
	 */
	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	/**
	 * @return the accountLocked
	 */
	public boolean isAccountLocked() {
		return accountLocked;
	}

	/**
	 * @param accountLocked the accountLocked to set
	 */
	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the profileImgId
	 */
	public String getProfileImgId() {
		return profileImgId;
	}

	/**
	 * @param profileImgId the profileImgId to set
	 */
	public void setProfileImgId(String profileImgId) {
		this.profileImgId = profileImgId;
	}
	

	public List<ClassTeacherSubject> getClassTeacherSubjects() {
		return classTeacherSubjects;
	}

	public void setClassTeacherSubjects(List<ClassTeacherSubject> classTeacherSubjects) {
		this.classTeacherSubjects = classTeacherSubjects;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", accountExpired=" + accountExpired + ", accountLocked=" + accountLocked + ", nickName=" + nickName
				+ ", enabled=" + enabled + ", profileImgId=" + profileImgId + ", dateOfBirth=" + dateOfBirth
				+ ", description=" + description + ", employeeCode=" + employeeCode + ", dob=" + dob + ", role=" + role
				+ ", classTeacherSubjects=" + classTeacherSubjects + "]";
	}


}
