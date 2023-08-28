package kr.co.himedia.generic02;

public class GenericTest {
	
	public static void main(String[] args) {
		ObjectArr<Movie> oArr = new ObjectArr<>(5);
		oArr.set(0, new Movie("미션임파서블:데드레코딩", "크리스토퍼 맥쿼리", "2023", "미국"));
		oArr.set(1, new Movie("범죄도시", "이상용", "2023", "한국"));
		oArr.set(2, new Movie("엘리멘탈", "피터 손", "2023", "미국"));
		
		for (int i=0; i<oArr.size(); i++) 
			System.out.println(oArr.get(i));
		
		System.out.println(oArr.get(1));
		
		
	}

}
