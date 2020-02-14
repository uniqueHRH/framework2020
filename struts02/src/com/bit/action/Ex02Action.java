package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action {   // 순수자바코드로 값을 어떻게 주고받나?   -   getter / setter 통해

	private String id, pw;   // private : 다른데에서 접근 못하게 한다 (setter 로만 값을 주입할 수 있도록)
	
	
	public void setId(String id) {   // setter (값을 입력받는다)
		this.id=id;
	}
	
	public String getId() {   // getter (입력받은 값을 출력한다)
		return id;
	}
	
	public void setPw(String pw) {
		this.pw=pw;
	}
	
	public String getPw() {
		return pw;
	}
	
	
	
	@Override
	public String execute() throws Exception {
		
		System.out.println(id);
		System.out.println(pw);

		return this.SUCCESS;
	}

}
