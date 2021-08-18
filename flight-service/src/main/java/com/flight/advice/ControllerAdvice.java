package com.flight.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flight.exception.FlightNotFoundException;



public class ControllerAdvice {
	
//	@ExceptionHandler(FlightNotFoundException.class)
//	public ResponseEntity<String> handleException(FlightNotFoundException e){
//		System.out.println(e.getMessage());
//		return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
//	}

}
