package com.spring.board.service;

import java.util.List;

import com.spring.board.vo.boardVO;

public interface boardService {

	public void insertBoard(boardVO vo) throws Exception;
	public boardVO selectBoard(boardVO vo) throws Exception;
	public List selectBoardList(boardVO vo) throws Exception;
	public void updateBoard(boardVO vo) throws Exception;
	public void deleteBoard(boardVO vo) throws Exception;
	
}
