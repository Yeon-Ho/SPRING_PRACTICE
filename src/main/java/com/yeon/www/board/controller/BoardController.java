package com.yeon.www.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yeon.www.board.model.service.BoardService;
import com.yeon.www.board.model.vo.Board;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	//게시판 목록 조회
	@RequestMapping(value="/list" , method=RequestMethod.GET)
	public void list(Model model) {
		
		List<Board> boardList = boardService.selectBoardList();
		model.addAttribute("boardData", boardList);
	}
	
	
}
