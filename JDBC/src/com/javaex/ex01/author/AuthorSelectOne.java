package com.javaex.ex01.author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorSelectOne {

	public static void main(String[] args) {

		List<AuthorVo> authorOneList = new ArrayList<AuthorVo>();

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. SQL문 준비 / 바인딩 / 실행

			// (1) SQL문 준비
			String query = "";
			query += " SELECT   author_id ";
			query += "          ,author_name ";
			query += "          ,author_desc ";
			query += " FROM author ";			
			System.out.println(query);
			
			pstmt = conn.prepareStatement(query);  // 변환
			
			// (2) 바인딩 -- > 물음표매칭 X 
			
			// (3) 실행
			rs = pstmt.executeQuery();
			

			// 4.결과처리
			while(rs.next()) {
				int authorId = rs.getInt(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				
				AuthorVo authorVo = new AuthorVo(); // 작가 객체 생성
				authorVo.setAuthorId(authorId);
				authorVo.setAuthorName(authorName);
				authorVo.setAuthorDesc(authorDesc);
				
				authorOneList.add(authorVo);
			}
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

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
			
		
			System.out.print( " id: " + authorOneList.get(2).getAuthorId());
			System.out.print( " name: " + authorOneList.get(2).getAuthorName());
			System.out.println( " desc: " + authorOneList.get(2).getAuthorDesc());
			
			

		}

	}

}
