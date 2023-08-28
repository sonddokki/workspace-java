package com.javaex.ex01;

public class Shape {
	
		// 필드
		private String fillColor;
		private String lineColor;

		// 생성자
		public Shape() {}
		
		public Shape(String fill, String line) {
			this.fillColor = fill;
			this.lineColor = line;
		}
		
		// 메서드
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
			System.out.println("======= 도형을 생성했습니다 =======");
			System.out.println("면색: " + fillColor);
			System.out.println("선색: " + lineColor);
			System.out.println();
		}
		

}
