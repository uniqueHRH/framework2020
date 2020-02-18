package com.bit.model;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.model.entity.Dept01Vo;

public class Dept01DaoImplTest {

	@Test
	public void testSetDataSource() {
		
	}

	@Test
	public void testSelectAll() throws SQLException {
//	ApplicationContext (설정정보)  /  ClassPathXmlApplicationContext : 읽어올 xml 파일
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao dao=(Dept01Dao) context.getBean("dept01Dao2");
		List<Dept01Vo> list = dao.selectAll();
		assertNotNull(list);   // assertNotNull : null 이 아닐 때
		for(Dept01Vo bean: list)
			System.out.println(bean);
	}

	@Test
	public void testInsertOne() throws SQLException, UnsupportedEncodingException {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao dao=(Dept01Dao) context.getBean("dept01Dao2");
		
		Dept01Vo bean=new Dept01Vo(0,"test","TEST");
		dao.insertOne(bean);
	}

	@Test
	public void testDeleteOne() throws SQLException {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao dao=(Dept01Dao) context.getBean("dept01Dao2");
		
		assertSame(1, dao.deleteOne(7));
	}

}