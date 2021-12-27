package com.example.demo.base;

import org.springframework.context.annotation.Configuration;


@Configuration
public class IntroductionPage extends PageBase{

	public String GetHtml() {
		String html = "introduction";
		return html;
	}

	public String GetTitle() {
		String title = "自己紹介";
		return title;
	}
}
