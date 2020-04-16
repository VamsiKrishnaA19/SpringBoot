package com.pnc.springboot.SpringBootJWT.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pncbank")
public class EmployeeController {
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String welcomePage() {
		return "Welcome Spring Boot JWT Example...";
	}
}
