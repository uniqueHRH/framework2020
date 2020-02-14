package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
		
		return "success";   // struts.xml 에서 선언한 이름을 사용할건지 말건지 결정한다
	}
	

}
