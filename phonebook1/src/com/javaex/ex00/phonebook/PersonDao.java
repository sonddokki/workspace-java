package com.javaex.ex00.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void consol() {
		System.out.println();
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("-------------------------------------");	
		System.out.print(">메뉴번호: ");
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
			query += " DELETE FROM person ";
			query += " WHERE person_id = ? ";

			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, personId);

			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return count;
	}

	// (4) 전화번호검색 메소드
	public List<PersonVo> personSearch(String search) {
//		int count = -1;
		List<PersonVo> personList = new ArrayList<PersonVo>(); // 리스트 생성

		this.getConnect();

		try {
			String query = "";
			query += " SELECT  person_id ";
			query += "         ,name ";
			query += "         ,hp ";
			query += "         ,company ";
			query += " FROM person ";
			query += " where name like '%'||?||'%'  ";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, search);

//			count = pstmt.executeUpdate();

			rs = pstmt.executeQuery();

			while (rs.next()) { // 값의 수를 모르기 무한 반복문 while 사용
				int personId = rs.getInt(1);
				String Name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo(); // 사람 객체 생성
				personVo.setPersonId(personId);
				personVo.setName(Name);
				personVo.setHp(hp);
				personVo.setCompany(company);

				personList.add(personVo); // 리스트에 넣기
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();

		return personList;
	}// personSelect

	// (5) 전화번호리스트 메소드
	public List<PersonVo> personSelect() {

		List<PersonVo> personList = new ArrayList<PersonVo>(); // 리스트 생성
		this.getConnect();
		try {
			String query = "";
			query += " SELECT  person_id ";
			query += "         ,name ";
			query += "         ,hp ";
			query += "         ,company ";
			query += " FROM person ";

			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) { // 값의 수를 모르기 무한 반복문 while 사용
				int personId = rs.getInt(1);
				String Name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo(); // 사람 객체 생성
				personVo.setPersonId(personId);
				personVo.setName(Name);
				personVo.setHp(hp);
				personVo.setCompany(company);

				personList.add(personVo); // 리스트에 넣기
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return personList;
	}



}
