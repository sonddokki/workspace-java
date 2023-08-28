package com.lg.lotto;

public class LottoTest {
	
	public static void main(String[] args) {
		
		//로또 객체 생성
		Lotto lotto = new Lotto();
		
		// 5번 반복
		for (int i=0;i<5;i++) {
			lotto.start();
			
			// 로또에서 대입된 난수를 하나씩 가져옴 (배열수만큼)
			for (int s : lotto.getNum()) {
				System.out.printf("%4d",s);
			}
			// 로또배열의 횟수만큼 반복 후 줄바꿈
			System.out.println();
		}
		
	}

}
