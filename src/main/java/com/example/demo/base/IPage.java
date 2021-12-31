package com.example.demo.base;

import org.springframework.ui.Model;

//インターフェースの実装
public interface IPage {

	public String GetHtml(Model model);
//	public String GetTitle();
}
