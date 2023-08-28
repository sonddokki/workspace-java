package kr.co.himedia.lamdba04;

public class FunctionalInterfaceTest02 {

	public static void main(String[] args) {
		
		MathOperation mo = new MathOperationImpl();   // 별도로 만든 클래스를 임폴함
		int result = mo.operation(200, 100);
		System.out.println("result = "+result);
				
	}
}
