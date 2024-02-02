package edu.kh.oop.constructor;

public class MemberRun {
	public static void main(String[] args) {
		// 회원 객체 생성
		// -> 기본 생성자를 이용해서 생성
		Member member1 = new Member();
		Member member2 = new Member();
		
		member1.inform();
		
		// member1이 참조하는 Member객체의 필드값을 세팅
		member1.setMemberId("member01");
		member1.setMemberPw("pass01");
		member1.setMemberName("김회원");
		member1.setMemberAge(1);
		
		// 새로운 Member객체 생성 후 필드 값 세팅
		member2.setMemberId("member02");
		member2.setMemberPw("pass02");
		member2.setMemberName("조회원");
		member2.setMemberAge(1);
		
		System.out.println("[member1]");
		member1.inform();
		
		System.out.println("[member2]");
		member2.inform();
		
		// ----------------------------------------------
		// 매개 변수 생성자를 이용해서 Member 객체 생성
		Member member3 = new Member("member03", "asd", "asd", 1);
		member3.inform();
		
		// ** 프로그래밍에서 변수명, 함수명, 메서드명 중복 금지
			
	}
}
