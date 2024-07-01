package com.ApplicationForms.project.dto;

public class ApiResponse {
	private String statusCode;
	private String message;
	private String status;

	public int getStatusCode(int statusCode) {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage(String message) {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus(String status) {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApiResponse [statusCode=" + statusCode + ", message=" + message + ", status=" + status + "]";
	}

}
