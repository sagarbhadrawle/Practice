package com.masaischool.exception;

import java.time.LocalDateTime;

public class ErrorDetail {
	
	private LocalDateTime timeStamp;
	private String message;
	private String url;
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorDetail(LocalDateTime timeStamp, String message, String url) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.url = url;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ErrorDetail [timeStamp=" + timeStamp + ", message=" + message + ", url=" + url + "]";
	}
	
	
	
	
}
