package com.supers.sb.hw.springboothw.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.supers.sb.hw.springboothw.exception.CustomerFieldException;
import com.supers.sb.hw.springboothw.exception.NotAMajorAgeCustomerException;

@ControllerAdvice
public class GlobalExceptionHandlerController {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerController.class);

	@ExceptionHandler(value = {CustomerFieldException.class,NotAMajorAgeCustomerException.class})
	public ModelAndView handleAgeErrors(Exception ex) {
	
		ModelAndView mvError = new ModelAndView();
		mvError.addObject("message",ex.getMessage());
		
		mvError.setViewName("error");
		
		//ToDo  - Correct this
		//ex.printStackTrace();
		
		logger.error("Error Occured-"+ex.getMessage(),ex);
		
			
		return mvError;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleRTErrors(Exception ex) {
		
		
		ModelAndView mvError = new ModelAndView();
		mvError.addObject("message","System is not responding, try after some time");
		
		mvError.setViewName("error");
		
		

		logger.error("Error Occured-"+ex.getMessage(),ex);
		
		
		return mvError;
		
	}
	
}
