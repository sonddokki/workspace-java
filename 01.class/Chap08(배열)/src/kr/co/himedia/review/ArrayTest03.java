package kr.co.himedia.review;

import java.util.Arrays;

public class ArrayTest03 {
	
//	static int [] arr = {2023, 7, 17, 2023, 11, 28, 22, -21, 5, 6};
	
	static int[] arr = new int[10];
	
	static {
		for (int i=0; i<8; i++) 
			arr[i] = (int)(Math.random()*10) + 1;
	}
	
	public static void main(String[] args) {
		System.out.println(ArrayTest03.get(arr, 2));
		
		ArrayTest03.changeElement(arr, 0, 2024);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
//		ArrayTest03.appendElement(arr, 8, 2025);
//		System.out.println(Arrays.toString(arr));
//		System.out.println();
//		
//		ArrayTest03.insertElement(arr, 9, 7, 2026);
//		System.out.println(Arrays.toString(arr));
//		System.out.println();
		
		ArrayTest03.removeElement(arr, 8, 2);
		System.out.println(Arrays.toString(arr));

		
		
	}
	
	public static int get(int[] arr, int idx) {
		return arr[idx];
	}
	
	public static void changeElement(int[] arr, int idx, int val) {
		arr[idx] = val;
	}
	
	public static boolean appendElement(int[] arr, int arrCount, int val) {
		if (arrCount == arr.length)
			return false;
		arr[arrCount] = val;
	    return true;
	}
	
	public static boolean insertElement(int[] arr, int arrCount, int idx, int val) {
		if (idx > arrCount || arrCount >= arr.length)
			return false;
		for (int i=arrCount; i > idx; i--) 
			arr[i] = arr[i-1];
		arr[idx] = val;	
		return true;
		
	}
	public static boolean removeElement(int[] arr,int arrCount, int idx) {
		if (idx >= arrCount)
			return false;
		for (int i = idx; i < arrCount; i++) 
			arr[i] = arr[i+1];
		return true;
	}
	
	
	

}
