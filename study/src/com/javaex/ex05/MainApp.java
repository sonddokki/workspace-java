package com.javaex.ex05;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		// 모두 담을 수 있는 리스트 만들기
		ArrayList<Drawable> dList = new ArrayList<Drawable>();
		
		// 삼각형, 사각형, 원, 점 1개씩 만들기
		Drawable t01 = new Triangle(10,10,"빨강","빨강");
		Drawable r01 = new Rectangle(50,50,"파랑","파랑");
		Drawable c01 = new Circle(100,"노랑","노랑");
		Drawable p01 = new Point(10,10);
		
		// 리스트에 담기
		dList.add(t01);	
		dList.add(r01);	
		dList.add(c01);	
		dList.add(p01);	
		
		// 처음부터 끝까지 돌면서 모두 출력
		for (int i=0;i<dList.size();i++) {
			dList.get(i).draw();
		}
		
		// 면적구하기
		for (int i=0;i<dList.size();i++) {
			if( dList.get(i) instanceof Shape ) {
				System.out.println("도형의 넓이 " + ((Shape)dList.get(i)).area());
			}                    // 형변환
		}                    
		
		System.out.println(dList);
		
	}
}
