package com.bit.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.model.entity.EmpVo;

public abstract class JdbcTemplate1 {
	
	private Connection getConnection() throws SQLException {
		String driver="org.mariadb.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String user="scott";
		String password="tiger";
		Connection conn=null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	private void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}

	public int executeUpdate(String sql) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			setStatement(pstmt);
			return pstmt.executeUpdate();
		}finally {
			close(null,pstmt,conn);
		}
	}

	public abstract void setStatement(PreparedStatement pstmt) throws SQLException;
}