package kr.co.himedia.interface01;

public interface Calc {
	double PI = 3.14; 		// public static final double PI = 3.14;
	int ERROR = -99999;		// public static final int ERROR = -99999;
	
	int add(int num1, int num2);			// public abstract int add(int num1, int num2);
	int substract(int num1, int num2);		// public abstract int substract(int num1, int num2);
	int times(int num1, int num2);			// public abstract int times(int num1, int num2);
	int divide(int num1, int num2);			// public abstract int divide(int num1, int num2);
}
