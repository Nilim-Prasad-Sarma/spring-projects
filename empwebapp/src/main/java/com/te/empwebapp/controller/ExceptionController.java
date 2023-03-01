package com.te.empwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.empwebapp.exception.EmployeeException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(EmployeeException.class)
	public String excepHandler(HttpServletRequest request , EmployeeException exception ) {
		request.setAttribute("errMsg", exception.getMessage());
		return "loginForm";
	}
}
