package com.yeon.www.board.model.dao;

import java.util.List;

import com.yeon.www.board.model.vo.Board;

public interface BoardDao {

	//게시글 목록 조회
	public List<Board> selectBoard();
}
