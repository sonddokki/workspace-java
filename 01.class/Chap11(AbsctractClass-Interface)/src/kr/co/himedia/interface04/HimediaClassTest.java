package kr.co.himedia.interface04;

public class HimediaClassTest {
	public static void main(String[] args) {
		
		HimediaClass hClass = new HimediaClass();
		hClass.x();
		hClass.y();
		hClass.myMethod();
		
		X xClass = hClass;
		xClass.x();
		
		Y yClass = hClass;
		yClass.y();
		
		HimediaInterface hclazz = hClass;
		hclazz.myMethod();
		
		
		
		
	}
	

}
