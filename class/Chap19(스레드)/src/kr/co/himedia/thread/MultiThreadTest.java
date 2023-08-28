package kr.co.himedia.thread;

/*
 *  두개 스레드 동시 실행
 *    10미만 수 출력
 *    20미만 짝수 출력
 */

public class MultiThreadTest {
	
	public static void main(String[] args) {
		
		// 람다식으로 구현
		Runnable task1 = () -> {
			// 20미만 짝수 출력
			for (int i=0;i<20;i=i+2) {
				System.out.print(i + " ");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}; // 람다식 종료
		
		Runnable task2 = () -> {
			
			for (int i=0;i<=10;i++) {
				System.out.print("(" + i + ")");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		// 스레드 객체 생성 (만들어둔 러너블 대입)
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		
	}

}
