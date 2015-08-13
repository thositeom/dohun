package com.spring.mybatis.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mybatis.vo.mybatisVO;

@Repository
public class mybatisDAO {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public int insertMybatis(mybatisVO vo){
		return sessionTemplate.insert("com.spring.mybatis.mapper.insertMybatis",vo); 
	}
	
	public int updateMybatis(mybatisVO vo){
		return sessionTemplate.update("com.spring.mybatis.mapper.updateMybatis", vo); 
	}
	
	public int deleteMybatis(mybatisVO vo){
		return sessionTemplate.delete("com.spring.mybatis.mapper.deleteMybatis", vo); 
	}
	
	public mybatisVO selectMybatis(mybatisVO vo){
		return sessionTemplate.selectOne("com.spring.mybatis.mapper.selectMybatis", vo); 
	}
	
	public List selectListMybatis(){
		return sessionTemplate.selectList("com.spring.mybatis.mapper.selectListMybatis"); 
	}
	
}
