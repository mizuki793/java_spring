package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.constants.Button;

@Service
public class ButtonService {

	public List<Button> getButtonList() {
		List<Button> buttonList = new ArrayList<Button>();
		buttonList.add(new Button("自己紹介","introduction"));
		buttonList.add(new Button("好きな本","book"));
		buttonList.add(new Button("好きなアニメ","anime"));
		buttonList.add(new Button("好きな動画","movie"));

		return buttonList;
	}
}
