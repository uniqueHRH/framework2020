package com.bit.sts04.step01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;

public class AfterDecoration implements AfterAdvice{
	
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("====================");
	}
	
	public void afterThrowing(Exception ex) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
}
