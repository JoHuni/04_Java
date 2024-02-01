package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[] args) {
		Nation n1 = new Nation();
		

		// 점,하위 접근 연산자 (.) 
		// - 객체의 속성/기능을 접근, 호출, 실행 시키는 연산자
		
		n1.name = "홍길동";
		n1.age = 34;
		n1.gender = '남';
		n1.introduce();
		n1.납세의의무();
		
		//Nation 객체 참조 변수 n2
		//Heap 영역에 Nation 클래스를 이용해 생성된 객체의 주소를 대입
		Nation n2 = new Nation();
		System.out.println("객체 생성 확인");
		
		n2.name = "신짱구";
		n2.age  = 5;
		n2.gender = '남';
		n2.introduce();
		n2.납세의의무();
		
		Nation n3 = new Nation();
		
		n3.name = "봉미선";
		n3.age = 29;
		n3.gender = '여';
		n3.introduce();
		n3.납세의의무();
	}	
}
