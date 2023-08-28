package kr.co.himedia.generic05;

public class AverageCalc<T extends Number > {
	
	private T[] nembers;
	
	public AverageCalc(T[] nembers) {
		this.nembers = nembers;
	}
	
	public double calculateAverage() {
		double sum = 0.0;
		for (T number : nembers)
			sum += number.doubleValue();
		return sum/nembers.length;
	}
	

}
