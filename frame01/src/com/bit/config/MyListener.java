package com.bit.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {   // 실질적으로 제일 많이 사용하는 메소드
// 리스너도 web.xml 작업해야하며, 어노테이션(@WebListener)으로 대체가 가능하다
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {   // 서버가 실행될 때
		System.out.println("WAS destroy");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {   // 서버가 종료될 때
		System.out.println("WAS init");
	}
	

}
