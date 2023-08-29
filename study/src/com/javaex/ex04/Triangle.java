package com.javaex.ex04;

public class Triangle extends Shape {

	// 필드
	private double side01;
	private double side02;
	private double side03;

	// 생성자 오버로딩
	public Triangle() {
		super();
	}
	
	
	public Triangle(double side01, double side02, double side03, String fill, String line) {
//		super();
//		this.side01 = side01;
//		this.side02 = side02;
//		this.side03 = side03;
		
//		부모의 메소드를 쓸때는 슈퍼
//		super.setFillColor("빨강");
//		super.setLineColor("빨강");
		
		super(fill, line);
		this.side01 = side01;
		this.side02 = side02;
		this.side03 = side03;
	
	}
	
	
	
	
	// 메서드

	public double getSide01() {
		return side01;
	}

	public void setSide01(int side01) {
		this.side01 = side01;
	}

	public double getSide02() {
		return side02;
	}

	public void setSide02(int side02) {
		this.side02 = side02;
	}

	public double getSide03() {
		return side03;
	}

	public void setSide03(int side03) {
		this.side03 = side03;
	}

	// 메서드 일반
	
	public void draw() {
		System.out.println("======= 삼각형을 생성했습니다 =======");
		System.out.println("첫번째 변의 길이: " + this.side01);
		System.out.println("두번째 변의 길이: " + this.side02);
		System.out.println("세번째 변의 길이: " + this.side03);
		System.out.println("면색: " + super.getFillColor());
		System.out.println("선색: " + super.getLineColor());
		System.out.println();
	}
	
	public double area() {
		return side01*side02/2;
	}
	
	
}
