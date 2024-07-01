package com.ApplicationForms.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@Entity
@JsonPOJOBuilder
@Table(name = "wa_app_images")
public class ApplicatonImage {

	@Id
	private String imageId;

	private String imageType;

	private String fileName;

	private String title;

	private String id;
	
	private String imageData;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	@Override
	public String toString() {
		return "ApplicatonImage [imageId=" + imageId + ", imageType=" + imageType + ", fileName=" + fileName
				+ ", title=" + title + ", id=" + id + ", imageData=" + imageData + "]";
	}

}
