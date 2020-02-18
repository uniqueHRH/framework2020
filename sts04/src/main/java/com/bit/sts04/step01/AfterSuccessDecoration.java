package com.bit.sts04.step01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterSuccessDecoration implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(returnValue);   // 사후 처리하는 메소드이므로, returnValue 를 사용할 수 있다
		System.out.println("====================");
	}

	
}
