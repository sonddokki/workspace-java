package kr.co.himedia.lamdba10;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		// 익명 내부 클래스 사용
		MathOperation add = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				return x + y;
			}
		};
		
		int result = add.operation(12, 420);
		System.out.println("result = " + result);
		
		// 람다식 사용 덧셈
		
		MathOperation add2 = (x,y) -> x + y;
		int result2 = add2.operation(231, 111);
		System.out.println("result2 = " + result2);
		
		// 람다식 사용 곱셈
		
		MathOperation add3 = (x,y) -> x * y;
		int result3 = add3.operation(32, 5);
		System.out.println("result3 = " + result3);
		
		
		
	}

}
