package kr.co.himedia.thread;

// 내부클래스에 상위클래스인 스레드 상속
class MyThread extends Thread {
	
	// 런을 오버라이드
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread() + " start!");
		
		int i;
		for(i=0;i<200;i++) {
			System.out.print(i + "\t");      // 스레드를 \t 띄워서 200번 출력
		}
		
		System.out.println(Thread.currentThread() + " end!");
	}
	
}

// 스레드 테스트 클래스
public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + " start!");
		
		// 내부클래스로 만들어진 객체를 생성
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println(Thread.currentThread() + " end!");
	}

}
