package kr.co.himedia.conversion;

public class TypeChangeTest {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		int iNUm1 = 20;
		float fNum = iNUm1;
		
		System.out.println( fNum );
		
		
		int iNum2 = 10;
		byte bNum1 = (byte)iNum2;
		
		System.out.println( bNum1 );
		
		
		double dNum = 3.13;
		int iNum3 = (int)dNum;

		System.out.println( iNum3 );
		
	}

}
