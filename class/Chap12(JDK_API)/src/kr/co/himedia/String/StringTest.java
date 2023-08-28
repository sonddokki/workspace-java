package kr.co.himedia.String;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		
		System.out.println(str1 == str2);
		// 주소값이 다르니 false
		System.out.println(str1.equals(str2));
		// 논리적으로 동일한 값이니 true
		
		System.out.println("=====================");
		
		String str3 = "himedia";
		String str4 = "himedia";
		
		System.out.println(str3 == str4);
		// 주소값이 같다 true
		System.out.println(str3.equals(str4));
		// 역시 true
		
		System.out.println(str1.equals(str4));
		// 논리적으로 동일한 값이니 true
		

		System.out.println("=====================");
		
		String st5 = "apple";
		String st6 = "banana";
		int result = st5.compareTo(st6);    // 0, 음수, 양수
		
		if (result == 0) 
			System.out.println("str5 == str6");
		else if (result < 0)	
			System.out.println("str5 < str6");
		else 
			System.out.println("str5 < str6");
		
	}

}
