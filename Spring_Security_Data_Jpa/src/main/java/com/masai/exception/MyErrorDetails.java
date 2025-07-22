package com.masai.exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String details;
	
}
