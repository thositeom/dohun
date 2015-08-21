package com.spring.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.login.service.userPassService;
import com.spring.login.vo.userPassVO;

@Controller
public class loginController {

	@Autowired
	userPassService userPassService;
	
	@RequestMapping(value="/login/loginCheck.do")
	public ModelAndView loginCheck(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pwd"));

		Map resultMap = new HashMap();
		resultMap.put("id", request.getParameter("id"));
		resultMap.put("pwd", request.getParameter("pwd"));
		mav.addAllObjects(resultMap);
		mav.setViewName("jsonView");
		return mav;
	}
	
	
	@RequestMapping(value="/login/joinUser.do")
	public ModelAndView joinUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();

		userPassVO vo = new userPassVO();
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pwd"));
		
		vo.setUserId(request.getParameter("id"));
		vo.setNmKor(request.getParameter("pwd"));
		
		try {
			userPassService.insertUserPass(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mav.setViewName("jsonView");
		return mav;
	}

	
}

