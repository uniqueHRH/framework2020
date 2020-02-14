package com.bit.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.model.EmpDao;
import com.bit.model.entity.EmpVo;

public class Test {

	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		try {
			ArrayList<EmpVo> list=dao.selectAll();
			System.out.println(list!=null);
			for(EmpVo bean:list) {
				System.out.println(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


//연습용 페이지니까 무시해도 됌!