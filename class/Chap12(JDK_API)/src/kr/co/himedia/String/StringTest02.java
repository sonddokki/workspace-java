package kr.co.himedia.String;

public class StringTest02 {
	
	public static void main(String[] args) {
		String java = new String("java");
		String kotlin = new String("kotlin");		
		
		System.out.println(System.identityHashCode(java));
		
		
		java = java.concat(kotlin);
		// 두개를 이어버리기~
		
		System.out.println(java);	
		System.out.println(System.identityHashCode(java));
		
		
	}

}
