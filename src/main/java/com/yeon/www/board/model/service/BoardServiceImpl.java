package com.yeon.www.board.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeon.www.board.model.dao.BoardDao;
import com.yeon.www.board.model.dao.BoardDaoImpl;
import com.yeon.www.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDaoImpl = new BoardDaoImpl() ;

	@Override
	public List<Board> selectBoardList() {
		return boardDaoImpl.selectBoard();
	}
}
