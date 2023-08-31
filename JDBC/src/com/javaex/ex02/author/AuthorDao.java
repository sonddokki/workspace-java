package com.javaex.ex02.author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao {

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
	public AuthorDao() {
	}

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

	// (2) 작가등록 메소드
	public int authorInsert(String authorName, String authorDesc) {
		// count를 상단에 미리 선언해두어야 밑에서 리턴할 수 있음
		// try 안에서 선언하면 그안에서 계산되고 사라져 버림
		int count = -1;

		this.getConnect();

		try {
			// 3. SQL문 준비 / 바인딩 / 실행

			// (1) SQL문 준비
			String query = "";
			query += " INSERT INTO author ";
			query += " VALUES (seq_author_id.nextval, ?, ? )";
			pstmt = conn.prepareStatement(query);

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt.setString(1, authorName);
			pstmt.setString(2, authorDesc);

			// (3) 실행
			// 업데이트 횟수를 count에 대입
			count = pstmt.executeUpdate();

			// 4.결과처리
//			System.out.println(count + "건 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		this.close();
		return count;
	}// authorInsert

	// (3) 작가삭제 메소드
	public int authorDelete(int authorId) {
		int count = -1;

		this.getConnect();

		// 3. SQL문 준비 / 바인딩 / 실행
		try {
			// (1) SQL문 준비
			String query = "";
			query += " DELETE FROM author ";
			query += " WHERE author_id = ? ";

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, authorId); // (첫번째 물음표에는 정수형 no 매칭하기)
			// (3) 실행
			count = pstmt.executeUpdate();
			// 4.결과처리
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return count;
	} // authorDelete

	// (4) 작가리스트 출력 메소드
	public List<AuthorVo> authorSelect() {

		List<AuthorVo> authorList = new ArrayList<AuthorVo>(); // 리스트 생성

		this.getConnect();

		try {
			// 3. SQL문 준비 / 바인딩 / 실행

			// (1) SQL문 준비
			String query = "";
			query += " SELECT   author_id ";
			query += "          ,author_name ";
			query += "          ,author_desc ";
			query += " FROM author ";

			pstmt = conn.prepareStatement(query); // 변환
			// (2) 바인딩 -- > 물음표매칭 X
			// (3) 실행
			rs = pstmt.executeQuery();
			// 4.결과처리
			while (rs.next()) { // 값의 수를 모르기 무한 반복문 while 사용
				int authorId = rs.getInt(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3); // 쿼리문날려서 받아온 값 매칭

				AuthorVo authorVo = new AuthorVo(); // 작가 객체 생성
				authorVo.setAuthorId(authorId);
				authorVo.setAuthorName(authorName);
				authorVo.setAuthorDesc(authorDesc); // 각각 값넣기

				authorList.add(authorVo); // 리스트에 넣기
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return authorList;
	}// authorSelect

	// (5) 작가 업데이트 메소드
	public int authorUpdate(String authorName, String authorDesc) {
		int count = -1;

		this.getConnect();

		try {
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "";
			query += " UPDATE author ";
			query += " set author_desc = ? ";
			query += " where author_name = ? ";

			pstmt = conn.prepareStatement(query);

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt.setString(1, authorDesc);
			pstmt.setString(2, authorName);

			// (3) 실행
			count = pstmt.executeUpdate();

			// 4.결과처리

		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return count;
	} // authorUpdate

}
