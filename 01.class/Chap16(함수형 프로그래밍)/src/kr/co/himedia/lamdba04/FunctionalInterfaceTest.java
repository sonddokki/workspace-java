package kr.co.himedia.lamdba04;

public class FunctionalInterfaceTest implements MathOperation {
	
	public static void main(String[] args) {
		
		MathOperation mo = new FunctionalInterfaceTest();
		int result = mo.operation(100, 200);
		System.out.println( "result = "+result);
		
	}

	
	@Override
	public int operation(int x, int y) {
		
		return x + y;
	}
	

}
