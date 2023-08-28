package kr.co.himedia.decorator;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brew() {
		super.brew();
		System.out.print("모카 시럽 추가 ");
	}

}
