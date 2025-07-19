package com.masaischool.B28_SB201_Ex_24.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
		
	private LocalDateTime timeStamp;
	private String message;
	private String uri;
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorDetails(LocalDateTime timeStamp, String message, String uri) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.uri = uri;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public String getUri() {
		return uri;
	}
	
	
	
}
