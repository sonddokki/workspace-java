package com.javaex.ex03;

public class Circle extends Shape {

	// 필드
	private int radius;

	// 생성자
	public Circle() {}
	
	public Circle(int radius, String fill, String line) {
		super(fill, line);
		this.radius = radius;
	}

	// 메서드 g,s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 메서드 일반
	public void draw() {
		System.out.println("======= 원을 생성했습니다 =======");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + super.getLineColor());
		System.out.println();
	}
	
	
	

}
