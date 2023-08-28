package kr.co.himedia.array02;

class BoxA4 {
	String name;
	
	public BoxA4(String name) {
		this.name = name;
	}
}

public class BoxArray {
	
	public static void main(String[] args) {
		
		BoxA4[] arr = new BoxA4[3];
		
		arr[0] = new BoxA4("이순신");
		arr[1] = new BoxA4("탐크루즈");
		arr[2] = new BoxA4("마동석");
		

		System.out.println(arr[0].name);
		System.out.println(arr[1].name);
		System.out.println(arr[2].name);
		
//		for (int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
	}

}
