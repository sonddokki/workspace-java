package kr.co.himedia.lamdba04;

public class FunctionalInterfaceTest03 {
	
	public static void main(String[] args) {
		
		// MathOperation 인터페이스 익명 (anonymous) 내부 클래스로 구현함
		MathOperation mo = new MathOperation() {
			@Override
			public int operation(int x, int y) {
				return x+y;
			}
		};
		
		int result = mo.operation(300, 200);
		System.out.println("result = "+result);
		
		
		
	}

}
