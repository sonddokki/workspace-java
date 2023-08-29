package com.javaex.ex05;

public class Triangle extends Shape implements Drawable {

	// 필드
	private int width;
	private int height;

	// 생성자 오버로딩
	public Triangle() {
		super();
	}
	
	
	public Triangle(int width, int height, String fill, String line) {
		super(fill, line);
		this.width = width;
		this.height = height;
	
	}
	
	// 메서드
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

	

	// 메서드 일반
	
	public void draw() {
		System.out.println("======= 삼각형을 생성했습니다 =======");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + super.getFillColor());
		System.out.println("선색: " + super.getLineColor());
		System.out.println();
	}
	
	

	public double area() {
		return width*height/2;
	}
	
	
}
