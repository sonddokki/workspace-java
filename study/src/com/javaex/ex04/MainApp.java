package com.javaex.ex04;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// 사각형 삼각형 원 각각 리스트로 관리하는것이 아니고
		// 모든 도형을 1개의 리스트로 관리하고 싶다.
		
		new ArrayList<Object>();
		
		ArrayList<Shape> sList = new ArrayList<Shape>();
		
		// 삼각형
		Triangle t01 = new Triangle(3, 3, 3, "빨강", "빨강");
		Triangle t02 = new Triangle(3, 3, 3, "노랑", "노랑");
		
		// 사각형
		Rectangle r01 = new Rectangle(10, 10, "주황", "주황");
		
		// 원
		Circle c01 = new Circle(100, "파랑", "파랑");
		
		// 리스트에 추가
		sList.add(t01);
		sList.add(t02);
		sList.add(r01);
		sList.add(c01);
		
		// 전체
		
		for (int i=0;i<sList.size();i++) {
			sList.get(i).draw();
		}
			
		// 섞어쓰기
	    Shape t03 = new Triangle(100, 100, 100, "","");
	    t03.draw();
		
	    // 형변환으로 출력 가능 (메모리에 올라와 있다면 사용가능)
	    System.out.println(((Triangle)sList.get(0)).getSide01());
		
	    // Shape에 abstract를 쓰면 메모리에 올릴 수 없음
//	    Shape s01 = new Shape("빨강", "빨강");
	    
	    System.out.println(c01.area());
	    
	    System.out.println();
	    
	    for (int i=0;i<sList.size();i++) {
	    	System.out.println(sList.get(i).area());
	    }
	    
	    
	    
	    
	}
}
