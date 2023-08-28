package kr.co.himedia.decision;

import java.util.Scanner;

public class IfSimpleTest {
	public static void main(String[] args) {
		int x = 5;
		
		if ( x > 0 ) {
			System.out.println("양수입니다.");
		}
		
		// Quiz. 정수 1개를 입력받아 입력된 수가 8의 배수인지를 출력하시오.
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		
	   int num = scan.nextInt();
	   
	   if ( num % 8 == 0 ) {
		   System.out.println( num + "는(은) 8의 배수입니다.");
	   }
		else {
			 System.out.println( num + "는(은) 8의 배수가 아닙니다.");
		}
	   
	// Quiz. 나이를 입력받아 18세 이상이면 "성인입니다"를 출력하시오.
	   
	   System.out.print("나이를 입력하세요.");
		
	   int age = scan.nextInt();
	   
	   if ( age >= 18 ) {
		   System.out.println( "성인입니다.");
	   }
	   else System.out.println( "미성년자입니다.");
			 
	   scan.close();
	   
	}
}
