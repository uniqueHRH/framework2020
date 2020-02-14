package com.bit.framework;

import java.util.HashMap;
import java.util.Map;

public class BitHandleMapping {
	Map<String,BitController> map=new HashMap<>();
	
	public void addUrl(String url, String info) {   // appplication.properties 에서 값을 받아온다
		try {
			Class clzz=Class.forName(info);   // info 를 로드한 것을 Class clzz 에 저장한다
			BitController controller=(BitController) clzz.newInstance();   // newInstance : clzz 의 인스턴스를 생성
			map.put(url, controller);   // url, controller_info 를 map 에 저장
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
	public BitController getController(String url) {   // BitController 에서 받는 요청값을 받아오는 메소드
		return map.get(url);
	}
}
