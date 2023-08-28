package kr.co.himedia.overoading;

public class AdderTest {
	public static void main(String[] args) {
		Adder adder = new Adder();
		int iResult = adder.add(10, 50);
		System.out.println( "iResult = " +  iResult);
		
		long lResult = adder.add(100, 7500l);
		System.out.println( "lResult = " +  lResult);

		double dResult = adder.add(10.0, 75.32);
		System.out.println( "dResult = " +  dResult);
		
	}

}
