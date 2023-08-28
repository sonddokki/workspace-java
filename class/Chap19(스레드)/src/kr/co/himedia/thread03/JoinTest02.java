package kr.co.himedia.thread03;

public class JoinTest02 extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest02(int start, int end) {
//		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for (i=start; i<=end; i++) {
			total +=i;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");
		
		JoinTest02 jt1 = new JoinTest02(1, 50);
		JoinTest02 jt2 = new JoinTest02(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();            // 메인 스레드는 멈춰!
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		int sum = jt1.total + jt2.total;
		
		System.out.println(jt1.total);
		System.out.println(jt2.total);
		
		System.out.println(sum);

		System.out.println(Thread.currentThread() + " end");
	}
	
	

}
