package com.bit.sts04.step01;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeDecoration implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0);   // func01() 메소드를 가리킨다
		System.out.println(Arrays.toString(arg1));   // parameter
		System.out.println(arg2);   // target 객체
	}
	
}
