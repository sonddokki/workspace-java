package kr.co.himedia.dip2;

public class Main {
	public static void main(String[] args) {
		
		Car car1 = new Car(new SummerTyre());
		
		car1.drive();
		
		System.out.println("========================");
				
	    Car car2 = new Car(new SnowTyre());
	    
	    car2.drive();
		
	    System.out.println("========================");
	    
	    Car car3 = new Car(new SeasonTyre());
	    
	    car3.drive();
	    
	    
	}

}
