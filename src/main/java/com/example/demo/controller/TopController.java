package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.constants.Button;
import com.example.demo.service.ButtonService;

	@Controller
	@RequestMapping("/top")
	public class TopController {

		@Autowired
		ButtonService buttonService;


	 @RequestMapping("/")
	  public String index(Model model) {
		List<Button> buttonList = buttonService.getButtonList();
		model.addAttribute("buttonList" ,buttonList);
	    return "index";
	 }

	@RequestMapping("introduction")
	 public String introduce() {
	   return "introduction";
	}

}