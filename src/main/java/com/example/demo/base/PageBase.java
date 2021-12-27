package com.example.demo.base;

class PageBase implements IPage {
	//finalの宣言では駄目な理由が分からない。
	protected String html;
	protected String title;

	public String GetHtml() {
		return html;
	}

	public String GetTitle() {
		return title;
	}
}