package com.javaex.ex00.phonebook;

import java.util.List;
import java.util.Scanner;

public class PerfectApp {

	public static void main(String[] args) {

		int count = 0;
		PersonDao personDao = new PersonDao();
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("*************************************");
		System.out.println("*       전화번호 관리 프로그램      *");
		System.out.println("*************************************");

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
				String ph = scanner.nextLine();
				System.out.print(">회사전화: ");
				String company = scanner.nextLine();
				personDao.personInsert(name, ph, company);
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
				}
				break;
			}
			case 5: {
				System.out.println();
				System.out.println("*************************************");
				System.out.println("*             감사합니다            *");
				System.out.println("*************************************");
				return;
			}
			default:
				System.out.println("[다시 입력해 주세요.]");
				break;
			}

		}

	}

}
