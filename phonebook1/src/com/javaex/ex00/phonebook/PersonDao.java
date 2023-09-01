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
	private void getConnect() {  // DB 연결
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

	private void close() { // 자원정리
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
	
	public void consol() {  // 콘솔출력
		System.out.println();
		System.out.println("  1.리스트 2.등록 3.삭제 4.검색 5.수정 6.종료");
		System.out.println("-----------------------------------------------");	
		System.out.print(">메뉴번호: ");
	}

	// (2) 전화번호등록 메소드
	public void personInsert(String name, String ph, String company) {
		this.getConnect();
		try {
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
			pstmt.executeUpdate();  // 실행
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
	}

	// (3) 전화번호삭제 메소드
	public void personDelete(String personId) {
		int count = -1;
		this.getConnect();
		try {
			String query = "";
			query += " DELETE FROM person ";
			query += " WHERE person_id = ? ";
			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, personId);
			// 실행
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[다시 입력해주세요.]");
		}
		this.close();
		if (count == 1) {
			System.out.println("[삭제되었습니다.]");
		}
	}

	// (4) 전화번호검색 메소드
	public List<PersonVo> personSearch(String search) {
		 // 리스트 생성
		List<PersonVo> personList = new ArrayList<PersonVo>();
		// db 연결
		this.getConnect();
		// 쿼리문 작성
		try {
			String query = "";
			query += " SELECT  person_id ";
			query += "         ,name ";
			query += "         ,hp ";
			query += "         ,company ";
			query += " FROM person ";
			query += " where name like '%'||?||'%'  ";
			// 쿼리문에 변수 대입
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, search);
			// 쿼리문 DB에 실행
			rs = pstmt.executeQuery();
			// 나온 값을 타이틀 밑 순서부터 반복해서 personVo 객체에 저장
			while (rs.next()) { 
				int personId = rs.getInt(1);
				String Name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo();
				personVo.setPersonId(personId);
				personVo.setName(Name);
				personVo.setHp(hp);
				personVo.setCompany(company);
				 // 리스트에 넣기
				personList.add(personVo);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		// 리스트 리턴
		return personList;
	}// personSearch

	// (5) 전화번호리스트 메소드
	public List<PersonVo> personSelect() {
		List<PersonVo> personList = new ArrayList<PersonVo>();
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

			while (rs.next()) { 
				int personId = rs.getInt(1);
				String Name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo();
				personVo.setPersonId(personId);
				personVo.setName(Name);
				personVo.setHp(hp);
				personVo.setCompany(company);

				personList.add(personVo);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
		return personList;
	}

	// (6) 전화번호수정전 확인출력 메소드
	public PersonVo personSelectOne(int Id) {
		PersonVo personVo = new PersonVo(); // 사람 객체 생성
		this.getConnect();
		try {
			// (1) SQL문 준비
			String query = "";
			query += " SELECT  person_id ";
			query += "         ,name ";
			query += "         ,hp ";
			query += "         ,company ";
			query += " FROM person ";
			query += " where person_id = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Id);
			// (3) 실행
			rs = pstmt.executeQuery();
			rs.next();
			personVo.setPersonId(rs.getInt(1));
			personVo.setName(rs.getString(2));
			personVo.setHp(rs.getString(3));
			personVo.setCompany(rs.getString(4));
			System.out.println(personVo.toString());
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();	
		return personVo;
	}
	
	// (7) 이름수정 메소드
	public void personNameUpdate(int personId,String name) {
		this.getConnect();
		try {
			// (1) SQL문 준비
			String query = "";
			query += " UPDATE person ";
			query += " set name = ? ";
			query += " where person_id = ? ";
			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, personId);
			// (3) 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();	
	}
	
	// (8) 개인전화번호수정 메소드
 	public void personHpUpdate(int personId,String hp) {
		this.getConnect();
		try {
			// (1) SQL문 준비
			String query = "";
			query += " UPDATE person ";
			query += " set hp = ? ";
			query += " where person_id = ? ";
			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, hp);
			pstmt.setInt(2, personId);
			// (3) 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();	
	}
 	
    // (9) 회사전화번호수정 메소드
  	public void personCompanyUpdate(int personId,String company) {
 		this.getConnect();
 		try {
 			// (1) SQL문 준비
 			String query = "";
 			query += " UPDATE person ";
 			query += " set company = ? ";
 			query += " where person_id = ? ";
 			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
 			pstmt = conn.prepareStatement(query);
 			pstmt.setString(1, company);
 			pstmt.setInt(2, personId);
 			// (3) 실행
 			pstmt.executeUpdate();
 		} catch (SQLException e) {
 			System.out.println("error:" + e);
 		}
 		this.close();	
 	}
	
}
