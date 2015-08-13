package com.spring.mybatis.service;

import java.util.List;

import com.spring.mybatis.vo.mybatisVO;

public interface mybatisService {

	public void insertMybatis(mybatisVO vo) throws Exception;
	
	public void updateMybatis(mybatisVO vo) throws Exception;
 
	public void deleteMybatis(mybatisVO vo) throws Exception;
	
	public mybatisVO selectMybatis(mybatisVO vo) throws Exception;
	
	public List selectListMybatis() throws Exception;
}
