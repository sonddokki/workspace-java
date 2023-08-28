package himedia;

public class 클래스정의테스트 {
	public static void main(String[] args) {	
		클래스정의 test = new 클래스정의();
		
		String msg5 = "사칙연산";
		
//		test.test1(msg, 100, 50);
		
		int result = test.test3(msg5, 10, 10);
		System.out.println(result);
		
		System.out.println(test.test3(msg5, 10, 10));
		
		
		클래스정의 test2 = new 클래스정의("이순신", 10);
		System.out.println(test2.name);
		System.out.println(test2.age);
		
		클래스정의 car = new 클래스정의(); // 객체 생성
		
	}
}
