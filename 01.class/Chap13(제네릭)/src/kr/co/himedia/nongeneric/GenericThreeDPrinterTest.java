package kr.co.himedia.nongeneric;

public class GenericThreeDPrinterTest {
	
	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>(); 
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>(); 
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		
		
	}

}
