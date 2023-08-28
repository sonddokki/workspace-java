package kr.co.himedia.exception;

// 예외처리
public class ArrayIndexException {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			// 지정된 배열 수 보다 많은 수를 출력하려함
			for (int i=0;i<=5;i++)
				System.out.println(arr[i]);
			// ArrayIndexOutOfBoundsException 오류발생은 넘기기
		}catch(ArrayIndexOutOfBoundsException e) {
		    // 어떤 오류인지 메세지출력
			System.out.println(e.getMessage());
			// 오류발생 메세지와 같이 출력
			System.out.println(e.toString());
		}
		
		System.out.println("end");
		
	}

}
