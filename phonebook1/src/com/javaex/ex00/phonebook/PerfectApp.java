package com.javaex.ex00.phonebook;

import java.util.List;
import java.util.Scanner;

public class PerfectApp {

	public static void main(String[] args) {

		int count = 0;
		PersonDao personDao = new PersonDao();
		Scanner scanner = new Scanner(System.in);
		
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
				

			}
			case 3: {

			}
			case 4: {

			}
			case 5: {

			}
			default:
				System.out.println("번호를 다시 입력해 주세요.");
				return;
			}

		}

	}

}
