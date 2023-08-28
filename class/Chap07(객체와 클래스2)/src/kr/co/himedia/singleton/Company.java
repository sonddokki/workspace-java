package kr.co.himedia.singleton;

public class Company {
	
	private Company() {	}
	
	public static Company instance = new Company();
	
	public static Company getInstance() {
		if (instance == null)
			instance = new Company();
		return instance;
	}
	
	

}

