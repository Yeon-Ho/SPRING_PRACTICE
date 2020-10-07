package com.yeon.www.board.model.service;

import java.util.List;

import com.yeon.www.board.model.vo.Board;

public interface BoardService {

	//게시글 목록 조회
	public List<Board> selectBoardList();
}
