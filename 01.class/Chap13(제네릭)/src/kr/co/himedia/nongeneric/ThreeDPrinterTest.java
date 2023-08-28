package kr.co.himedia.nongeneric;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder powder = new Powder();
		printer.setMaterial(powder);
		
		Powder powder2 = printer.getMaterial();
		System.out.println(powder2);
		
		ThreeDPrinter02 printer2 = new ThreeDPrinter02();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		
		System.out.println(plastic);
		
		System.out.println();
		
		ThreeDPrinter03 printer3 = new ThreeDPrinter03();
		printer3.setMaterial(powder);
		Powder powder3 = (Powder) printer3.getMaterial();
		System.out.println(powder3);
		
		
		
		
	}

}
