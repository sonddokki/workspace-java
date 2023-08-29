package com.javaex.ex03;

public class Shape {
	
		// 필드
		protected String fillColor;  // 상속받은 클래스에는 접근 허용
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
	
		

}
