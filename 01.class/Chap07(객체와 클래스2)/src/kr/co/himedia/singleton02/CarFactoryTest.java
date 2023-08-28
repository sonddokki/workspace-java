package kr.co.himedia.singleton02;

import kr.co.himedia.staticzone04.Employee;

/*
 *  자동차공장이 있다.
 *  자동차공장이 유일한 객체이고, 이 공장에서 생산되는 자동차는 
 *  생산될때마다 고유의 차번호가 부여된다.
 *  
 *  자동차 번호가 1001번 부터 시작되어 차가 생산되게 구현하시오.
 *  자동차 공장 클래스는 싱글톤 패턴을 적용하여 구현하시오.
 *  
 *  출력 예시
 *          1001
 *          1002
 */

public class CarFactoryTest {
	
	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car BAW_M760Li = carFactory.createCar();
		Car BAW_ix_M60 = carFactory.createCar();
		
		System.out.println(BAW_M760Li.getCarId());
		System.out.println(BAW_M760Li.getCarId());
		
		
		
		
		Car car1 = new Car();
		car1.setCarName("제네시스1");

		Car car2 = new Car();
		car2.setCarName("제네시스2");

		Car car3 = new Car();
		car3.setCarName("제네시스3");

		Car car4 = new Car();
		car4.setCarName("제네시스4");

		Car car5 = new Car();
		car5.setCarName("제네시스5");

		Car car6 = new Car();
		car6.setCarName("제네시스6");
		
		System.out.println(car1.getCarName() +","+ car1.getCarId());
		System.out.println(car2.getCarName() +","+ car2.getCarId());
		System.out.println(car3.getCarName() +","+ car3.getCarId());
		System.out.println(car4.getCarName() +","+ car4.getCarId());
		System.out.println(car5.getCarName() +","+ car5.getCarId());
		System.out.println(car6.getCarName() +","+ car6.getCarId());
	}


}
