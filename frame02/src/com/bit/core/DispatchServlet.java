package com.bit.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServlet extends HttpServlet {   // web.xml ���� ���ϵ�ó���� �߱� ������, ��� ��ο��� �� �������� ��������
	Map<String,String> map=new HashMap<>();   // key, value �� �ּҸ� �����ϱ� ����
	
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
		req.setCharacterEncoding("utf-8");   // ���� post �� ��� ����� �ѱ�ó���� �ȴ�
		doBit(req,resp);
	}

	
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url=req.getRequestURI();
		url=url.substring(req.getContextPath().length());   // url ���� ����� ���̸�ŭ �ڸ��� (url:frame02) . �׷� "/" �� ���´�
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
		String viewName=controller.execute(req);   // if ������ ����ϱ� ���ŷο�� ������ ����

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