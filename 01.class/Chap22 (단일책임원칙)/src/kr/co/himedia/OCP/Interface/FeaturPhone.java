package kr.co.himedia.OCP.Interface;

public class FeaturPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Calling...");
	}

	@Override
	public void camera() {
		// 기능미제공
		throw new UnsupportedOperationException();
	}

	@Override
	public void sms() {
		throw new UnsupportedOperationException();
	}

}
