package com.javaex.ex02.author;

import java.util.List;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		AuthorDao authorDao = new AuthorDao();

//		System.out.println("===============================================");
//		
//		countInsert += authorDao.authorInsert( "강풀" , "무빙" );
//
//		countInsert += authorDao.authorInsert( "손성진" , "학생" );
//		
//		System.out.println(countInsert + "건 등록되었습니다.");
//		
//		System.out.println("===============================================");
//		
//		countDelete += authorDao.authorDelete( 10 );
//		
//		
//		System.out.println(countDelete + "건 삭제되었습니다.");
//		
//		System.out.println("===============================================");
		
//		countUpdate += authorDao.authorUpdate( "강풀", "웹툰작가");
		
//		System.out.println( "작가정보" + countUpdate + "건이 업데이트 되었습니다.");
		
		
//		System.out.println("===============================================");
		
		List<AuthorVo> authorList = authorDao.authorSelect();
		System.out.println(authorList.toString());
		
		for (int i=0;i<authorList.size();i++) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println(authorList.get(i).toString());
		}
		
		
		
		

	}

}
