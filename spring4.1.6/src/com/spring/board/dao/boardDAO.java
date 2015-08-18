package com.spring.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.vo.boardVO;

@Repository
public class boardDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	//C
	public void insertBoardDAO(boardVO vo) throws Exception {
		System.out.println("checkDAO");
		sessionTemplate.insert("com.spring.board.mapper.insertBoard", vo);
	}
	
	//R
	public boardVO selectBoardDAO(boardVO vo) throws Exception {
		return sessionTemplate.selectOne("com.spring.board.mapper.insertBoard", vo);
	}
	
	//R
	public List selectBoardDAOList() throws Exception {
		return sessionTemplate.selectList("com.spring.board.mapper.selectBoardList");
	}
	
	//U
	public void updateBoardDAO(boardVO vo) throws Exception {
		sessionTemplate.update("com.spring.board.mapper.insertBoard", vo);
	}
	
	//D
	public void deleteBoardDAO(boardVO vo) throws Exception {
		sessionTemplate.delete("com.spring.board.mapper.insertBoard", vo);
	}
}
