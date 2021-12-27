package com.example.demo.base;

import org.springframework.context.annotation.Configuration;


@Configuration
public class TopPage extends PageBase{

	public String GetHtml() {
		String html = "index";
		return html;
	}

	public String GetTitle() {
		String title = "TOP";
		return title;
	}

}
