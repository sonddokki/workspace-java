package kr.co.himedia.singleton02;

import kr.co.himedia.staticzone04.Employee;

//

public class CarFactory {
	
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	public static CarFactory getInstance() {
		
		if (instance == null)
			instance = new CarFactory();
		
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
