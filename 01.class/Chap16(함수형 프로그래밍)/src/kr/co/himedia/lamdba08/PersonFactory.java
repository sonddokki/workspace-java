package kr.co.himedia.lamdba08;

@FunctionalInterface
public interface PersonFactory {
	
	Person create(String name, int age);

}
