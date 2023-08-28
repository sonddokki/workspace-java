package kr.co.himedia.staticzone02;

public class NoneStaticAccess {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 객체를 생성해서 접근
		YourUtil your = new YourUtil();
		int result = your.hap(a, b);
		System.out.println(result);
	}

}
