package com.spring.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.boardDAO;
import com.spring.board.service.boardService;
import com.spring.board.vo.boardVO;

@Service
public class boardServiceImpl implements boardService {

	@Autowired
	private boardDAO boardDao;
	
	@Override
	public void insertBoard(boardVO vo) throws Exception {
		System.out.println("checkService");
		boardDao.insertBoardDAO(vo);
	}

	@Override
	public boardVO selectBoard(boardVO vo) throws Exception {
		return boardDao.selectBoardDAO(vo);
	}

	@Override
	public List selectBoardList() throws Exception {
		return boardDao.selectBoardDAOList();
	}

	@Override
	public void updateBoard(boardVO vo) throws Exception {
		boardDao.updateBoardDAO(vo);
	}

	@Override
	public void deleteBoard(boardVO vo) throws Exception {
		boardDao.deleteBoardDAO(vo);
	}

}
