package com.bit.service;

import java.util.Map.Entry;
import java.util.*;

public class Remote3 {
	
	
	Map<String, String> map;
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	
	
//	Set<String> set;
	
//	public void setSet(Set<String> set) {
//		this.set = set;
//	}
	
	
	
//	ArrayList<String> alist;
	
//	public void setArr(String[] arr) {
//		this.arr = arr;
//	}
	
	
	
//	String[] arr;
	
//	public void setAlist(ArrayList<String> alist) {
//		this.alist = alist;
//	}
	
	
	public void func1() {
//		System.out.println(Arrays.toString(arr));
//		for(String msg:alist)
//		System.out.println(msg);
//		for(String msg:set)
//			System.out.println(msg);
//		for(String msg:map.keySet())
//			System.out.println(msg+":"+map.get(msg));
		
		Set<Entry<String, String>> ent=map.entrySet();
		Iterator<Entry<String, String>> ite=ent.iterator();
			while(ite.hasNext()) {
				Entry<String, String> obj=ite.next();
				System.out.println(obj.getKey()+":"+obj.getValue());
			}
	}
}
