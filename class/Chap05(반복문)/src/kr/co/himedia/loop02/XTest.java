package kr.co.himedia.loop02;

/*
 *    1 2 2 2 1
 *    2 1 2 1 2
 *    2 2 1 2 2
 *    2 1 2 1 2
 *    1 2 2 2 1
 */

public class XTest {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (j==x || j==y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			x++;
			y--;
			System.out.println("");
		}
		
	}

}

//12 22 1 
//2 12 12 
//22 12 2
//2 12 12
//12 22 1