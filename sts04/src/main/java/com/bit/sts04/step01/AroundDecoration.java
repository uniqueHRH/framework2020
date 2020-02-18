package com.bit.sts04.step01;

import java.util.concurrent.ExecutionException;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundDecoration implements MethodInterceptor {
//	MethodInterceptor : target 메소드 실행 전,중,후 실행 중 Exception 발생 시 공통기능 정의
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj=null;
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		try {
			obj=invocation.proceed();   // 메소드 호출하지 않을 경우, target 메소드 호출이 안 됨
			System.out.println("*---*---*---*---*---*---*---*");
		} catch (Exception e ) {
			System.out.println("에러처리");
		}
		
		return obj;
	}

}
