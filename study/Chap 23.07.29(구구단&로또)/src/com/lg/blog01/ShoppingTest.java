package com.lg.blog01;

import java.util.Scanner;

public class ShoppingTest {
	public static void main(String[] args) {
		Shopping user = new Shopping();   // 객체생성
		Scanner sc = new Scanner(System.in);
	
		System.out.print("주문번호 : ");
		user.setOrderNumber(sc.nextLine());

		System.out.print("주문자 아이디 : ");
		user.setUserId(sc.nextLine());
		
		System.out.print("주문 날짜 : ");
		user.setOrderDate(sc.nextLine());
		
		System.out.print("주문자 이름 : ");
		user.setUserName(sc.nextLine());
		
		System.out.print("주문 상품 번호 : ");
		user.setGoodsNumber(sc.nextLine());
		
		System.out.print("배송 주소 : ");
		user.setAddress(sc.nextLine());
	
//		Shopping s2 = new Shopping(230729023, usId, "2023.07.29", od, 45234, "경기도 하남시", "2141221");
//		
//		s2.orderPrint();
		
		user.orderPrint();
		
		
		
		
		
	}

}
