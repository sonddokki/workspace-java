package kr.co.himedia.overriding;

public class ObjectCasting {
	
	public static void main(String[] args) {
		// Dog 객체 생성
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println();
		
		//upcasting -- 부모타입으로 자식객체를 가리킨다
		Animal animal = new Dog();
		animal.eat();
		
		System.out.println();
		
		//upcasting
//		Animal animal2 = new Cat();
//		animal2.eat();
//		
//		Cat cat = new Cat();
//		cat.eat();

		System.out.println();
		
		//downcasting
		Dog ddog = (Dog)animal;
		ddog.chase();

		System.out.println();
		
		((Dog)animal).chase();

		System.out.println();
		
//		((Cat)animal2).nocturnal();
		
		
		
	}
}
