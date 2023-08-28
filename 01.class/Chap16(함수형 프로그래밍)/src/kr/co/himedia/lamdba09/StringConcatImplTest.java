package kr.co.himedia.lamdba09;


public class StringConcatImplTest {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HiMedia";
		
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", "+ s2);
				
			}
		};
		
		concat2.makeString(s1, s2);
		
		// 람다식으로 구현
		
		StringConcat concat3 = (s, v) -> System.out.println(s + ", "+ v);
		concat3.makeString(s1, s2);
		
	}

}
