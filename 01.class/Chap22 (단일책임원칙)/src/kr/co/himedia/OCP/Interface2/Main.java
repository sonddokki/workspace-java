package kr.co.himedia.OCP.Interface2;

public class Main {
	
	public static void main(String[] args) {
		Call basicPhone = new FeaturPhone();
		basicPhone.call();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.sendText();
		
		System.out.println();
		
		//다운캐스팅
		Call smartPhone2 = new SmartPhone();
		// 상속
		if(smartPhone2 instanceof SmartPhone) {
			SmartPhone smartPhone3 = (SmartPhone) smartPhone2;
			smartPhone3.takePhoto();
			smartPhone3.call();
		}
		
		

	}
	
	
}
