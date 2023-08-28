package himedia;

public class 클래스정의 {
	
	// 필드 - 속성
	// [접근제어자] 타입 변수;
	public String name; // "";
	public int age;
	public String color;
//	private boolean b;
//	public double d; 
	
	int a = 0;
	// 생성자
	// 1. 기본생성자
	// [접근제어자] 클래스이름 () {}
	
	public 클래스정의() {
		this("bmw", 3000000);
		
//		this.name = "bmw";
//		this.age = 300000;
	}
	
	// 2. 매개변수가 있는 생성자
	// [접근제어자] 이름 (매개변수) {}	
	public 클래스정의(String name) {
		this.name = name;
	}

	public 클래스정의(int age) {
		this.age = age;
	}
	
	public 클래스정의(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public 클래스정의(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
//	public 클래스정의(String name, int age, int v) {
//		this.v = v;
//	}

	
	
	// 메서드 - 기능
	// 1. [접근제어자] 반환타입 메서드이름(매개변수) {}
	public void test1(String msg, int a, int b) {
		System.out.println(msg);
		System.out.println(a-b);
	}
	
	// 2. [접근제어자] 반환타입 메서드이름() {}
	public void test2() {}
	
	// 3. [접근제어자] 반환타입 메서드이름(매개변수) {리턴}
	public int test3(String msg2, int c, int d) {
//		System.out.println(msg2);
		int sum = c * d;
		return sum;
	}
	
	// 4. [접근제어자] 반환타입 메서드이름() {리턴}
	public double test4() {
		return 0;
	}
	
	

}
