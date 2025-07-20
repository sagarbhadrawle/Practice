package com.masai.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	
	private LocalDateTime timestamp;
	private String message;
	private String URI;
	public ErrorDetails() {
	
		// TODO Auto-generated constructor stub
	}
	public ErrorDetails(LocalDateTime timestamp, String message, String uRI) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		URI = uRI;
	}
	LocalDateTime getTimestamp() {
		return timestamp;
	}
	void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	String getMessage() {
		return message;
	}
	void setMessage(String message) {
		this.message = message;
	}
	String getURI() {
		return URI;
	}
	void setURI(String uRI) {
		URI = uRI;
	}
	
	
	
}
