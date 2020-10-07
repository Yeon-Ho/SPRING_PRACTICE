package com.yeon.www.board.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yeon.www.board.model.vo.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Board> selectBoard() {
		return sqlSession.selectList("BOARD.selectBoard");
	}
	
	
	
}
