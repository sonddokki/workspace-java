package kr.co.himedia.OCP.Interface2;

public class SmartPhone implements Call, Camera, Sms {

	@Override
	public void sendText() {
		System.out.println("sendText...");
	}

	@Override
	public void takePhoto() {
		System.out.println("takePhoto...");
	}

	@Override
	public void takeVideo() {
		System.out.println("takeVideo...");
	}

	@Override
	public void call() {
		System.out.println("Calling...");
	}

	@Override
	public void dial() {
		System.out.println("dialing...");
	}

}
