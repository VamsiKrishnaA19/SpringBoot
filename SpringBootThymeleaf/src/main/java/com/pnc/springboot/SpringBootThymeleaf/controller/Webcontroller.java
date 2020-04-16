package com.pnc.springboot.SpringBootThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/pncbank")
public class Webcontroller {
	
	@RequestMapping(value="/thymleaf")
	public String sayHello() {
		return "index";
	}
	
}
