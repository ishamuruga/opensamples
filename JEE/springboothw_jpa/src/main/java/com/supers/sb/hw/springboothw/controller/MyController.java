package com.supers.sb.hw.springboothw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController extends BaseController {

	@RequestMapping(value = "/init",method = RequestMethod.GET )
	public ModelAndView renderDefaultPage() {
		System.out.println("=========================inDefault Page");
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("status", "Value Created is.." + Math.random());
		return mv;
	}
	
	@RequestMapping(value = "/init/{id}",method = RequestMethod.GET )
	public ModelAndView renderDefaultPagewId(@PathVariable int id) {
		System.out.println("=========================inDefault Page");
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("status", id + "-,Value Created is.." + Math.random());
		return mv;
	}
	
	
	
}
