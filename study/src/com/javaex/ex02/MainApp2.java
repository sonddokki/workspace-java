package com.javaex.ex02;

import java.util.ArrayList;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		Triangle t01 = new Triangle(1, 10, 10, "네이비", "핑크");
		Triangle t02 = new Triangle(2, 15, 15, "블루", "화이트");
		Triangle t03 = new Triangle(3, 30, 40, "그린", "그린");
		Triangle t04 = new Triangle(4, 4, 5, "레드", "블랙");
		
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		tList.add(t04);
		
		for (int i=0; i < tList.size(); i++) {
			tList.get(i).draw();
		}		
		
		System.out.println("********************************************");
		
		tList.remove(t01);  // 주소값을 넣어서 해당 객체를 삭제
		for (int i=0; i < tList.size(); i++) {
			tList.get(i).draw();
		}		

		System.out.println("********************************************");
		
		tList.remove(2);   
		// 순서번호를 넣어서 해당 객체를 삭제 (첫번째 객체를 삭제해서 총 사이즈가 3이 되서 0,1,2 중에 2를 삭제)
		for (int i=0; i < tList.size(); i++) {
			tList.get(i).draw();
		}		
		
//		오버로딩은 이름이 같은 메서드들 중에 하나를 골라서 쓸 수 있음 remove
//		오버라이딩은 덮어씌이는 의미인데 일단 더 공부해보셈
		
		
	}

}
