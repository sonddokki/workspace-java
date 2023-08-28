package kr.co.himedia.OCP.Card;

public interface Purchasable {
	
	 /**
     * 카드사 정보 전송 및 결과 반환 함수
     *
     * @param price: [int] 금액
     *
     * @return [boolean] 전송 결과
     */
    boolean send(int price);


}
