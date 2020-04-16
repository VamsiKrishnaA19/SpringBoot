package com.pnc.springboot.SpringBootActuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pncbank/actuator")
public class WelcomeActuatorCotroller {
	
	@RequestMapping(value="/hi")
	public String actuator() {
		return "Welcome To SpringBoot Actuator Endpoints";
	}
}
