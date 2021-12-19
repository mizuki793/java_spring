package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	@RequestMapping("/top")
	public class TopController {
	 @RequestMapping("/")
	  public String index() {
	    return "index";
	 }
	@RequestMapping("introduction")
	 public String introduce() {
	   return "introduction";
	}
}