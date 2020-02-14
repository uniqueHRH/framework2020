package com.bit.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class Emp02Dao {
	SqlMapClient sqlMapClient;
	
	
	public Emp02Dao() {
		try {
//			아래 둘은 그냥 같이쓰면 된다 (항상).. 이해 안 됨...
			Reader reader=Resources.getResourceAsReader("/SqlMapConfig.xml");   // SqlMapConfig.xml 에서 파일을 읽어오도록 한다 
			sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);   // 환경설정에 대한 정보를 읽어들여야만 한다 (InputStream)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
//	queryForList vs queryForObject
//	queryForList : 2개 이상의 값 나열
//	queryForObject : 1개의 값 나열
	
	public List<Emp02Vo> selectAll() throws SQLException {
		return sqlMapClient.queryForList("selectAll");   // Query.xml 에서 사용한 id
	}
	
	
	public void insertOne(Emp02Vo bean) throws SQLException {
		sqlMapClient.insert("insertOne",bean);
	}
	
	
	public Emp02Vo selectOne(int sabun) throws SQLException {
		return (Emp02Vo)sqlMapClient.queryForObject("selectOne", sabun);
	}
	
	
	public int updateOne(Emp02Vo bean) throws SQLException {
		return sqlMapClient.update("updateOne",bean);
	}
	
	
	public int deleteOne(int sabun) throws SQLException {
		return sqlMapClient.delete("deleteOne",sabun);
	}
}
