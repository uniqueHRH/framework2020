package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.Emp02Dao2;

public class InsertController implements Controller {
	Emp02Dao2 dao;
	

	public void setDao(Emp02Dao2 dao) {
		this.dao = dao;
	}

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		if("GET".equals(req.getMethod())) {
			mav.setViewName("add");
			return mav;
		}
		
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		dao.insertOne(sabun, name, pay);

		mav.setViewName("redirect:/list.bit");
		return mav;
	}

}
