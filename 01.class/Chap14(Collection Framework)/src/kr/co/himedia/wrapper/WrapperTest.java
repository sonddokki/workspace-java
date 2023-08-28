package kr.co.himedia.wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		
		int a = 10;                          // 기본 자료형
		Integer aa = a;                      // new Integer(10); 오토박싱
		System.out.println(aa.intValue());   // 오토언박싱
		
		Integer bb = 20; //오토박싱
		int b = bb;      //오토언박싱
		
		
	}

}
