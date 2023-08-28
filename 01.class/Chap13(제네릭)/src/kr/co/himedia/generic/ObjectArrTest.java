package kr.co.himedia.generic;

public class ObjectArrTest {
	public static void main(String[] args) {
		ObjectArr<String> array = new ObjectArr<>(5);
		array.set(0, "Hello");
		array.set(1, "cheonho");
		array.set(2, "java");
		array.set(3, "string");
		
		for (int i = 0; i<array.size();i++) 
			System.out.println(array.get(i));
		
		
		
		
		
	}

}
