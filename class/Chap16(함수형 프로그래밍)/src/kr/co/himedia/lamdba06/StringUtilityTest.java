package kr.co.himedia.lamdba06;

import kr.co.himedia.lamdba05.Converter;

public class StringUtilityTest {
	
	public static void main(String[] args) {
		                           
		StringUtility stUtility = new StringUtility();
		Converter<String, String> converter = stUtility::reverse;
	    String result = converter.convert("Hello");
	    System.out.println("result : "+result);
			
		
		
	}

}
