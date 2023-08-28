package kr.co.himedia.loop04;


// 1~100 사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오.  (5와 7의 공배수)
public class WhileTest02 {
	public static void main(String[] args) {
		
		int num = 1;
		int count = 1;  
		
		System.out.println("1부터 100까지의 수중에 5와 7의 공배수는 ");
		
		while ( (num++) <100) {
			
			// 5의 배수가 아니면 반환 또는 7의 배수가 아니어도 반환
			if( num % 5 != 0 || num % 7 != 0 ) continue; {
				count++;
				System.out.println(num);
			}			
		}
		System.out.println("이고 " + num + "개이다.");
		
		
	}

}
