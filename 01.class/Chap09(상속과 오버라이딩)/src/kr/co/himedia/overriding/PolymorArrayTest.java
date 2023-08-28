package kr.co.himedia.overriding;

public class PolymorArrayTest {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// Dog,Cat을 저장할 배열을 생성하시오.
		Animal[] animals = {new Dog(),new Cat()};
		

		// 다형성 배열
		Animal[] ani = new Animal[2];
		ani[0] = dog;
		ani[1] = cat;
		
		display(ani);
		
	}
	
	
	private static void display(Animal[]ani) {
		for(int i=0;i<ani.length;i++) {
			ani[i].eat();
			
			if (ani[i] instanceof Dog)
				((Dog)ani[i]).chase();
			else if (ani[i] instanceof Cat)
				((Cat)ani[i]).nocturnal();
			
		}
		
	}

	
	
}
