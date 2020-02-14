package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.entity.Emp02Vo;

public class ListController implements Controller {
	Emp02Dao dao;   // 한 번만 만들어서 반복 사용한다
	
	
//	get 이 아니라 set 을 쓰는 이유 : 여기서 바로 활용하는 것이 아니라,
//	모든 것은 day01-servlet.xml 에서 받아오기 때문에, set 으로 사용한다
	public void setDao(Emp02Dao dao) { 
		this.dao=dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<Emp02Vo> list=dao.selectAll();
		String viewName="list";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("alist",list);   // getAttribute 안하고, addObject만 해도 값을 보낼 수 있다 (list.jsp 에서 setAttribute 할 수 있다) 
		mav.setViewName(viewName);
		return mav;
	}

}
