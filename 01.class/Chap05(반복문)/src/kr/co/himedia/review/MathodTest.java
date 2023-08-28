package kr.co.himedia.review;

public class MathodTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		//Call by value (값에 의한 복사)
		int result = add(num1,num2);
		System.out.println("num1 + num2 : " + result);
		
		//Call by value (값에 의한 복사)
		result =minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		
		
	}
	
	private static int add(int x,int y) {
		System.out.println("add 메서드 ");

		return x + y;
	}
	private static int minus(int x,int y) {
		System.out.println("minus 메서드 ");

		return x - y;
	}


}
