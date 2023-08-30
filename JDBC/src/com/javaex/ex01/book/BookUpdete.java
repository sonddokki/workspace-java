package com.javaex.ex01.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUpdete {

	public static void main(String[] args) {

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
			String title = "삼국지 (상)";
			String title2 = "삼국지";

			String query = "";
			query += " UPDATE book ";
			query += " set title = ? ";
			query += " where title = ? ";

			pstmt = conn.prepareStatement(query);

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt.setString(1, title);
			pstmt.setString(2, title2);

			// (3) 실행
			int count = pstmt.executeUpdate();

			System.out.println(count + "건 업데이트되었습니다.");

			// 4.결과처리

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

	}
}
