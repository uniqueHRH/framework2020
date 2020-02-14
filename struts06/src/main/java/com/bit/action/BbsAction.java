package com.bit.action;

import java.sql.DriverAction;
import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class BbsAction implements ModelDriven<Emp02Vo>, Preparable {
	private List<Emp02Vo> list;
	private Emp02Vo bean=new Emp02Vo();   // 입력받으려면 객체가 있어야하니, 여기서 생성해준다
	
	public List<Emp02Vo> getList() {   // 화면에 list 출력
		return list;
	}
	
	public void setBean(Emp02Vo bean) {   // 값을 입력받는다
		this.bean = bean;
	}
	
	public Emp02Vo getBean() {
		return bean;
	}
	
	
	

//	아래와 같이 구현하게 되면, 한 Action 페이지에서 모든 화면을 출력할 수 있다
	public String execute() {   // action 인터페이스를 상속받지 않을 경우에는, this.SUCCESS 가 아닌 / Action.SUCCESS 사용
		return Action.SUCCESS;   // 단순히 화면을 출력하는 메소드로, 이 클래스를 호출하면 execute() 가 출력된다
	}
	
	
	public String list() throws SQLException {   // list 를 출력하는 메소드
		Emp02Dao dao=new Emp02Dao();
		list=dao.selectAll();
		return Action.SUCCESS;   // method 로 list 를 호출하면, list() 가 출력된다
	}
	
	
	public String insert() throws SQLException {
		Emp02Dao dao=new Emp02Dao();
		System.out.println(bean);
		dao.insertOne(bean);
		return Action.SUCCESS;
	}


	public String detail() throws SQLException {
		Emp02Dao dao=new Emp02Dao();
		bean=dao.selectOne(bean.getSabun());
		return Action.SUCCESS;
	}
	
	
	public String update() throws SQLException {
		Emp02Dao dao=new Emp02Dao();
		dao.updateOne(bean);
		return Action.SUCCESS;
	}
	
	
	public String delete() throws SQLException {
		Emp02Dao dao=new Emp02Dao();
		dao.deleteOne(bean.getSabun()); 
		return Action.SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception {
		bean=new Emp02Vo();
	}

	
	@Override
	public Emp02Vo getModel() {
		return bean;
	}
	

		
}
