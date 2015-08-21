package com.spring.login.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.login.vo.userPassVO;

@Repository
public class userPassDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	
	public void insertUserPass(userPassVO vo) throws Exception {
		sessionTemplate.insert("com.spring.login.mapper.insertUserPass", vo);
	}
	
	public userPassVO selectUserPass(userPassVO vo) throws Exception {
		return vo;
	}
	
	public List selectUserPassList(userPassVO vo) throws Exception {
		
		return null;
	}
	
}
