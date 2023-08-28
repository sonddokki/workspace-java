package com.javaex.ex01;

public class MainApp {
	
	// 필드
	
	// 생성자
	
	// 메소드gs
	
	// 메소드 일반
	public static void main(String[] args) {
		// 메인 시나리오
		
		// Rectangle 메모리에 올린다
		
		Rectangle r01 = new Rectangle();		
		
		r01.setWidth(3);
		r01.setHeight(2);
		r01.setFillColor("초록");
		r01.setLineColor("빨강");
		
		System.out.println("가로: " + r01.getWidth());
		System.out.println("세로: " + r01.getHeight());
		System.out.println("면색: " + r01.getFillColor());
		System.out.println("선색: " + r01.getLineColor());
		
		
	}
}
