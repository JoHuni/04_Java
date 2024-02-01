package edu.kh.oop.basic;

public class AccountRun {
	public static void main(String[] args) {
		//Account 객체 생성
		Account a1 = new Account();
		
		//private이 설정된 값과 안된 값
		//접근 가능 여부 확인
//		a1.name = "조니";
//		a1.accountNumber = "165801-04-369517";
//		a1.balance = 9,223,372,036,854,775,807;
//		a1.password = 1234;
		// name 변수에 값을 세팅하는 간접 접근 기능

		// 간접 접근 기능을 이용해서 값을 세팅
		a1.setName("신형만");
		
		// 간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1 = a1.getName();
		System.out.println(name1);
		
		a1.setAccountNumber("1234-56-7890");
		a1.setPassword("7890");
		
		Account a2 = new Account();
		a2.setName("신짱아");
		a2.setAccountNumber("111-222-333");
		a2.setPassword("7777");
		
		a1.deposit(9223372036854775807L + 1);
		a2.deposit(9223372036854775807L);
		
		a1.withdraw("7890", 100000000);
		System.out.println("-----------------------");
		a2.withdraw("1234", 2000000); // 비밀번호 불일치
		a2.withdraw("7777", 2000000); // 잔액부족
		a2.withdraw("7777", 50000);   // 출금 성공
	}		

}
