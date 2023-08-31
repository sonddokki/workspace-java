package com.javaex.ex00.miniProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonDao {
	// 필드
	// 0. import java.sql.*;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "webdb";
	private String pw = "webdb";

	// 생성자

	
}
