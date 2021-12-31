package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.base.IntroductionPage;
import com.example.demo.base.TopPage;
import com.example.demo.constants.Button;
import com.example.demo.service.ButtonService;

@Controller
public class TopController {

	@Autowired
	ButtonService buttonService;

	@Autowired
	TopPage topPage;

	@Autowired
	IntroductionPage introductionPage;

	String pageHtml = "";

	 @RequestMapping("/")
	  public String index(Model model) {
		pageHtml = topPage.GetHtml();
		List<Button> buttonList = buttonService.getButtonList();
		model.addAttribute("buttonList" ,buttonList);
	    return pageHtml;

	 }

	@RequestMapping("/introduction")
	 public String introduction(Model model) {
		pageHtml = introductionPage.GetHtml();
		model.addAttribute("title",introductionPage.GetTitle());
	   return pageHtml;
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