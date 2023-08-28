package kr.co.himedia.staticzone;

public class StaticTest {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int resuli = sum(a,b);
		System.out.println("sum =  " + resuli);
	}
	
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}

}
