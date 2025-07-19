package com.masaischool.B28_SB201_Ex_24.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptoin {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> NoExceptionFound(NoHandlerFoundException ex, WebRequest request)
	{
		ErrorDetails er = new ErrorDetails(LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDetails> NoStudentFound(StudentNotFoundException st , WebRequest request)
	{
		ErrorDetails er = new ErrorDetails(LocalDateTime.now(),st.getMessage(),request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.NOT_FOUND);
	}
	
}	
