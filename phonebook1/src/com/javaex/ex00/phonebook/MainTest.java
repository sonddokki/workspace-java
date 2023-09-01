package com.javaex.ex00.phonebook;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {

		PersonDao personDao = new PersonDao();

		int count = 0;

		// 등록

		count += personDao.personInsert("응", "000000000", "9128905");
		System.out.println(count + "건 등록되었습니다.");

		// 삭제

		count += personDao.personDelete(6);
		System.out.println(count + "건 삭제되었습니다.");

		// 검색

		List<PersonVo> personList = personDao.personSearch("보");
		for (int i = 0; i < personList.size(); i++) {
			System.out.println("-----------------------------------------------");
			System.out.println(personList.get(i).toString());
		}

		// 리스트

		List<PersonVo> personList2 = personDao.personSelect();
		for (int i = 0; i < personList2.size(); i++) {
			System.out.println("-----------------------------------------------");
			System.out.println(personList2.get(i).toString());
		}

	}

}
