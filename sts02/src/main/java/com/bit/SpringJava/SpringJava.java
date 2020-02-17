package com.bit.SpringJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.service.Remote;

public class SpringJava {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext() : XML 파일을 읽어서 초기화시킨다
		org.springframework.context.ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Remote obj=(Remote)ac.getBean("remote");   // xml 의 bean 값을 인자로 가져온다
		obj.func3();
	}

}
