package com.supers.sb.hw.springboothw.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.supers.sb.hw.springboothw.dto.CustomerDTO;
import com.supers.sb.hw.springboothw.entity.Customer;
import com.supers.sb.hw.springboothw.exception.CustomerFieldException;
import com.supers.sb.hw.springboothw.exception.NotAMajorAgeCustomerException;
import com.supers.sb.hw.springboothw.service.CustomerManager;
import com.supers.sb.hw.springboothw.util.MathUtil;

@Controller
public class CustomerController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerManager custService;
	
	@Autowired
	private MathUtil mutil;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewCustomerPage(Model model) {
		logger.debug("In REGISTRATION");
		model.addAttribute("mycustomer", new CustomerDTO());
		System.out.println(mutil.add(10, 11));
		return "register";
	}

	@RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	public ModelAndView viewCustomerPage(@Valid  
										@ModelAttribute("mycustomer") CustomerDTO customer,
										BindingResult response
			) throws Exception {

		ModelAndView mv = new ModelAndView();
		
		System.out.println(customer.toString());
		
		//System.out.println(response.hasErrors());
		//System.out.println(response.getAllErrors().toString());
		
		
		if (response.hasErrors()) {
//			List<String> errMessages = response.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
//			errMessages.forEach(System.out::println);
			//throw new CustomerFieldException(errMessages.toString());
			mv.setViewName("register");
			return mv;
		}

		Customer cust = new Customer();
		cust.setAge(customer.getAge());
		cust.setDob(new Date());
		cust.setEmail(customer.getEmail());
		cust.setName(customer.getName());
		
		
		custService.save(cust);
		
		Optional<Customer> c = custService.fetchCustomerById(cust.getId());
		 

		//customer.setName(customer.getName().concat(custService.getCustomers()));
		
		//boolean b = custService.verifyAge(customer.getAge());
		
		mv.setViewName("status");
		mv.addObject("status", "CUstomer Created.." + c.get());
		mv.addObject("res", customer);

		return mv;
	}

}
