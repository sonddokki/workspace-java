package kr.co.himedia.collection;

public class LinkedList<T> {
	
	private String a;
	private String b;
	private String c;
	
	
	@Override
	public String toString() {
		return "LinkedList [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public LinkedList(String a, String b, String c) {
//		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
	
	
	

}
