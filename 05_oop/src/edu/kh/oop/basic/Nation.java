package edu.kh.oop.basic;

public class Nation {
	String name;
	int age;
	char gender;
	String juminNumber;
	String tel;
	String address;
	
	public void speakKorean() {
		System.out.println("한국말");
	}
	
	public void welfare() {
		System.out.println("우리나라에서 제공하는 복지를 누릴 수 있음");
	}
	
	public void 납세의의무() {
		if(age >= 19) System.out.printf("%s님은 세금 납부 대상자입니다.\n", name);
		else System.out.printf("%s님은 너무 어려요.\n", name);
	}
	
	public void introduce() {
		System.out.printf("이름은 %s이고, %d세 %c성입니다.\n", name, age, gender);
	}
}
