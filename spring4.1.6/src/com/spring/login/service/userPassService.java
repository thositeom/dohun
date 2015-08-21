package com.spring.login.service;

import java.util.List;

import com.spring.login.vo.userPassVO;


public interface userPassService {
	public void insertUserPass(userPassVO vo) throws Exception;
	public userPassVO selectUserPass(userPassVO vo) throws Exception;
	public List selectUserPassList(userPassVO vo) throws Exception;
}
