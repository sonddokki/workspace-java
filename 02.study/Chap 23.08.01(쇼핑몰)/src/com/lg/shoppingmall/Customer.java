package com.lg.shoppingmall;

public class Customer {

	private String cusId;
	
	private String cusNmae;
	
	public Customer(String cusId, String cusNmae) {
//		super();
		this.cusId = cusId;
		this.cusNmae = cusNmae;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusNmae() {
		return cusNmae;
	}

	public void setCusNmae(String cusNmae) {
		this.cusNmae = cusNmae;
	}
	
	void getDiscountRate() {
	}

	@Override
	public String toString() {
		return "회원 아이디" + cusId + "\n" + "회원 이름" + cusNmae;
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
