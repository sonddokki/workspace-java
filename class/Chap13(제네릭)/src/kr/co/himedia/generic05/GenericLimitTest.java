package kr.co.himedia.generic05;

public class GenericLimitTest {
	public static void main(String[] args) {
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] dobArr = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArr = {"hi", "media"};
		
		AverageCalc<Integer> integerCalc = new AverageCalc<>(intArr);
		double integerAverage =  integerCalc.calculateAverage();
		System.out.println(integerAverage);
		
		AverageCalc<Double> doubleCalc = new AverageCalc<>(dobArr);
		double doubleAverage =  doubleCalc.calculateAverage();
		System.out.println(doubleAverage);
		
//		AverageCalc<String> strCalc = new AverageCalc<>(strArr);
		
		
	}

}
