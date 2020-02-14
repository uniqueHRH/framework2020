package com.bit.config;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

public class MyListener2 implements HttpSessionAttributeListener {   // session 작동에 따른 리스너
// 세션의 생성과 소멸
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("addAttr()");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("removeAttr()");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("editAttr()");
	}

	

}
