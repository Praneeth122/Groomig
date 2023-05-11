package com.sapient.grooming.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice 
public class GloabalExceptionalHandler {

	@ExceptionHandler(value=UserNotFoundException.class)
	ResponseEntity<String> UserNotFoundExceptionhandler(UserNotFoundException exception){
		 return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
