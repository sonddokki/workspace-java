package kr.co.himedia.generic04;

public class GenericThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		GenericThreeDPrinter<Material> g3DPrinter = new GenericThreeDPrinter<>();
		
		Powder powder = new Powder();
		g3DPrinter.setMaterial(powder);
		System.out.println(g3DPrinter);
		
		GenericThreeDPrinter<Plastic> g3DPrinter2 = new GenericThreeDPrinter<>();
		
		Plastic plastic = new Plastic();
		g3DPrinter2.setMaterial(plastic);
		System.out.println(g3DPrinter2);
		
		g3DPrinter.print();
		g3DPrinter2.print();
		
	}

}
