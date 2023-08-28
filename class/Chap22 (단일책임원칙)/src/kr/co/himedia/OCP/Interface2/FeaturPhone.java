package kr.co.himedia.OCP.Interface2;

public class FeaturPhone implements Call {

	@Override
	public void call() {
		System.out.println("Calling...");
	}

	@Override
	public void dial() {
		System.out.println("dialing...");
	}
	
	

}
