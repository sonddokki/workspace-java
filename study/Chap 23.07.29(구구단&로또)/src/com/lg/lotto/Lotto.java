package com.lg.lotto;

// 
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Lotto {
	
	// 배열 변수 선언 및 메모리 할당 -> 로또번호 6개
	private int[] num = new int[6];
	
	// 입력받을 일이 없으므로 get만 지정
	public int[] getNum() {
		return num;
	}
	
	// 난수발생 메소드
	public void start() {
		
		Random rd = new Random();
		
		int n;  // 발생시킬 난수를 대입할 변수선언
		int cnt = 0;  // 불러올 횟수를 0으로 초기화
		
		// 점프하면 이쪽부터 다시시작
		jump:
		
		while (cnt<6) {  // cnt가 6이상일때 종료
			// n에 1~45사이의 난수를 발생해서 대입 (0번부터 시작하기 때문에 +1을 해준다)
			n = rd.nextInt(45) + 1; 
			
			for (int i=0;i<cnt;i++) {   // i가 cnt이상일때 종료
				if (num[i] == n) { // num[i]가 기존 n 중복숫자가 나오면 점프
					continue jump;
				}
			}
			num[cnt++] = n; // 발생된 n을 num[]에 대입
			
		}
		
		sorting();
		
	}
	
	// 오름차순 배열출력 메소드
	private void sorting() {
		Arrays.sort(num);
	}
	
	// 내림차순 배열출력 메소드 (실패)
//	private void sorting2() {
//		Arrays.sort(num,(i1, i2) -> i2 - i1 );
//	}
	
	

}
