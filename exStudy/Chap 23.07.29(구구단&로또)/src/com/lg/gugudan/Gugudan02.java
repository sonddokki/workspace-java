package com.lg.gugudan;

public class Gugudan02 {
	
	public static void main(String[] args) {
		
		// 1. 시작할 단의 수
		int start = 3;
		
		// 2. 끝낼 단의 수
		int end = 8;
		
		// 3. 단에서 처음곱할 수 (변하지 않으므로 final)
		final int startLength = 1;
		// 4. 단에서 마지막으로 곱할 수
		int endLength = 5;
		
		// 5. 배열생성과 길이부여 [시작단부터 끝날단까지의 갯수] [마지막으로 곱하는 수]
		int[][] result = new int[end-start+1][endLength]; // [6] [5]
		
		// 6. i는 시작단 ; 시작단이 끝낼단의 수와 같아지면 종료; 시작단증감
		for (int i=start;i<=end;i++) {
			
			// 7. row변수에 시작단을 대입한 i에서 시작단을 뺀수를 대입
			int row = i-start;
			
			// 8. j는 처음곱할 수(1); j가 마지막으로 곱할 수와 같아지면 종료; 곱할 수 증감
			for (int j=startLength;j<=endLength;j++) {
				
				//9. 배열 result[][]에 i에 대입된 단과 j에 대입된 수를 곱해서 대입하여 배열에 저장
				result[row][j-1] = i*j;
			}
		}
		
		
		// 10. 저장된 배열을 차례대로 출력하기
		for (int i=start;i<=end;i++) {
			int row = i-start;
			for (int j=startLength;j<=endLength;j++) {
				System.out.println(i +" * "+j+" = "+ result[row][j-1]);
			}
			System.out.println();
		}


	}
}
