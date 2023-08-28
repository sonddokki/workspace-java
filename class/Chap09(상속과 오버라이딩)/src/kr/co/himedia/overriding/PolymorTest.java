package kr.co.himedia.overriding;

public class PolymorTest {
	public static void main(String[] args) {
		
		/*
		 *  업캐스팅으로 객체 생성
		 *   - 상속, 재정의 (오버라이드), 동적바인딩
		 *   - => 다형성 : 상위클래스가 동일한 메시지로 하위클래스를 서로 다르게 동작시키는 객체지향 원리.
		 */
		
		Animal animal = new Dog();
		animal.eat();   // 실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩 (동적바인딩)
		
		System.out.println();
		
		animal = new Cat();
		animal.eat();
		
		System.out.println();
		
		// Downcasting
		/*
		 *  overide(재정의) : 동적바인딩 -- 실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩
		 *  overloading : 정적바인딩 -- 컴파일시점에서 사용될 메서드가 결정되는 바인딩
		 */
		((Cat)animal).eat();
	}
	
	
	

}
