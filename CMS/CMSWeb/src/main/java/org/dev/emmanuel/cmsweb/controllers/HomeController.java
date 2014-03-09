package org.dev.emmanuel.cmsweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
}
