package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.constants.Button;
import com.example.demo.service.ButtonService;

@Controller
public class TopController {

	@Autowired
	ButtonService buttonService;


	 @RequestMapping("/")
	  public String index(Model model) {
		List<Button> buttonList = buttonService.getButtonList();
		model.addAttribute("buttonList" ,buttonList);
	    return "index";
	 }

	@RequestMapping("/introduction")
	 public String introduction() {
	   return "introduction";
	}

	@RequestMapping("/book")
	 public String book(Model model) {
	   return "book";
	}

	@RequestMapping("/anime")
	 public String anime(Model model) {
	   return "anime";
	}

	@RequestMapping("/movie")
	 public String movie(Model model) {
	   return "movie";
	}


}