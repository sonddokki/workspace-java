package com.javaex.ex05;

public class Point implements Drawable {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드-g,s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 일반
	public void draw() {
		System.out.println("======= 점을 생성했습니다 =======");
		System.out.println("x축의 위치: " + this.x);
		System.out.println("Y축의 위치: " + this.y);
		System.out.println();
	}
	

}
