package kr.co.himedia.decorator;

public class CoffeeTest {
	
	public static void main(String[] args) {
	
		Coffee KenyaAmericano = new KenyaAmericano();
		KenyaAmericano.brew();
		System.out.println();
		
		Coffee KenyaLatte = new Latte(KenyaAmericano);
		KenyaLatte.brew();
		System.out.println();
		
		Mocha kenyMocha = new Mocha(new Latte(KenyaAmericano));
		kenyMocha.brew();
		System.out.println();
		
		Mocha etiopiaWhippedMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaWhippedMocha.brew();
		System.out.println();
		
		WhippedCream etiopiaWhippedMocha2 = new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		etiopiaWhippedMocha2.brew();
		
		
	}

}
