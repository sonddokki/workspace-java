package kr.co.himedia.review;

import java.util.Scanner;

/*
 *  다음과 같은 결과가 나오게 구현하시오. (Scanner 사용)
 *  -예시
 *       제목: (자바자바)         <== 입력
 *       title = 자바자바
 *       
 *       가격 = (20000)
 *       price = 20000
 *       
 *       출판사: (하이미디어)
 *       company = 하이미디어
 *       
 *       저자: (이순신)
 *       author = 이순신
 *       
 *       페이지수: (300)
 *       page = 300
 *       
 *       ISBN: (0101234)
 *       isbn = 0101234
 */

public class ScannerQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("제목: ");
		String title =scan.nextLine();
		System.out.println("title = " + title);
		
		System.out.print("가격: ");
		int price =scan.nextInt();
		System.out.println("price = " + price);

		scan.nextLine();

		System.out.print("출판사: ");
		String company =scan.nextLine();
		System.out.println("company = " + company);
		
		System.out.print("저자: ");
		String author =scan.nextLine();
		System.out.println("author = " + author);
		
		System.out.print("페이지수: ");
		int page =scan.nextInt();
		System.out.println("page = " + page);

		scan.nextLine();

		System.out.print("연락번호: ");
		int isbn =scan.nextInt();
		System.out.println("isbn = " + isbn);
		
		
		System.out.printf("책 %s의 가격은 %d원 이고 저자는 %s, 출판사는 %s이다. \n "
				+ "페이지 수는 %d장이며 번호는 %d이다.", title,price,company,author,page,isbn );
		

	}

}
