package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {
		Triangle t01 = new Triangle();
		t01.setSide01(5);
		t01.setFillColor("초록");
		
		t01.draw();
		
		
		Shape s1 = new Triangle();
		s1.setFillColor("검정");
		System.out.println(s1.fillColor);
		
		
		Shape s2 = new Shape();
		s2.setLineColor("노랑");
		s2.getLineColor();
		
		
		Triangle t02 = new Triangle(3, 3, 3, "파랑", "파랑");
		
		t02.draw();
		
		
		Rectangle r01 = new Rectangle(); 
		r01.fillColor = "빨강";
		r01.draw();
		
		Rectangle r02 = new Rectangle(12, 20, "노랑", "검정"); 
		r02.draw();
		
		
		
		
	}
}
