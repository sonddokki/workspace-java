package kr.co.himedia.loop03;

public class ContineTest {
	public static void main(String[] args) {
		
		int sum = 1;
		int num;
		
		for (num=1;num<=100;num++) {
			if ( (num%3) !=0) continue; {
				System.out.println(num);
			}
		}
		
		
	}

}
