package com.supers.sb.hw.springboothw.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyDefaultConfig {

	@Value("${customer.name}")
	private String custName;
	
	@Value("${customer.address}")
	private String custAddress;
	
	@Value("${customer.phone}")
	private String custPhone;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	
	
	
}
