package kr.co.himedia.templatemethod;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void drive();
	public abstract void stop();
	public abstract void washCar();	
	public void wiper() {};	// 구현부가 있지만 정의된 내용이 없는 메서드
	
	// fianl 키워드로 하위 클래스에서 수정 불가
	final void run() {
		startCar();
		wiper();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
