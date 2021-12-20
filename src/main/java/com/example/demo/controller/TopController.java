package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Button;


	@Controller
	@RequestMapping("/top")
	public class TopController {
	 @RequestMapping("/")
	  public String index(Model model) {
		Button introduction = new Button("自己紹介","introduction");
		Button book = new Button("好きな本","book");
		Button anime = new Button("好きなアニメ","anime");
		Button movie = new Button("好きな動画","movie");

		model.addAttribute("introduction",introduction);
		model.addAttribute("book",book);
		model.addAttribute("anime",anime);
		model.addAttribute("movie",movie);

	    return "index";
	 }
	@RequestMapping("introduction")
	 public String introduce() {
	   return "introduction";
	}
}