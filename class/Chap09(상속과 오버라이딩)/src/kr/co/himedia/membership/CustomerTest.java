package kr.co.himedia.membership;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerL = new Customer();
		customerL.setCustomerName("이순신");
		customerL.setCustomerId(20230718);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		Customer customerS = new Customer(20230801, "신사임당");
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		
		System.out.println();
		
		Customer customerK = new VIPCustomer (20230802, "탐크루즈");
		customerK.bonusPoint = 5000;
		customerK.bonusRatio = 0.4;
		System.out.println(customerK.showInfo());
		
		System.out.println();
		
		VIPCustomer customerH = new VIPCustomer (20230832, "헤일리 앳웰");
		customerH.bonusPoint = 60000;
		System.out.println(customerH.showInfo());

		System.out.println();
		
		Customer customerLe = new VIPCustomer(20231001, "레베카 페르구손");
		customerLe.bonusPoint = 61000;
		System.out.println(customerLe.showInfo());

		System.out.println();
		
//		VIPCustomer customerKe = new Customer (20231001, "레베카 페르구손");
//		customerKe.bonusPoint = 61000;
//		System.out.println(customerKe.showInfo());
		
		Customer customerSi = new VIPCustomer (20231002, "사이먼 페그");
		customerSi.bonusPoint = 100000;
		int price = customerSi.calcPrice(10000);
		System.out.println(customerSi.showInfo() + "지불금액은 "+price+"원 입니다.");
				
				
		
		
		
	}
}
