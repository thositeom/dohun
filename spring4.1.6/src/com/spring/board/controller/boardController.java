package com.spring.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.service.boardService;
import com.spring.board.vo.boardVO;

@Controller
public class boardController {
	
	@Autowired
	private boardService boardService;
	
	@RequestMapping(value="/board/initBoard.do")
	public ModelAndView initBoard(){
		ModelAndView mav = new ModelAndView();
		return mav;
	}

	@RequestMapping(value="/board/insertBoard.do")
	public ModelAndView insertBoard(HttpServletRequest request, HttpServletResponse respons){
		ModelAndView mav = new ModelAndView();
		boardVO vo = new boardVO();
		
		vo.setBoardId(request.getParameter("boardId"));
		
		vo.setDomainId(1);
		
		try {
			System.out.println("check01");
			boardService.insertBoard(vo);
			System.out.println("checkEnd");
		} catch (Exception e) {
			System.out.println("checkError");
			e.printStackTrace();
		}
		mav.setViewName("board/board");
		
		return mav;
	}
	
}
