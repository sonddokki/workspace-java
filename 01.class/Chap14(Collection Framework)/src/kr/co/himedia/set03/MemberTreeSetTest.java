package kr.co.himedia.set03;

public class MemberTreeSetTest {
	
	public static void main(String[] args) {
		
		MemberTreeSet mTreeSet = new MemberTreeSet();
		
		Member memberL = new Member(2023, "이병헌");
		Member memberW = new Member(2024, "하정우");
		Member memberR = new Member(2025, "신하균");
		Member memberS = new Member(2026, "김태리");
		Member memberS2 = new Member(2026, "김태리");
		
		mTreeSet.addMember(memberL);
		mTreeSet.addMember(memberW);
		mTreeSet.addMember(memberR);
		mTreeSet.addMember(memberS);
		mTreeSet.addMember(memberS2);

		mTreeSet.showAllMembers();
		
		
		Member memberLe = new Member(2024, "김혜수");
		mTreeSet.addMember(memberLe);
		mTreeSet.showAllMembers();
		
		
		
	}

}
