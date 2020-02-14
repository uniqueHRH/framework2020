package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
/*
	올 수 있는 속성은 총 다섯 개
	  public static final java.lang.String SUCCESS = "success";
	  public static final java.lang.String NONE = "none";			액션이 성공적으로 실행되었으나, 화면 출력이 안될 때
	  public static final java.lang.String ERROR = "error";
	  public static final java.lang.String INPUT = "input";			입력값이 부족하거나 문제가 있을 때, 입력 페이지로 돌아감
	  public static final java.lang.String LOGIN = "login";			로그인 값이 없어, 액션이 불가능하므로 로그인 페이지로 이동
*/
		
//		return "success";
//		return "error";
		return this.SUCCESS;
//		return this.ERROR;
	}

}
