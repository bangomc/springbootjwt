package com.cris.springbootjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "Home";
	}
}