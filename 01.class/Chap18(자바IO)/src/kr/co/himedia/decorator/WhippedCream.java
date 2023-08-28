package kr.co.himedia.decorator;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brew() {
		super.brew();
		System.out.print("크림 추가 ");
	}

	
}
