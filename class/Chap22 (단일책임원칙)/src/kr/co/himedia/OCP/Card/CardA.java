package kr.co.himedia.OCP.Card;

public class CardA implements Purchasable {
	
	 /**
     * 카드사 정보 전송 및 결과 반환 함수
     *
     * @param price: [int] 금액
     *
     * @return [boolean] 전송 결과
     */
	
	@Override
	public boolean send(int price) {
		System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
		return true;
	}

}

class CardB implements Purchasable {

	@Override
	public boolean send(int price) {
		 System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
	        return true;
	}
	
}

class CardC implements Purchasable {

		@Override
		public boolean send(int price) {
			  System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
		        return true;
		}
}
		
		
		
		
		