package edu.kh.oop.basic;

public class Account {
	//[캡슐화]
	// - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
	
	// - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드 작성
	// (private : 현재 객체만 접근 가능한, 사적인, 제한적인)
	
	// - 속성에 직접 접근을 할 수 없으므로
	// 	대신 간접 접근을 할 수 있는 기능을 작성해야함.
	private String name;
	private String accountNumber;
	private long balance;
	private String password;
	
	//매개변수 : 전달 받아온 값을 저장하는 변수
	public void setName(String inputName) {
		//매개변수 String inputName
		// -> String 타입의 데이터를 전달 받아 저장할 변수
		
		name = inputName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public void deposit(long amount) {
		balance += amount;
		System.out.println(name + "의 현재 잔액 : " + balance);
	}
	
	
	/**
	 * 비밀번호와 출금할 금액을 전달 받아와 
	 * 조건에 맞으면 잔액에서 차감 후 현재 잔액을 출력
	 * 
	 * 조건 1) 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
	 * 조건 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	 * 
	 * @param pw : 전달된 비밀번호
	 * @param ammount : 출금할 금액
	 */
	public void withdraw(String pw, long amount) {
		
		// 자바에서 
		// 현재 계좌 비밀번호(password)와 
		// 전달 받은 비밀번호(pw)가 같을 경우 true / 다르면 false
		if(!password.equals(pw)) {
			System.out.println("비밀번호 불일치");
			return;
		}
		
		// 출금할 금액이 잔액보다 큰 경우
		if(amount > balance ) {
			System.out.println("돈이 없어요");
		}
		
		balance -= amount;
		
		System.out.printf("%s 계좌에서 %d원 출금\n", accountNumber, amount);
		System.out.println(name + "의 현재 잔액 : " + balance);
			
	}
}
