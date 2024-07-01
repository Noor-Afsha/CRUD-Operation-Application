package com.ApplicationForms.project.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "wa_applications")
public class ApplicationModel {

	@Id
	private String id;

	@Column(name = "FIRST_NAME")
	private String firstNme;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;

	@Column(name = "COLLEGE_NAME")
	private String collegeName;

	@Column(name = "DOB")
	private Date dob;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private List<ApplicatonImage> applicatonImages;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private List<ApplicationDocument> applicationDocument;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstNme() {
		return firstNme;
	}

	public void setFirstNme(String firstNme) {
		this.firstNme = firstNme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<ApplicatonImage> getApplicatonImages() {
		return applicatonImages;
	}

	public void setApplicatonImages(List<ApplicatonImage> applicatonImages) {
		this.applicatonImages = applicatonImages;
	}

	public List<ApplicationDocument> getApplicationDocument() {
		return applicationDocument;
	}

	public void setApplicationDocument(List<ApplicationDocument> applicationDocument) {
		this.applicationDocument = applicationDocument;
	}

	@Override
	public String toString() {
		return "ApplicationModel [id=" + id + ", firstNme=" + firstNme + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", collegeName=" + collegeName + ", dob=" + dob
				+ ", applicatonImages=" + applicatonImages + ", applicationDocument=" + applicationDocument + "]";
	}


}
