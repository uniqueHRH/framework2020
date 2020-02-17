package com.bit.model;

import static org.junit.Assert.*;

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
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao dao=(Dept01Dao) context.getBean("dept01Dao");
		List<Dept01Vo> list = dao.selectAll();
		assertNotNull(list);
		for(Dept01Vo bean: list)System.out.println(bean);
	}

	@Test
	public void testInsertOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteOne() {
		fail("Not yet implemented");
	}

}