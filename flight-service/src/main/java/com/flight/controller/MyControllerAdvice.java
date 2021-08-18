package com.flight.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flight.exception.FlightNotFoundException;
import com.flight.model.ExceptionMessage;

@ControllerAdvice
class MyControllerAdvice {
	@ExceptionHandler(FlightNotFoundException.class)
	public ResponseEntity<ExceptionMessage> handleException(FlightNotFoundException e){
		System.out.println(e.getMessage());
		return new ResponseEntity<ExceptionMessage>(new ExceptionMessage(e.getMessage(),HttpStatus.NO_CONTENT), HttpStatus.NO_CONTENT);
	}
//	@ExceptionHandler(FlightNotFoundException.class)
//	public ResponseEntity<String> handleException(FlightNotFoundException e){
//		System.out.println(e.getMessage());
//		return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
//	}
}
