package com.javaex.ex01;

public class Rectangle extends Shape{

	// 필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;

	// 생성자
	public Rectangle() {}  // 메모리에 올리는 중요한 일을 담당 (작성하지않아도 자동생성)
	
	public Rectangle(int width, int height, String fillColor, String lineColor) {   // 메모리 올리기
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;		
	}  

	// 메소드-gs
	// 접근제어자, 리턴형(반환타입), 메소드이름(기능을 알아볼 수 있게)

	// public void setWidht(int width) {
	// if(width<0) {
	// this.width = 0;
	// } else {
	// this.width = width;
	// }
	// }
	//
	// public int getWidth() {
	//// int result = this.width;
	//// return result;
	//// 위에걸 줄여서
	// return width;
	// }

	// alt + shift + s 단축기로 get,set 만들기 가능
	// ctrl + shift + f 단축기로 줄 정리 가능
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

	
	// 메소드-일반
	public void drow() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("======= 사각형을 생성했습니다 =======");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println();
	}
}






