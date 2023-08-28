package kr.co.himedia.thread03;

/*
 *   1부터100까지 더할것임
 *   스레드1은 1부터 50까지의 합
 *   스레드2는 51부터 100까지의 합
 */

public class JoinTest extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
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
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		int sum = jt1.total + jt2.total;
		
		System.out.println(jt1.total);
		System.out.println(jt2.total);
		
		System.out.println(sum);

		System.out.println(Thread.currentThread() + " end");
	}
	
	

}
