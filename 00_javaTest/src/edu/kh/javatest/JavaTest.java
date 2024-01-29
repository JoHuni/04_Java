package edu.kh.javatest;
// : 한 줄 주석
/* 범위 주석 */
// : 주석 해석 안됨

public class JavaTest {
	
	// 자바 코드 실행 방법
	// 1) 위에 Run 버튼(재생 버튼 처럼 생긴 것) 클릭
	// 2) 실행 단축기 : ctrl + f11
	//class : 자바 코드를 작성하는 영역
	//		- 객체의 내용(속성, 기능)을 정의함
	//		- (JS의 생성자 함수와 비슷한 형태)	
	
	
	// alt + shift + j : 클래스/ 메서드 설명용 주석
	/**main 메서드 : 
	 * <p>
	 *	자바 프로그램을 실행 시키기 위해서 반드시 필요한 구문(기능)
	 * </p>
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println();
		System.out.println("Hello World!");
		
		System.out.println("Java는 코드 끝에 꼭 ;(세미콜론)이 붙어야됨");
		
		System.out.println("println() 구문 자동완성은 sysout -> ctrl + space");
		
		System.out.println("syso도 가능");
		
		System.out.println(100 + 200);
		
		System.out.println(100 + 30 + "입니다");
		
		// 사칙연산 우선순위 적용
		// 먼저 연산하고 싶으면 ()소괄호로 묶어준다
		System.out.println("합계 : " + (2222 + 3333) + "원 입니다");
		
		/*	Java API DOC 확인 : 궁금한 것 클릭 -> JAVA
		 * 
		 * */
	}
}
