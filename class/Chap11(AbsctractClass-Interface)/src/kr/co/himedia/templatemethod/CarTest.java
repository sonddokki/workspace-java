package kr.co.himedia.templatemethod;

public class CarTest {
	public static void main(String[] args) {
		Car gaiCar = new GenerativeAICar();
		gaiCar.run();
		System.out.println();
		
		Car menualCar = new ManualCar();
		menualCar.run();
	}
}
