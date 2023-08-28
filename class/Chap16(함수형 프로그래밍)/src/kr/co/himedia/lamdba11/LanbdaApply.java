package kr.co.himedia.lamdba11;

public class LanbdaApply {
	
	public static void main(String[] args) {
		
		// 람다 표현식으로 모든 문자를 대문자로 변환하는 StringOperation 구현하기
		StringOperation toUpper = s -> s.toUpperCase();
		String landba = toUpper.apply("fgasgasasd");
		System.out.println(landba);

		// 람다 표현식으로 모든 문자를 소문자로 변환하는 StringOperation 구현하기
		StringOperation toLower = s -> s.toLowerCase();
		String landba2 = toLower.apply("AFSFDADASD");
		System.out.println(landba2);
		
		String input = "Lambda Expression";
		
		// 매배 변수로 전달되는 람다식
		System.out.println(operationString(input, toUpper));
		System.out.println(operationString(input, toLower));
		
		PrintString reStr = retrunString();
		reStr.showString("Hello");
	
	}
	
	// 람다 표현식을 인자로 사용하는 메서드
	public static String operationString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
	public static PrintString retrunString() {   // 반환값으로 사용
		return s -> System.out.println(s + " HiMedia");
	}
	

}
