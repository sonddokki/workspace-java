package com.javaex.ex00.phonebookv2;

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
	private boolean key;

	// 생성자

	// 메소드-gs

	// 메소드-일반

	// (1) 공통사항 빼놓기
	private void getConnect() { // DB 연결
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

	public void consol() { // 콘솔출력
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
			pstmt.executeUpdate(); // 실행
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
	// '리스트','검색','수정전 회원확인' 총 3가지 항목에서 사용
	//  ==> Select + Search 통합
	public List<PersonVo> personSelect(String keyword) { 
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
			
			// keyword에 ""가 아닌 값이 들어오면 해당 쿼리문도 붙여서 실행			
			if (!keyword.equals("")) {  
				try {
					Integer.parseInt(keyword); 
					key = true;
				} catch (NumberFormatException ex) {
					key = false;
				}
				if (key == true) {
					query += " where person_id = ? ";
				}
				if (key == false) {
					query += " where name like ? ";
				}
			}
			
			pstmt = conn.prepareStatement(query);
			
			if (!keyword.equals("")) {
				try {
					Integer.parseInt(keyword);
					key = true;
				} catch (NumberFormatException ex) {
					key = false;
				}
				
				if (key == true) {
					int number = Integer.parseInt(keyword);
					pstmt.setInt(1, number);
				}
				if (key == false) {
					pstmt.setString(1, "%" + keyword + "%");
				}
			}
			
			// 실행
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
	}// personSelect + Search

	// (5) 수정통합 메소드      (바꾸고싶은회원ID,  바꿀항목선택번호,   바꿀내용)
	public void personUpdate(String personId, String updateNum, String keyword) {
		this.getConnect();
		// 문자열을 정수로 바꿔주는 기능 ( 문자입력시 에러가 떳던 값들은 문자로 받아서 정수로 변환 )
		int keyId = Integer.parseInt(personId);   
		int keyNum = Integer.parseInt(updateNum); 
		try {
			// (1) SQL문 준비
			String query = "";
			query += " UPDATE person ";
			// 일치하는 항목의 쿼리문만 삽입
			if (keyNum == 1) {
				query += " set name = ? ";
			} else
			if (keyNum == 2) {
				query += " set hp = ? ";
			} else
			if (keyNum == 3) {
				query += " set company = ? ";
			}
			query += " where person_id = ? ";
			// (2) 바인딩 (값을 쿼리문문자열 안에 매칭시키기)
			pstmt = conn.prepareStatement(query);
			
			// 바꿀내용을 set에 대입
			pstmt.setString(1, keyword);
			// 찾을 회원의 번호를 where person_id에 대입
			pstmt.setInt(2, keyId);
			// (3) 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		this.close();
	}


}
