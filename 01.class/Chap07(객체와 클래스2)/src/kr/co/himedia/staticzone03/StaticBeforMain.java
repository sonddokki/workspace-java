package kr.co.himedia.staticzone03;

import java.util.Random;

public class StaticBeforMain {

	static int num;             // 스태틱 멤버변수
	
    static {
    	Random random = new Random();
    	num = random.nextInt(100);     // 0~99 사이 임의의 숫자 변환 
    }
	
    public static void main(String[] args) {
		System.out.println(num);
	}
    
    
}
