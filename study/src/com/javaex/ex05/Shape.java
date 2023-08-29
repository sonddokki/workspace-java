package com.javaex.ex05;

public abstract class Shape {
	
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
//		public abstract void draw();  인터페이스로 이동
		
		public abstract double area();
		
}
