package com.bit.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServlet extends HttpServlet {   // web.xml 에서 와일드처리를 했기 때문에, 모든 경로에서 이 페이지를 지나간다
	Map<String,String> map=new HashMap<>();   // key, value 로 주소를 저장하기 위해
	
	@Override
	public void init() throws ServletException {
		map.put("/", "com.bit.controller.IndexController");
		map.put("/intro", "com.bit.controller.IntroController");
		map.put("/bbs/list", "com.bit.controller.ListController");
		map.put("/bbs/add", "com.bit.controller.AddController");
		map.put("/bbs/insert", "com.bit.controller.InsertController");
		map.put("/bbs/detail", "com.bit.controller.DetailController");
		map.put("/bbs/update", "com.bit.controller.UpdateController");
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doBit(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");   // 이제 post 의 모든 방식은 한글처리가 된다
		doBit(req,resp);
	}

	
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url=req.getRequestURI();
		url=url.substring(req.getContextPath().length());   // url 에서 경로의 길이만큼 자른다 (url:frame02) . 그럼 "/" 만 남는다
		BitController controller=null;
		String info=map.get(url);

		try {
			Class<?> clzz = Class.forName(info);
			controller = (BitController) clzz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		String viewName=controller.execute(req);   // if 문마다 사용하기 번거로우니 밖으로 뺀다

		if(viewName.startsWith("redirect:")) {
			resp.sendRedirect(viewName.substring(9));
		}else {
			String prifix = "/WEB-INF/view/";
			String suffix = ".jsp";
			viewName=prifix+viewName+suffix;
			RequestDispatcher rd = req.getRequestDispatcher(viewName);
			rd.forward(req,resp);
		}
	}
}