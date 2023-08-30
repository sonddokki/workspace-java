package com.javaex.ex06;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		super(); // 부모클래스(Object)의 생성자를 호출
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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
	
	
	public void draw() {
		System.out.println("======= 점을 생성했습니다 =======");
		System.out.println("x축의 위치: " + this.x);
		System.out.println("Y축의 위치: " + this.y);
		System.out.println();
	}
	
	

}
