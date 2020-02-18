package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Dept01Dao;
import com.bit.model.entity.Dept01Vo;

public class DeptAddController extends AbstractCommandController {
//	AbstractCommandController : client 요청 파라미터를 모델객체로 처리할 수 있는 컨트롤러
	Dept01Dao dao;
	
	public void setDao(Dept01Dao dao) {
		this.dao = dao;
	}
	
//	onBindAndValidate : 검증처리를 마친 후 호출된다 / default 에서는 아무 동작 없음
//	ModelAndView 동작 후 실행된다
//	request : 요청  /  command : 명령 객체  /  errors : 오류가 발생한 경우 다시 작성된다
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		Dept01Vo bean=(Dept01Vo) command;
		
		if(bean.getDname().isEmpty()) {
			ObjectError error=new ObjectError("dname", "NAME NOT NULL");
			errors.addError(error);
		}
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		String path="redirect:list.bit";
		request.setCharacterEncoding("utf-8");
		
		if(errors.hasErrors()) {
			List<ObjectError> list = errors.getAllErrors();
			ObjectError err = list.get(0);
			path+="?err="+err.getDefaultMessage();
			System.out.println("default err : "+err.getDefaultMessage());
		}else {
			Dept01Vo bean=(Dept01Vo) command;
			dao.insertOne(bean);
		}
		ModelAndView mav=new ModelAndView(path);
		return mav;
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// mysql시 url에 다음 추가 
//		// ?useUnicode=true&amp;characterEncoding=UTF-8
//		//
//		// post한글처리
//		request.setCharacterEncoding("utf-8");
//		
//		Dept01Vo bean=new Dept01Vo();
//		bean.setDname(request.getParameter("dname"));
//		bean.setLoc(request.getParameter("loc"));
//		dao.insertOne(bean);
//		ModelAndView mav=new ModelAndView("redirect:list.bit");
//		return mav;
//	}

}