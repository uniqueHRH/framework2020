package com.bit.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex01.bit")
public class Ex01Controller extends HttpServlet {
	Logger log=Logger.getLogger("com.bit.controller.Ex01Controller");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("ex01.jsp").forward(req, resp);
		
		
		
		
		
//		log 를 사용하기 위해서는, Logger 로 log 객체를 호출해서 사용할 수 있다
//		사용할 클래스를 선언해준다
//		System.out.print 보다 log 가 더 효율적이다
//		해당 경우에만 사용한다
//		Level newLevel=Level.CONFIG;   // 내가 레벨을 설정할 수 있다
//		log.setLevel(newLevel);
//		log.info("ex01 page 출력");
//		log.warning("주의메시지로 출력");
//		log.severe("주의메시지로 출력");
//		log.config("config");
//		log.fine("fine");
//		log.finer("finer");
//		log.finest("finest");
//		
//		System.out.println("controller servlet run");
//		
//		HttpSession session=req.getSession();
//		session.removeAttribute("msg");
//		
//		HttpSession session=req.getSession();
//		log.info(session.getId());
//		session.invalidate();   // session 을 갱신한다
//		System.out.println("세션갱신");
//		log.info(session.getId());
	}
}
