package com.bit.service;

public class Radio implements Machine{

	public void on() {
		System.out.println("Radio 를 켜다");
	}
	
	public void off() {
		System.out.println("Radao 를 끄다");
	}
	
	public void work() {
		System.out.println("주파수를 잡아 소리를 스피커로 소리낸다");
	}
}
