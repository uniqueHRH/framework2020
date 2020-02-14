package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.entity.Emp02Vo;

public class DetailController implements Controller {
	Emp02Dao dao;
	
	
	
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}




	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav=new ModelAndView();
		Emp02Vo bean=dao.selectOne(Integer.parseInt(req.getParameter("sabun")));
		
		mav.setViewName("detail");
		mav.addObject("bean",bean);
		return mav;
	}

}
