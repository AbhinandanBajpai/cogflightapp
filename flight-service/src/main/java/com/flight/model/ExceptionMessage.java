package com.flight.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ExceptionMessage {

	private String message;
	private LocalDateTime date;
	private HttpStatus status;
	public ExceptionMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionMessage(String message, HttpStatus status) {
		super();
		this.message = message;
		this.date = LocalDateTime.now();
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ExceptionMessage [" + (message != null ? "message=" + message + ", " : "")
				+ (date != null ? "date=" + date + ", " : "") + (status != null ? "status=" + status : "") + "]";
	}
	
	
	
	
}
