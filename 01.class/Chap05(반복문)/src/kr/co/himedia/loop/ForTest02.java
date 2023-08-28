package kr.co.himedia.loop;

/*
 * 누적합계가 2000 이상일때 그때의 i값과 
 * 
 * 예) 2000이상 일때 i의 값 : 63
 * 	   2000이상 일때 i의 누적값 : 2016
 */

public class ForTest02 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for ( i = 1; i <= 100; i++ ) {
			int num = sum += i;
			if (num >= 2000) {
				break;
			}
		}
		System.out.println( "2000이상 일때 i의 값 : " + i );	
		System.out.println( "2000이상 일때 i의 누적값 : " + sum );
		
	}
}
