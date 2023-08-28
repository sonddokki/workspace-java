package kr.co.himedia.String;

import java.util.Scanner;

/*
 *  문자열을 입력하세요 :
 */



public class StringSplitTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		
		String[] strArray = str.split("\\s");
		// 문자배열을 ("") 으로 줄바꿈 해서 출력
		
//		String str = "Hello,World,Java";
//		String str = "Hello World Java";
		
		
		for (String s : strArray)
			System.out.println(s);
		
		scanner.close();
	}

}
