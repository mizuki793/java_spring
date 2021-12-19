package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


	@Controller
	@RequestMapping()
	public class SelectController {
	@RequestMapping(params="introduction", method = RequestMethod.POST)
	 public String introduce() {
	   return "introduction";
	}
}