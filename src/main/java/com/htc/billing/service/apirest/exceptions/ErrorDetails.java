package com.htc.billing.service.apirest.exceptions;

public class ErrorDetails {

	private String serviceCode;
	
	private String message;

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
