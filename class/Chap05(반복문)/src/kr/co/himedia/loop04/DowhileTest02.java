package kr.co.himedia.loop04;

import java.net.Socket;
import java.util.Scanner;

/*
 * 메시지를 입력하세요.
 * 프로그램을 종료하려면 q를 입력하세요.
 * 
 * >하이미디어
 * 입력받은 메시지 : 하이미디어
 * >천호역
 * 입력받은 메시지 천호역
 * >q
 * 프로그램을 종료합니다.
 */

public class DowhileTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
	    String str = null;
	    
	    System.out.println("프로그램을 종료하려면, q를 입력하세요 ");
	    
	    do {
	    	System.out.print("메시지를 입력하세요 : ");
	    	str =scan.nextLine();
	    	System.out.println("> (" + str + ")" + "\n" + "입력받은 메시지 : " + str);
	    	
	    } while(!str.equals("q"));
	    
	    System.out.println("프로그램을 종료합니다.");

	    scan.close();
	}

}
