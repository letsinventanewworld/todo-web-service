package com.tonasolution.rest.webservices.todowebservice.entity;

public class AuthenticationBean {
	private String message;
	
	
	public AuthenticationBean() {
	}

	public AuthenticationBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
