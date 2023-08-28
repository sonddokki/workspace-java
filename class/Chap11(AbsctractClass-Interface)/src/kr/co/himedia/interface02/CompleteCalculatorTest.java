package kr.co.himedia.interface02;

public class CompleteCalculatorTest {
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalculator();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		((CompleteCalculator)calc).showInfo();
		
		
		calc.describe();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		
		System.out.println("sum = " + sum);
		
		
		
		
	}
}
