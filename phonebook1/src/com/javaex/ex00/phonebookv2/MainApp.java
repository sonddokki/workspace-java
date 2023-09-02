package com.javaex.ex00.phonebookv2;

import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		// 필요한 변수선언
		boolean run = true;  // while문 끝내기용
		PersonDao personDao = new PersonDao();  // DB연결 메소드 사용할 수 있는 객체 생성
		Scanner scanner = new Scanner(System.in);  // 값입력 장치 생성

		System.out.println();
		System.out.println("***********************************************");
		System.out.println("*            전화번호 관리 프로그램           *");
		System.out.println("***********************************************");

		while (run) {  // 반복문 실행
			
			personDao.consol(); // 선택항목출력 메소드

			String sNum = scanner.next();  // 선택항목 번호 입력
			// 정해진 숫자외 입력시만 '다시입력해주세요 문구'출력이 됨 (문자입력시 에러)
			// ==> 해결 nextInt(); 가 아닌 scanner.next(); 로 입력받기

			switch (sNum) {  // switch문을 통해 선택항목 입력 번호 삽입

			case "1": {  // 문자입력이기 때문에 1대신 "1"로 설정
				List<PersonVo> personList = personDao.personSelect("");
				System.out.println("<1.리스트>");
				for (int i = 0; i < personList.size(); i++) {
					System.out.println(personList.get(i).toString());
				}
				break;
			}
			case "2": {
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.print(">휴대전화: ");
				String hp = scanner.nextLine();
				System.out.print(">회사전화: ");
				String company = scanner.nextLine();
				personDao.personInsert(name, hp, company);
				System.out.println("[등록되었습니다.]");
				break;
			}
			case "3": {
				System.out.println("<3.삭제>");
				System.out.println("[삭제할 person_id를 입력하시오.]");
				System.out.print(">ID: ");
				scanner.nextLine();
				String personId = scanner.nextLine();
				personDao.personDelete(personId);
				break;
			}
			case "4": {
				int count = 0;
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				scanner.nextLine();
				String search = scanner.nextLine();
				List<PersonVo> personList = personDao.personSelect(search);
				for (int i = 0; i < personList.size(); i++) {
					System.out.println(personList.get(i).toString());
					count++;
				}
				System.out.println(">검색결과: " + count + "건");
				break;
			}
			case "5": {
				System.out.println("<5.수정>");				
				System.out.println("[수정할 person_id를 입력하시오.]");
				System.out.print(">ID: ");
				scanner.nextLine();
				String personId = scanner.nextLine();
				List<PersonVo> personList = personDao.personSelect(personId);
				for (int i = 0; i < personList.size(); i++) {
					System.out.println(personList.get(i).toString());
				}
				System.out.println("[어떤 항목을 수정하시겠습니까?]");
				System.out.println(" 1.이름    2.개인번호    3.회사번호 ");
				System.out.print(">번호: ");
				String updateNum = scanner.next();
				scanner.nextLine();
				switch (updateNum) {
				case "1": {
					System.out.println("[새 이름을 입력하십시오.]");
					System.out.print(">새 이름: ");
					String name = scanner.nextLine();
					personDao.personUpdate(personId, updateNum, name);
					System.out.println("[ID'" + personId + "'님의 이름이 '" + name + "'으로 변경되었습니다.]");
					break;
				}
				case "2": {
					System.out.println("[새 개인번호를 입력하십시오.]");
					System.out.print(">새 개인번호: ");
					String hp = scanner.nextLine();
					personDao.personUpdate(personId, updateNum, hp);
					System.out.println("[ID'" + personId + "'님의 개인번호가 '" + hp + "'으로 변경되었습니다.]");
					break;
				}
				case "3": {
					System.out.println("[새 회사번호를 입력하십시오.]");
					System.out.print(">새 회사번호: ");
					String company = scanner.nextLine();
					personDao.personUpdate(personId, updateNum, company);
					System.out.println("[ID'" + personId + "'님의 회사번호가 '" + company + "'으로 변경되었습니다.]");
					break;
				}
				default:
					System.out.println("[다시 입력해 주세요.]");
					break;
					
				}
				break;
			}
			case "6": {  // 종료
				run = false;
				break;
			}
			default:
				System.out.println("[다시 입력해 주세요.]");
				break;
			}
			
		}
		scanner.close();
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("*                감 사 합 니 다               *");
		System.out.println("***********************************************");

	}

}
