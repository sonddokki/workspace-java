package com.javaex.ex00.miniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	// 메소드-gs

	// 메소드-일반

	// (1) 공통사항 빼놓기
	private void getConnect() {

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName(driver);
			// 2. Connection 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}

	}

	private void close() {
		// 5. 자원정리
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
	}

	// (2) 전화번호등록 메소드
	public int personInsert(String name, String ph, String company) {
		int count = -1;
		this.getConnect();

		try {
			// 3. SQL문 준비 / 바인딩 / 실행

			// (1) SQL문 준비
			String query = "";
			query += " INSERT INTO person ";
			query += " VALUES (seq_person_id.nextval, ? , ? , ? )";

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, ph);
			pstmt.setString(3, company); 
			// (3) 실행
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return count;
	}
	
	// (3) 전화번호삭제 메소드
	public int personDelete(int personId) {
		int count = -1;
		this.getConnect();

		try {
			String query = "";
			query += " INSERT INTO person ";
			query += " VALUES (seq_person_id.nextval, ? , ? , ? )";

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, ph);
			pstmt.setString(3, company); 
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return count;
		}
	}
	
	
	// (4) 전화번호검색 메소드
	
	
	// (5) 전화번호리스트 메소드
	
	
}
