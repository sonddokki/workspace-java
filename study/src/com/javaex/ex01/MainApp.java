package com.javaex.ex01;

public class MainApp {
	
	// 필드
	
	// 생성자
	
	// 메소드gs
	
	// 메소드 일반
	public static void main(String[] args) {
		// 메인 시나리오
		
		// Rectangle 메모리에 올린다
		
		// 사각형1
		Rectangle r01 = new Rectangle();		
		
		r01.setWidth(3);
		r01.setHeight(2);
		r01.setFillColor("초록");
		r01.setLineColor("빨강");
		
//		System.out.println("가로: " + r01.getWidth());
//		System.out.println("세로: " + r01.getHeight());
//		System.out.println("면색: " + r01.getFillColor());
//		System.out.println("선색: " + r01.getLineColor());
		
		r01.drow();
		
		// 사각형2
		Rectangle r02 = new Rectangle(5, 5, "빨강", "빨강");
		
//		r02.setWidth(5);
//		r02.setHeight(5);
//		r02.setFillColor("빨강");
//		r02.setLineColor("빨강");
		
//		System.out.println("가로: " + r02.getWidth());
//		System.out.println("세로: " + r02.getHeight());
//		System.out.println("면색: " + r02.getFillColor());
//		System.out.println("선색: " + r02.getLineColor());
		
		r02.drow();
		
		// 삼각형1
		Triangle t01 = new Triangle();
		t01.setSide01(4);
		t01.setSide02(7);
		t01.setSide03(9);
		t01.setFillColor("파랑");
		t01.setLineColor("검정");
		
		t01.drow();
		
		// 삼각형2
		Triangle t02 = new Triangle(10,10,10,"분홍","검정");
		
		t02.drow();
		
		// 원1
		Circle c01 = new Circle();
		c01.setRadius(20);
		c01.setFillColor("보라");
		c01.setLineColor("하양");
		
		c01.drow();		
		
	    // 원2
		Circle c02 = new Circle(40,"파랑","하양");
		c02.drow();

		
	}
}
