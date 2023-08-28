package com.javaex.ex01;

public class Circle {

	// 필드
	private int radius;
	private String fillColor;
	private String lineColor;

	// 생성자
	public Circle() {
	} // 기본생성자

	public Circle(int radius, String fill, String line) {
		this.radius = radius;
		this.fillColor = fill;
		this.lineColor = line;
	}

	// 메서드 g,s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	// 메서드 일반
	public void drow() {
		System.out.println("======= 원을 생성했습니다 =======");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println();
	}
	
	
	

}
