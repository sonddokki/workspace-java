package kr.co.himedia.lamdba04;

public class FunctionalInterfaceTest04 {
	
	public static void main(String[] args) {
		
		// 람다식으로 구현
		MathOperation add = (int x, int y) -> {return x + y;};
		
		int result = add.operation(400, 500);
		System.out.println("result = "+ result);
		
	}

}
