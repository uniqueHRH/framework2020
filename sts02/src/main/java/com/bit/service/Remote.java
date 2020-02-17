package com.bit.service;

public class Remote {
	Machine remote;   // 객체를 생성하지 않고, 주입시켜준다 (Machine remote=new Machine();)
	
	
	
//	1. setter 를 이용한 주입
	public void setRemote(Machine remote) {
		this.remote = remote;
	}

//	2. 생성자를 이용한 주입
//	public Remote(Machine machine) {
//		remote=machine;
//	}
	

	
	public void func1() {
		Tv tv=new Tv();
		
		tv.on();
		tv.work();
		tv.off();
	}
	
	public void func2() {
		Radio radio=new Radio();
		
		radio.on();
		radio.work();
		radio.off();
	}
	
	public void func3() {
		
		remote.on();
		remote.work();
		remote.off();
	}
}
