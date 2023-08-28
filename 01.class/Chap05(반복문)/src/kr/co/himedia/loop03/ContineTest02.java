package kr.co.himedia.loop03;

import java.awt.FocusTraversalPolicy;

// 1~10까지의 수 중 3의 배수

public class ContineTest02 {
	public static void main(String[] args) {
		
		int count = 0;
		int num;
		
		for (num=1;num<=10;num++) {
			if (num % 3 != 0) continue;  {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
