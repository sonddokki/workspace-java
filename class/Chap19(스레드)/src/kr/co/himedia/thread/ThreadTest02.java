package kr.co.himedia.thread;

//내부클래스에 상위클래스인 러너블 상속
class MyThread2 implements Runnable {

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

public class ThreadTest02 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start!");
		
		MyThread2 runnable = new MyThread2();   
		Thread thread = new Thread(runnable);     // 이것과
		
		thread.start();
		
		Thread thread2 = new Thread(new MyThread()); // 이것은 동일
		
		thread2.start();
		
		
		Runnable anonymousThreadRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous Thread");
				
			}
		};
		
		
		System.out.println(Thread.currentThread() + " end!");
	}

}
