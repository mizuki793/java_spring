package com.example.demo.base;

import org.springframework.ui.Model;

//インターフェースの実装
public interface IPage {

	public static String GetHtml(Model model) {
		return null;
	}
}

//baseクラスの実装
class PageBase implements IPage {
	//finalの宣言では駄目な理由が分からない。
	protected String html;
	protected String title;

	public String GetHtml(Model model) {
		return html;
	}
}