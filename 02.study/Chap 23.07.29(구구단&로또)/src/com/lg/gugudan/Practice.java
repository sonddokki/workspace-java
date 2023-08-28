package com.lg.gugudan;

/*
 *   0  1  2  3  4  5  6  7  8  9  10
 * 0
 * 1
 * 2             x
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 
 * row, column 변수의 값에 따라 위치에 맞는 좌표 출력하기
 */

public class Practice {
	public static void main(String[] args) {
		int row = 6;	// 행
		int column = 4;	// 열
		
		String arr[][] = new String[11][11];
	
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (row == j && column == i) {
					arr[i][j] = "x";
				}
				else {
					arr[i][j] = "   ";
				}
			}
		}
		
		System.out.println(" 0  1  2  3  4  5  6  7  8  9  10");
		for (int i = 0; i < 11; i++) {
			System.out.print(i);
			for (int j = 0; j < 11; j++) {
				
				if (row == j && column == i) {
					System.out.printf("%s", arr[i][j]);
				}
				else {
					System.out.printf("%s", arr[i][j]);
				}
			}
			System.out.println();
		}
		
		
	}
}
