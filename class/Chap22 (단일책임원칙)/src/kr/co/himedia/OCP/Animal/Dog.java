package kr.co.himedia.OCP.Animal;

public class Dog extends Animal { // 상속
	
	@Override
    void speak() {
        System.out.println("멍멍");
    }

	@Override
	void eat() {
		System.out.println("개껌주시오");
		
	}
		
}

class Duck extends Animal {

	@Override
	void speak() {
		System.out.println("꽥꽥");
	}

	@Override
	void eat() {
		System.out.println("물고기주시오");
	}
	
}