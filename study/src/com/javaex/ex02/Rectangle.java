package com.javaex.ex02;

public class Rectangle extends Shape {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle(int width, int height, String fillColor, String lineColor) {   // 메모리 올리기
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;		
	}  

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	// 메소드-일반
	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("======= 사각형을 생성했습니다 =======");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println();
	}
}






