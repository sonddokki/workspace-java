package kr.co.himedia.OCP.Animal;


//   사자 자식클래스 생성해서 애니멀 부모클래스 상속
public class Lion extends Animal {

	@Override
	void speak() {
        System.out.println("크르릉");
		
	}

	@Override
	void eat() {
        System.out.println("고기주시오");
		
	}

}
