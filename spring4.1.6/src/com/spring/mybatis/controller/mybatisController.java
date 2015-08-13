package com.spring.mybatis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mybatis.service.mybatisService;
import com.spring.mybatis.vo.mybatisVO;

@Controller
public class mybatisController {

	@Autowired
	private mybatisService mybatisService;

	@RequestMapping(value = "/index.do")
	public ModelAndView mybatisInit(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List listResult = null;
		mybatisVO vo = new mybatisVO();

		vo.setId(request.getParameter("id"));
		vo.setPwd(request.getParameter("pwd"));
		try {

			if (request.getParameter("id") != null
					&& request.getParameter("pwd") != null) {
				mybatisService.insertMybatis(vo);
			}
			listResult = (List) mybatisService.selectListMybatis();
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("listResult", listResult);
		mav.setViewName("/test/result");

		return mav;
	}

	@RequestMapping(value = "/udTest.do")
	public ModelAndView mybatisDelete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mybatisVO vo = new mybatisVO();

		vo.setId(request.getParameter("udVal"));

		if (request.getParameter("udVal") != null ) {
			mybatisService.deleteMybatis(vo);
		}

		RedirectView rv = new RedirectView();
		rv.setUrl("/index.do");
		mav.setView(rv);
		return mav;
	}

}
