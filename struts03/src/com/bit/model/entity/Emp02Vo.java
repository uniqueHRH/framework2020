package com.bit.model.entity;

import java.sql.Date;

public class Emp02Vo {

	private int sabun, pay;
	private String name;
	private Date nalja;
	
	
	public Emp02Vo() {
		
	}
	
	public Emp02Vo(int sabun, String name, Date nalja, int pay) {
		this.sabun=sabun;
		this.name=name;
		this.nalja=nalja;
		this.pay=pay;
	}
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
	
	
	@Override
	public String toString() {
		return "Emp02Vo [sabun=" + sabun + ", pay=" + pay + ", name=" + name
				+ ", nalja=" + nalja + "]";
	}
	
}
