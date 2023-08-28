package kr.co.himedia.loop;

import java.util.Scanner;

public class BaekjoonTest {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int sum = 0;
	    int total = 0;
	
	    System.out.print("몇개의 수를 입력하시겠습니까? : ");
	    int num = scanner.nextInt();
	
	    System.out.print("수를 차례로 입력하시오 : ");
	    int[] nums = new int[num];
	    int a = 0;
	
	    for ( int i = 0 ; i < num; i++) {
	        nums[i] = scanner.nextInt();
	    }
	    System.out.print("찾을 수를 입력하시오 : ");
	    int num2 = scanner.nextInt();
	
	    for ( int i = 0 ; i < num; i++){
	        if ( nums[i] == num2 ) {
	            total++;
	        }
	    }
	
	    System.out.print("찾는 수는 " + total + "개 있습니다.");
	
	}
}
