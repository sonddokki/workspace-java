package kr.co.himedia.map02;

public class MemberHashMapTest {
	public static void main(String[] args) {
		
		MemberHashMap mHashMap = new MemberHashMap();
		

		Member memberL = new Member(2023, "이병헌");
		Member memberW = new Member(2024, "하정우");
		Member memberR = new Member(2025, "신하균");
		Member memberS = new Member(2026, "김태리");
		Member memberS2 = new Member(2026, "김태리");
		
		mHashMap.addMember(memberL);
		mHashMap.addMember(memberW);
		mHashMap.addMember(memberR);
		mHashMap.addMember(memberS);
		mHashMap.addMember(memberS2);
		
		mHashMap.showAllMembers();
		
		mHashMap.removeMember(2025);
		mHashMap.showAllMembers();
		
		
		
		
	}

}
