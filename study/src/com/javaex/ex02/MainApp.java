package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	
	public static void main(String[] args) {
		// 사각형2를 메모리에 올리고
		// 리스트에 담고
		// 리스트를 가지고 출력
		
		// 사각형 객체 생성
		Rectangle r01 = new Rectangle(3, 3, "빨강", "빨강");
		Rectangle r02 = new Rectangle(10, 10, "파랑", "파랑");
		
		// rList리스트 객체 생성
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		
		
		// 사각형 객체 rList리스트에 담기
		rList.add(r01);
		rList.add(r02);
		
		
		System.out.println("담긴 사각형의 수 : " + rList.size() + "개");
		
		// rList 메서드 사용 .사각형 메서드 사용
		rList.get(0);  // 주소
		rList.get(0).draw(); // 리스트에 담긴 0번째 인스턴스의 draw 가져오기
		rList.get(1).draw();
		System.out.println("r02"+"사각형의 면 색 = " + rList.get(1).getFillColor());
		
		
		System.out.println("======================================");
		
		
		// 삼각형 객체 생성
		Triangle t01 = new Triangle(10, 10, 10, "네이비", "핑크");
		Triangle t02 = new Triangle(15, 15, 15, "블루", "화이트");
		Triangle t03 = new Triangle(20, 30, 40, "그린", "그린");
		Triangle t04 = new Triangle(3, 4, 5, "레드", "블랙");
		
		
		// tList리스트 객체 생성
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		
		
		// 삼각형 객체 tList리스트에 담기
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		tList.add(t04);
		
		
		System.out.println("담긴 삼각형의 수 : " + tList.size() + "개");
		System.out.println("t01"+"삼각형의 면 색 = " + tList.get(0).getFillColor());
		
		
		// 반복문을 이용한 삼각형 출력
		// 삼각형이 리스트에 담긴 수 (size) 만큼 반복문을 돌린다.
		for (int i=0; i < tList.size(); i++) {
//			Triangle tmp = tList.get(i);
//			tmp.draw();
		//굳이 새로운 변수에 담지 않아도 메서드 실행 가능
			tList.get(i).draw();
		}
		// tList에서 get(리스트순서)
		
		
		System.out.println("======================================");
		
		
		// 원 객체 생성
		Circle c01 = new Circle(10, "코발트", "옐로우");
		Circle c02 = new Circle(100, "그레이", "베이지");
		
		
		// cList리스트 객체 생성
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		
		// 삼각형 객체 tList리스트에 담기
		cList.add(c01);
		cList.add(c02);
		
		
		System.out.println("담긴 원의 수 : " + cList.size() + "개");
		
		// 원 출력
		cList.get(0).draw();
		cList.get(1).draw();
		
		
		
	}
}
