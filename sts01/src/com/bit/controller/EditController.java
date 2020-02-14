package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;

public class EditController implements Controller {
	Emp02Dao dao=new Emp02Dao();
	
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("bean",dao.selectOne(Integer.parseInt(req.getParameter("sabun"))));
		mav.setViewName("edit");
		return mav;
	}

}