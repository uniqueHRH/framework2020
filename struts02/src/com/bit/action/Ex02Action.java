package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action {   // �����ڹ��ڵ�� ���� ��� �ְ�޳�?   -   getter / setter ����

	private String id, pw;   // private : �ٸ������� ���� ���ϰ� �Ѵ� (setter �θ� ���� ������ �� �ֵ���)
	
	
	public void setId(String id) {   // setter (���� �Է¹޴´�)
		this.id=id;
	}
	
	public String getId() {   // getter (�Է¹��� ���� ����Ѵ�)
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
