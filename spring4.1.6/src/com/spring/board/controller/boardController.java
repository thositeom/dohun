package com.spring.board.controller;

import java.util.List;

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
		List listResult = null ;
		
		vo.setBoardId(request.getParameter("boardId"));
		vo.setBoardRid(request.getParameter("boardRid"));
		vo.setDomainId(request.getParameter("domainId"));
		
		try {
			if(request.getParameter("boardId") != "" && request.getParameter("boardId") != null){
				boardService.insertBoard(vo);
			}
			
			listResult = (List) boardService.selectBoardList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("listResult", listResult);
		mav.setViewName("/board/board");
		
		return mav;
	}
	
}
