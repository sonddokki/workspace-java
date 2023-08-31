package com.javaex.ex02.book;

import java.util.List;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		
		int countInsert = 0;
		int countUpdate = 0;
		int countDelete = 0;

//		System.out.println("===============================================");
//		
//		countInsert += bookDao.bookInsert( "삼국지", "출판", "92/03/12", 1);
//
//		countInsert += bookDao.bookInsert( "사국지", "출판소", "23/03/12", 2);
//		
//		System.out.println(countInsert + "건 등록되었습니다.");
//		
//		System.out.println("===============================================");
//		
//		countDelete += bookDao.bookDelete( 21 );
//		
//		
//		System.out.println(countDelete + "건 삭제되었습니다.");
//		
//		System.out.println("===============================================");
		
//		countUpdate += bookDao.bookUpdate("사국지", "4");
//		
//		System.out.println( "책정보" + countUpdate + "건이 업데이트 되었습니다.");
		
		
//		System.out.println("===============================================");
		
		List<BookVo> bookList = bookDao.bookSelect();
		System.out.println(bookList.toString());
		
		for (int i=0;i<bookList.size();i++) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println(bookList.get(i).toString());
		}
		
		
		
		

	}

}
