package com.lg.gugudan02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GugudanArrayList {
	
	private ArrayList<Gugudan> gugudan;
	
	Scanner scan = new Scanner(System.in);
	
	public int gugudan(int start, int end, int endLength) {
		System.out.print("시작할 단을 입력하시오 : ");
		start = scan.nextInt();
		System.out.print("끝낼 단을 입력하시오 : ");
		end = scan.nextInt();
		System.out.print("곱할 수를 입력하시오 : ");
		return endLength = scan.nextInt();
	
	}

	public int calcGugudan(int start, int end, int endLength) {
		Iterator<Gugudan> gu = gugudan.iterator();
		
		int startLength = 1;
		int[][] result = new int[end-start+1][endLength];
		Gugudan gugudan = gu.next();
		
		
		for (int i=start;i<=end;i++) {
			int row = i-start;
			for (int j=startLength;j<=endLength;j++) {
				result[row][j-1] = i*j;
			}
		}
		
		return startLength;
	}
	
	public void showGugudan(int start, int end, int endLength) {
		Iterator<Gugudan> gu = gugudan.iterator();
		int startLength = 1;
		int[][] result = new int[end-start+1][endLength];
		
		for (int i=start;i<=end;i++) {
			int row = i-start;
			for (int j=startLength;j<=endLength;j++) {
				System.out.println(i +" * "+j+" = "+ result[row][j-1]);
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
