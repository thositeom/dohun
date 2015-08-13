package com.spring.mybatis.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mybatis.dao.mybatisDAO;
import com.spring.mybatis.service.mybatisService;
import com.spring.mybatis.vo.mybatisVO;

@Service
public class mybatisServiceImp implements mybatisService{

	@Autowired mybatisDAO mybaDao;
	
	@Override
	public void insertMybatis(mybatisVO vo) throws Exception {
		mybaDao.insertMybatis(vo);
	}

	@Override
	public void updateMybatis(mybatisVO vo) throws Exception {
		mybaDao.updateMybatis(vo);
	}

	@Override
	public void deleteMybatis(mybatisVO vo) throws Exception {
		mybaDao.deleteMybatis(vo);
	}

	@Override
	public mybatisVO selectMybatis(mybatisVO vo) throws Exception {
		return mybaDao.selectMybatis(vo);
	}

	@Override
	public List selectListMybatis() throws Exception {
		return mybaDao.selectListMybatis();
	}

}
