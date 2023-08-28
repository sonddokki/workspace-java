package kr.co.himedia.operator02;

import java.util.Scanner;

/*
 *  입력 받은 두 수중에서 큰 수를 출력하시오.
 *  
 *  입력1 :
 *  입력2 :
 */

public class ConditionTest03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print( " 숫자 1 입력 : ");
		int a = scanner.nextInt();
		System.out.print( " 숫자 2 입력 : ");
		int b = scanner.nextInt();
		
		int max = ( a < b ) ? b : a ;
		System.out.println( "더 큰 수를 출력 : " + max);
		
		scanner.close();
		
	}
}
