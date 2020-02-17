package com.bit.plan;

import com.bit.service.*;

public class PlanJava {

	public static void main(String[] args) {

//	1. setter 를 이용한 방식
//	여기서 Tv / Radio 넣는 값에 따라 출력값이 달라진다
//		Remote remote=new Remote();
//		remote.setRemote(new Radio());
		
		
//	2. 생성자를 이용한 방식
//	여기서 Tv / Radio 넣는 값에 따라 출력값이 달라진다
		Remote remote=new Remote(new Tv());
		
		
		
		remote.func3();
	}

}
