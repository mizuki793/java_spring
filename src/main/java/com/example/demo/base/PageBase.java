package com.example.demo.base;

import org.springframework.ui.Model;

class PageBase implements IPage {
	//finalの宣言では駄目な理由が分からない。
	protected String html;
	protected String title;

	public String GetHtml(Model model) {
		return html;
	}

	public String GetTitle() {
		return title;
	}
}