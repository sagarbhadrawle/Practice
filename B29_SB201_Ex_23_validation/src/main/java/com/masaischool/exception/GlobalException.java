package com.masaischool.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleInvalidMedthodArguments(MethodArgumentNotValidException ex)
	{
		List<ObjectError> allError = ex.getAllErrors();
		List<String> errorsToStringList= MethodArgumentNotValidException.errorsToStringList(allError);
		String message = String.join(", ", errorsToStringList);
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
	}
}
