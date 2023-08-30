package com.javaex.ex01.author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorSelect {

	public static void main(String[] args) {
		
		List<AuthorVo> authorList = new ArrayList<AuthorVo>();		// 리스트 생성

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
			while(rs.next()) {  // 값의 수를 모르기 무한 반복문 while 사용
				int authorId = rs.getInt("author_id");
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				
				System.out.println(authorId + ", " + authorName + ", " + authorDesc);
				
				AuthorVo authorVo = new AuthorVo(); // 작가 객체 생성
				authorVo.setAuthorId(authorId);
				authorVo.setAuthorName(authorName);
				authorVo.setAuthorDesc(authorDesc);
				
				authorList.add(authorVo);
				
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

		}

		// 실제 출력
		for (int i=0;i<authorList.size();i++) {
			System.out.println( " id: " + authorList.get(i).getAuthorId()
							  + " name: " + authorList.get(i).getAuthorName()
							  + " desc: " + authorList.get(i).getAuthorDesc());
		}
		
		System.out.println(authorList.get(2).getAuthorName());
		
		
	}
}
