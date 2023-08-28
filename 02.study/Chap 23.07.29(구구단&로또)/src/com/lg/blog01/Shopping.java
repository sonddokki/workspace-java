package com.lg.blog01;

// 쇼핑정보를 포함하는 클래스생성

public class Shopping {
	
	// 주문정보를 받아올 변수선언
	private String orderNumber;     // 주문번호 (주문할때마다 새로 생성되는 번호)
	private String userId;       // 주문자아이디 (주문자가 생성한 교유 아이디)
	private String orderDate;    // 주문날짜 (주문을 실시한 날짜)
	private String userName;     // 주문자이름 (주문자의 이름)
	private String goodsNumber;     // 주문상품번호 (주문된 상품의 고유번호)
	private String address;      // 배송주소 (주문자의 주소)
	
	private String userPassword;   // 주문자비밀번호
	
	
	
	public Shopping(String orderNumber, String userId, String orderDate, String userName, String goodsNumber, String address,
			String userPassword) {
//		super();
		this.orderNumber = orderNumber;
		this.userId = userId;
		this.orderDate = orderDate;
		this.userName = userName;
		this.goodsNumber = goodsNumber;
		this.address = address;
		this.userPassword = userPassword;
	}



	public void orderPrint() {
		System.out.println("주문번호 " + orderNumber);
		System.out.println("주문자아이디 " + userId);
		System.out.println("주문날짜 " + orderDate);
		System.out.println("주문자이름 " + userName);
		System.out.println("주문상품번호 " + goodsNumber);
		System.out.println("배송주소 " + address);
	}


	public Shopping() {}
	

	public String getOrderNumber() {
		return orderNumber;
	}



	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getGoodsNumber() {
		return goodsNumber;
	}



	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	

}
