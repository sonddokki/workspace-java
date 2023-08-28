package kr.co.himedia.String;

public class StringManipulationTest {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		System.out.println(str.charAt(1));
		// charAt은 문자 반환해줌 (몇번째인지)
		System.out.println(str.replaceAll("o", "x"));
		// replaceAll은 지정문자를 변환해줌 (지정문자),(변환문자)
		
		System.out.println(str.length());
		// 문자길이를 int값으로 반환
		
		System.out.println(str.toUpperCase());
		// 문자를 모두 대문자로
		System.out.println(str.toLowerCase());
		// 문자를 모두 소문자로
		
		System.out.println(str.substring(5));
		// 문자를 (번째)부터 보여줌
		System.out.println(str.substring(5, 8));
		// 문자를 (번째)부터 (번째)까지 보여줌
		
		System.out.println(str.indexOf("H"));      // 5, -1
		// 문자가 몇번째에 포함되어있는지 뜨는건가?
	}
	
	
}
