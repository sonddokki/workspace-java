package kr.co.himedia.lamdba03;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t + 10;
	}
	
	

}
