package com.lg.gugudan;

import java.util.Scanner;

public class Gugudan {
	

	
	
	public void inPut(Scanner scan) {
		
	}

	

	public void gugudan() {
		
		Scanner scan = new Scanner(System.in);
		inPut(scan);
		
		System.out.print("시작단을 입력하십시오 : ");
		int numStart = scan.nextInt();
		System.out.print("몇까지 곱하시겠습니까? : ");
	    int numEnd = scan.nextInt();
		
		int numArray[] = new int[numEnd];
	    
	    for (int i=1;i<=numEnd;i++) {
	    	numArray[i-1] = numStart*i;
	    	System.out.println(numStart+" * "+ i + " = " + numArray[i-1]);
	    }
	}
	
	
//	public void showOutPut() {
//		for (int i=1;i<=numEnd;i++) {
//	    	numArray[i-1] = numStart*i;
//	    	System.out.println(numStart+" * "+ i + " = " + numArray[i-1]);
//	    }	
//	}
	
	

}
