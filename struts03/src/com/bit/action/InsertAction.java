package com.bit.action;

import com.bit.model.Emp02Dao;
import com.opensymphony.xwork2.Action;

public class InsertAction implements Action {
	private int sabun, pay;
	private String name, errMsg;   // add.jsp
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getErrMsg() {
		return errMsg;
	}

	@Override
	public String execute() throws Exception {
		if(sabun==0) {
			errMsg="<div><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">사번을 입력하세요</span></button></div>";
			return this.INPUT;
		} else if(name.isEmpty()) {
			errMsg="<div><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">이름을 입력하세요</span></button></div>";
			return this.INPUT;
		}
		Emp02Dao dao=new Emp02Dao();
		dao.insertOne(sabun,  name, pay);
		return this.SUCCESS;
	}
}
