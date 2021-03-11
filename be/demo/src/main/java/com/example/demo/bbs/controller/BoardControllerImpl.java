package com.example.demo.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.bbs.domain.BoardDto;

@Controller
public class BoardControllerImpl implements BoardController {
	@Autowired BoardDto board;
	
	public void communityBoard() {
		board.getBoardNo();
		board.getTitle();
		board.getIndex();
		board.getDate();
		board.getWriter();
	}
}
