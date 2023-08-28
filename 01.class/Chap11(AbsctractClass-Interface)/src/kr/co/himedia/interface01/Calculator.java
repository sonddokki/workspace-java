package kr.co.himedia.interface01;

public abstract class Calculator implements Calc {	// abstract - 추상클래스, implements - 구현
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
