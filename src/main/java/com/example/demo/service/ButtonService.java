package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.constants.Button;

@Service
public class ButtonService {

	public List<Button> getButtonList() {
		List<Button> buttonList = new ArrayList<Button>();
		Button introduction = new Button("自己紹介","introduction");
		Button book = new Button("好きな本","book");
		Button anime = new Button("好きなアニメ","anime");
		Button movie = new Button("好きな動画","movie");

		buttonList.add(introduction);
		buttonList.add(book);
		buttonList.add(anime);
		buttonList.add(movie);

		return buttonList;
	}
}
