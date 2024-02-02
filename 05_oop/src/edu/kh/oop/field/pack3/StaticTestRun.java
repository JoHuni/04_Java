package edu.kh.oop.field.pack3;

public class StaticTestRun {
	public static void main(String[] args) {
//		Korean k1 = new Korean();
//		Korean k2 = new Korean();
//		 
//		System.out.println("k1의 nationalCode : " + k1.nationalCode);
//		System.out.println("k2의 nationalCode : " + k2.nationalCode);
//		
//		k1.nationalCode = 1;
//		System.out.println("k1의 nationalCode : " + k1.nationalCode);
//		System.out.println("k2의 nationalCode : " + k2.nationalCode);
//		
//		// 왜 nationalCode에 경고가 뜸?
		
		// static필드는 static 방법으로 접근해야함
		// h1.nationalCode처럼 객체의 필드/메서드명으로 입력하지 말고
		// static영역에 할당된 이름으로 불러주셈(Korean.nationalCode) 이렇게
		
		// 객체의 독립된 필드로 인식될 수 있기 때문에
		// 헷갈리지 않게 정해져있는 이름으로만 불러주셈
		
		System.out.println(Korean.nationalCode);
		System.out.println("우리 조상 : " + Korean.ANCESTOR);
		
		// static fianl 대표 예시
		// Math.PI
		// Integer.MAX_VALUE / MIN_VALUE
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}
}
