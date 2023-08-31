package com.javaex.ex00.miniProject;

public class MainApp {
	
	public static void main(String[] args) {
		
		PersonDao personDao = new PersonDao();
		
		int count = 0;
		
		count += personDao.personInsert( "손성진", "000000000", "9128905");
		
		System.out.println(count + "건 등록되었습니다.");
		
	}

}
