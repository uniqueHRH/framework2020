package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;

public class DeleteController implements Controller {
	Emp02Dao dao=new Emp02Dao();
	
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}
	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		
		ModelAndView mav=new ModelAndView();
		dao.deleteOne(sabun);
		mav.setViewName("redirect:/list.bit");
		return mav;
	}

}
