package com.te.empwebapp.exception;

public class EmployeeException extends RuntimeException {

	String message;

	public EmployeeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
