package com.javaex.ex06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(20, 10);
	
		System.out.println(p00.toString());  
		// 부모 클래스꺼 이름이 같은 메소드를 자식에 써서 불러오면 재정의 해주면서 리턴값이 나오고 그 전엔 주소값이 나옴
		System.out.println(p00);
		
		System.out.println();

		
		Object o01 = new Point(100, 100);
		
		System.out.println(o01.toString());  
		
		
		
		System.out.println(" 포인트 리스트에 넣기 ");
		
		// 메소드 오버라이딩 (자식 클래스꺼 이름이 같은 메소드 불러와서 사용)
		
		// 새로운 Point 생성
		Point p01 = new Point(20, 10);
		Point p02 = new Point(40, 20);
		Point p03 = new Point(30, 30);
		
		List<Point> pList = new LinkedList<Point>();
		pList.add(p01);
		pList.add(p02);
		
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(" 새 포인트 리스트에 넣기 ");
		
		pList.add(p03);
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(" 첫번째 포인트 리스트에서 빼기 ");
		
		pList.remove(0);
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
	}

}
