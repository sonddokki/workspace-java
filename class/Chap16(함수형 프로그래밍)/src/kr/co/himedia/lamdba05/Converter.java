package kr.co.himedia.lamdba05;

@FunctionalInterface
public interface Converter<F, T> {
	
	T convert(F from);

}
