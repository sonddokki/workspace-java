package kr.co.himedia.loop04;

import java.util.Scanner;

/*
 *  =========================
 *  1. 증속  2. 감속  3. 중지
 *  =========================
 *  입력 : 4
 *  잘못된 입력 값입니다.
 *  =========================
 *  1. 증속  2. 감속  3. 중지
 *  =========================
 *  입력 : 1
 *  현재 속도 : 기존속도 +1
 *   =========================
 *  1. 증속  2. 감속  3. 중지
 *  =========================
 *  입력 : 2
 *  현재 속도 : 기존속도 -1
 *  =========================
 *  1. 증속  2. 감속  3. 중지
 *  =========================
 *  입력 : 3
 *  프로그램을 종료합니다.
 */ 

public class WhileTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int speed = 0;
//
//		System.out.println("=======================");
//		System.out.println(" 1. 증속  2. 감속  3. 중지");
//		System.out.println("=======================");
		boolean run =true;
		
		while (run) {
			System.out.println();
			System.out.println("=======================");
			System.out.println(" 1. 증속  2. 감속  3. 중지");
			System.out.println("=======================");
			System.out.print("입력 : ");
			
			int num =scan.nextInt();
			
			if (num==1) {
				speed++;
			} 
			else if (num==2) {
				speed--;
			}
			else if (num==3) {
				run = false;
			}
			else {
				System.out.println("잘못된 입력 값입니다.");
			}
			System.out.println("현재속도 " + speed);
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		
	
	}

}
