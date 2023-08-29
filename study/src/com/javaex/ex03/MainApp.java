package com.javaex.ex03;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		Triangle t01 = new Triangle();
		t01.setSide01(5);
		t01.setFillColor("초록");
		
		t01.draw();
		
		
		Shape s01 = new Triangle();
		s01.setFillColor("검정");
		System.out.println(s01.fillColor);
		
		
		Shape s02 = new Shape();
		s02.setLineColor("노랑");
		s02.getLineColor();
		
		
		Triangle t02 = new Triangle(3, 3, 3, "파랑", "파랑");
		
		t02.draw();
		
		
		Rectangle r01 = new Rectangle(); 
		r01.fillColor = "빨강";
		r01.draw();
		
		Rectangle r02 = new Rectangle(12, 20, "노랑", "검정"); 
		r02.draw();
		
		
		ArrayList<Shape> sList = new ArrayList<Shape>();
		sList.add(t01);
		sList.add(t02);
		sList.add(s01);
		sList.add(s02);
		sList.add(r01);
		sList.add(r02);
		
		for(int i=0;i<sList.size();i++) {
			sList.get(i);
		}
		
		
	}
}
