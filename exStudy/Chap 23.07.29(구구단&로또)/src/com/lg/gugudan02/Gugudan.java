package com.lg.gugudan02;

public class Gugudan {
	
	private int start;       // 시작단
	private int end;         // 끝단
	private int startLength; // 첫번째로 곱해지는 수   
	private int endLength;   // 곱할 수
	
	public Gugudan(int start, int end, int startLength, int endLength) {
//		super();
		this.start = start;
		this.end = end;
		this.startLength = startLength;
		this.endLength = endLength;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getStartLength() {
		return startLength;
	}

	public void setStartLength(int startLength) {
		this.startLength = startLength;
	}

	public int getEndLength() {
		return endLength;
	}

	public void setEndLength(int endLength) {
		this.endLength = endLength;
	}

	@Override
	public String toString() {
		return "Gugudan [start=" + start + ", end=" + end + ", startLength=" + startLength + ", endLength=" + endLength
				+ "]";
	}
	
	
	
	
	
	

}
