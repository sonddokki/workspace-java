package com.javaex.ex00.phonebook;

import java.util.List;
import java.util.Scanner;

public class PerfectApp {

	public static void main(String[] args) {

		int count = 0;
		PersonDao personDao = new PersonDao();
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("***********************************************");
		System.out.println("*            전화번호 관리 프로그램           *");
		System.out.println("***********************************************");

		while (true) {
			personDao.consol();
			int sNum = scanner.nextInt();

			switch (sNum) {

			case 1: {
				List<PersonVo> personList = personDao.personSelect();
				System.out.println("<1.리스트>");
				for (int i = 0; i < personList.size(); i++) {
					System.out.println(personList.get(i).toString());
				}
				break;
			}
			case 2: {
				System.out.println("<2.등록>");
				scanner.nextLine();
				System.out.print(">이름: ");
				String name = scanner.nextLine();
				System.out.print(">휴대전화: ");
				String hp = scanner.nextLine();
				System.out.print(">회사전화: ");
				String company = scanner.nextLine();
				personDao.personInsert(name, hp, company);
				System.out.println("[등록되었습니다.]");
				break;
			}
			case 3: {
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int personId = scanner.nextInt();
				personDao.personDelete(personId);
				System.out.println("[삭제되었습니다.]");
				break;
			}
			case 4: {
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				scanner.nextLine();
				String search = scanner.nextLine();
				List<PersonVo> personList = personDao.personSearch(search);
				for (int i = 0; i < personList.size(); i++) {
					System.out.println(personList.get(i).toString());
					count++;
				}
				System.out.println(">검색결과: " + count + "건");
				break;
			}
			case 5: {
				System.out.println("<5.수정>");
				scanner.nextLine();
				System.out.println("[수정할 person_id를 입력하시오.]");
				System.out.print(">ID: ");
				int personId = scanner.nextInt();
				personDao.personSelectOne(personId);
				scanner.nextLine();
				System.out.println("[어떤 항목을 수정하시겠습니까?]");
				System.out.println(" 1.이름 2.개인번호  3.회사번호 ");
				System.out.print(">번호: ");
				int updateNum = scanner.nextInt();

				switch (updateNum) {
				case 1: {
					System.out.println("[새 이름을 입력하십시오.]");
					System.out.print(">새 이름: ");
					scanner.nextLine();
					String name = scanner.nextLine();
					personDao.personNameUpdate(personId, name);
					System.out.println("[ID'" + personId + "'님의 이름이 '" + name + "'으로 변경되었습니다.]");
					break;
				}
				case 2: {
					System.out.println("[새 개인번호를 입력하십시오.]");
					System.out.print(">새 개인번호: ");
					scanner.nextLine();
					String hp = scanner.nextLine();
					personDao.personHpUpdate(personId, hp);
					System.out.println("[ID'" + personId + "'님의 개인번호가 '" + hp + "'으로 변경되었습니다.]");
					break;
				}
				case 3: {
					System.out.println("[새 회사번호를 입력하십시오.]");
					System.out.print(">새 회사번호: ");
					scanner.nextLine();
					String company = scanner.nextLine();
					personDao.personCompanyUpdate(personId, company);
					System.out.println("[ID'" + personId + "'님의 회사번호가 '" + company + "'으로 변경되었습니다.]");
					break;
				}
				default:
					System.out.println("[다시 입력해 주세요.]");
					break;
				}
				break;
			}
			case 6: {
				System.out.println();
				System.out.println("***********************************************");
				System.out.println("*                감 사 합 니 다               *");
				System.out.println("***********************************************");
				return;
			}
			default:
				System.out.println("[다시 입력해 주세요.]");
				break;
			}

		}

	}

}
