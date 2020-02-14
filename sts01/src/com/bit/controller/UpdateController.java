package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;

public class UpdateController implements Controller {
	Emp02Dao dao=new Emp02Dao();
	
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		
		dao.updateOne(sabun, name, pay);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/detail.bit?sabun="+sabun);
		return mav;
	}

}
