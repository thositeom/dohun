package com.spring.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

	@RequestMapping(value="/login/loginCheck.do")
	public ModelAndView loginCheck(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("check-1");
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
	
	
}

