package com.ApplicationForms.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wa_app_documents")
public class ApplicationDocument {

	@Id
	private String documentId;

	private String documentCategory;

	private String documentType;

	private String documentData;

	private String fileName;

	private String id;

	private String idNumber;

	private Date idIssueDate;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentData() {
		return documentData;
	}

	public void setDocumentData(String documentData) {
		this.documentData = documentData;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getIdIssueDate() {
		return idIssueDate;
	}

	public void setIdIssueDate(Date idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	@Override
	public String toString() {
		return "ApplicationDocument [documentId=" + documentId + ", documentCategory=" + documentCategory
				+ ", documentType=" + documentType + ", documentData=" + documentData + ", fileName=" + fileName
				+ ", id=" + id + ", idNumber=" + idNumber + ", idIssueDate=" + idIssueDate + "]";
	}

}
