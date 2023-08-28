package com.javaex.ex01;

public class Triangle {

	// 필드
	private int side01;
	private int side02;
	private int side03;
	private String fillColor;
	private String lineColor;

	// 생성자
	public Triangle() {}
	
	public Triangle(int s1, int s2, int s3, String fill, String line) {
		this.side01 = s1;
		this.side02 = s2;
		this.side03 = s3;
		this.fillColor = fill;
		this.lineColor = line;
	}
	
	// 메서드

	public int getSide01() {
		return side01;
	}

	public void setSide01(int side01) {
		this.side01 = side01;
	}

	public int getSide02() {
		return side02;
	}

	public void setSide02(int side02) {
		this.side02 = side02;
	}

	public int getSide03() {
		return side03;
	}

	public void setSide03(int side03) {
		this.side03 = side03;
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
		System.out.println("======= 삼각형을 생성했습니다 =======");
		System.out.println("첫번째 변의 길이: " + side01);
		System.out.println("두번째 변의 길이: " + side02);
		System.out.println("세번째 변의 길이: " + side03);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println();
	}
	
	
	
	
}
