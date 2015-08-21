package com.spring.login.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.boardDAO;
import com.spring.login.dao.userPassDAO;
import com.spring.login.service.userPassService;
import com.spring.login.vo.userPassVO;

@Service("userPassService")
public class userPassServicImpl implements userPassService {

	@Autowired
	userPassDAO userPassDAO;
	
	@Override
	public void insertUserPass(userPassVO vo) throws Exception{
		userPassDAO.insertUserPass(vo);
	}
	
	@Override
	public userPassVO selectUserPass(userPassVO vo) throws Exception {
		return null;
	}

	@Override
	public List selectUserPassList(userPassVO vo) throws Exception {
		return null;
	}

}
