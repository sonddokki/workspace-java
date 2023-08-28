package kr.co.himedia.generic02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("범죄도시", "이상용", "2023", "한국"));
		list.add(new Movie("엘리멘탈", "피터 손", "2023", "미국"));
		
		for (int i=0; i<list.size(); i++) 
			System.out.println(list.get(i));
		
		
	}

}
