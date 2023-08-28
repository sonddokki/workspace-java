package kr.co.himedia.interface03;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	
	}
	
	public void buy() {
		System.out.println("customer buy");
		
	}

	@Override
	public void order() {
		System.out.println("customer order!");
	}
	
	public void sayHallo() {
		System.out.println("Hello world!");
	}
	

}
