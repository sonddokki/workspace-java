package kr.co.himedia.OCP.Animal;

/*
 *  추상 부모클래스 애니멀에서 
 */


public class Main {
	
	public static void main(String[] args) {
		
		HelloAnimal hello = new HelloAnimal();
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		hello.hello(cat);
		
		System.out.println();
		
		hello.hello(dog);
		
		System.out.println();
		
		Animal lion = new Lion();
		hello.hello(lion);
		
		System.out.println();
		
		Animal duck = new Duck();
		hello.hello(duck);
		
		
	}

}
