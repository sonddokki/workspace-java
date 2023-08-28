package kr.co.himedia.loop03;

public class BreakTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for (num=1;;num++) {
			sum += num;
			if (sum >= 100) break;
		}
		System.out.println("100이 넘는 순간의 합 : "+ sum);
		System.out.println("100이 넘는 순간의 num : "+ num);
	}

}
