package kr.co.himedia.loop04;

public class WhileTest04 {
	public static void main(String[] args) {
		int dan = 2;
		int count;
		
		while (dan <= 9) {
			System.out.println("=== "+ dan + "단 ===");
			count = 1;
			while (count <= 9) {
				System.out.println(dan + "X" + count + "=" + (dan*count));
				count++;
			}
			dan++;
		} 
	}
}
