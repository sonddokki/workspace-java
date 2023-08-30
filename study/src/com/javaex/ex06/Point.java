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
     
	// 부모(Object)의 toString을 재정의 해줘야 사용가능
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	


}
