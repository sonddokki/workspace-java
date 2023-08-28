package kr.co.himedia.List;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		Member memberd = new Member(2027, "달");
		
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberR);
		memberArrayList.addMember(memberS);
		memberArrayList.addMember(memberd);
		
		
		memberArrayList.showAllMembers();
		
		System.out.println();
		
		memberArrayList.removeMember(memberW.getMemberId());
		memberArrayList.showAllMembers();
		

	}

}
