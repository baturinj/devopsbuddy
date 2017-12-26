package com.devopsbuddy.controllers;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
	
	@RequestMapping("/sayhello")
	public String sayHello() {
		
		return "index";
	
}

}
