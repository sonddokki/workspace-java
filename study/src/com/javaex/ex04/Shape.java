package com.javaex.ex04;

public abstract class Shape {
	
		// 필드
		private String fillColor;  // 상속받은 클래스에는 접근 허용
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
//		public void  draw() { 
		// 오버라이드 (자식 메서드를 쓰고 싶으면 같은 이름의 메서드를 부모쪽에
		//	            만들면 부모 메서드가 무시되고 자식 메서드를 불러온다)
//			System.out.println("안녕하세요");
//		}
		
		public abstract void draw();
		
		public abstract double area();
		

}
