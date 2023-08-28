package kr.co.himedia.interface03;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHallo();
		customer.order();
		
		System.out.println();
		
		// upcasting
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		
		
	}

}
