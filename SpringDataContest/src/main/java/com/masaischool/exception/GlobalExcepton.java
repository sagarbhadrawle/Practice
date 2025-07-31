package com.masaischool.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice

public class GlobalExcepton {

	@ExceptionHandler(StundentNotFoundRoll.class)
	public ResponseEntity<ErrorDetail> myHandler(StundentNotFoundRoll st, WebRequest wb)
	{
		ErrorDetail er = new ErrorDetail(LocalDateTime.now(), st.getMessage(),wb.getDescription(false));
		
		
		return new ResponseEntity<ErrorDetail>(er, HttpStatus.BAD_REQUEST); 
	}
	
	
	
}
