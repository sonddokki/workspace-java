package kr.co.himedia.overriding;

public class PolymorMethodTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		display(dog);
		System.out.println();
		
		Cat cat = new Cat();
		display(cat);
		
	}

	
	private static void display(Animal ani) { // 다형성 적용된 인수
		ani.eat();
		
		if (ani instanceof Dog) 
			((Dog)ani).chase();
		else if (ani instanceof Cat)
			((Cat)ani).nocturnal();
		else
			System.out.println("상속관계가 아닌 객체입니다.");
			
		
		System.out.println();
	}
}
