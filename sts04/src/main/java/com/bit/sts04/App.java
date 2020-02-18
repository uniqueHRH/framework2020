package com.bit.sts04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.sts04.module.Module01;

public class App {
	
    public static void main( String[] args ) {
    	ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
    	Module01 module01=(Module01)context.getBean("custom");
//    	ApplicationContext, ClassPathXmlApplicationContext : xml 불러오는 구문들
    	
    	module01.func01(); 
    	module01.func02("java");
    	module01.func03();
    	module01.function04();
    	module01.print01();
    }
}

/*
	ApplicationContext
	 - IOC 컨테이너, Spring 컨테이너
	 - getBean() 을 호출하면, Bean 목록에서 해당 명을 찾는다
*/
