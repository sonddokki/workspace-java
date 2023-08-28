package kr.co.himedia.OCP.Interface;

public class SmartPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Calling...");
	}

	@Override
	public void camera() {
		System.out.println("찰칵");
	}

	@Override
	public void sms() {
		System.out.println("문자발송");
	}

}
