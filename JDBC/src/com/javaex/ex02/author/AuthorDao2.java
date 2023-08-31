package com.javaex.ex02.author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao2 {
	
	// 이게 수정전 파일임 (공통사항 빼놓기 안한거)

	// 필드
	private int authorId;
	private String authorName;
	private String authorDesc;

	// 생성자
	public AuthorDao2() {
	}

	public AuthorDao2(int authorId, String authorName, String authorDesc) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}

	// 메소드-gs
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	// 메소드-일반


	// 작가등록 메소드
	public int authorInsert(String authorName, String authorDesc) {
		// count를 상단에 미리 선언해두어야 밑에서 리턴할 수 있음
		// try 안에서 선언하면 그안에서 계산되고 사라져 버림
		int count = -1;

		System.out.println("이름 " + authorName);
		System.out.println("정보 " + authorDesc);

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
			query += " INSERT INTO author ";
			query += " VALUES (seq_author_id.nextval, ?, ? )";
			pstmt = conn.prepareStatement(query);

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt.setString(1, authorName);
			pstmt.setString(2, authorDesc);

			// (3) 실행
			// 업데이트 횟수를 count에 대입
			count = pstmt.executeUpdate();

//			System.out.println(count + "건 등록되었습니다.");

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
		return count;
	}// authorInsert

	// 작가삭제 메소드
	public int authorDelete(int authorId) {
		int count = -1;

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 다른 데이터베이스를 사용하면 바뀔 수 있다

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 다른컴퓨터에 쓰면 아이피주소를 넣는다:포트번호도 바뀔 수 있음
			conn = DriverManager.getConnection(url, "webdb", "webdb"); // 위에쓴 주소와 데이터베이스 아이디,비번입력

			// 3. SQL문 준비 / 바인딩 / 실행

			// (1) SQL문 준비
			String query = "";
			query += " DELETE FROM author ";
			query += " WHERE author_id = ? ";

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, authorId); // (첫번째 물음표에는 정수형 no 매칭하기)

			// (3) 실행
			count = pstmt.executeUpdate();

			// System.out.println(count + "건 삭제되었습니다.");

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

		return count;
	} // authorDelete

	// 작가리스트 출력 메소드
	public List<AuthorVo> authorSelect() {

		List<AuthorVo> authorList = new ArrayList<AuthorVo>(); // 리스트 생성

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

		return authorList;

	}// authorSelect

	// 작가 업데이트 메소드
	public int authorUpdate(String authorName, String authorDesc) {
		int count = -1;

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

		return count;

	} // authorUpdate

}
