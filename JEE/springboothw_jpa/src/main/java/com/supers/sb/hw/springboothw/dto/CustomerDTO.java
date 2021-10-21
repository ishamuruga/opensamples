package com.supers.sb.hw.springboothw.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDTO {

	@NotNull(message = "Invalid Customer id")
	@Size(max = 10,min = 2)
	private String custid;

	
	@NotBlank(message = "Invalid BName")
	@NotNull(message = "Invalid Name")
	private String name;

	@NotBlank(message = "Invalid BEmail")
	@Email(message = "Invalid Email Entered")
	private String email;

	@Max(value = 98)
	@Min(value = 10)
	@NotNull(message = "Invalid Age")
	private int age;

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custid=" + custid + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
