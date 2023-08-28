package kr.co.himedia.singleton02;

/*
 *  serialNum 
 */

public class Car {
	
	private int carId;
	private String carName;
	private static int serialNum = 1001;
	
	public Car() {
		carId = Car.serialNum++;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	

}
