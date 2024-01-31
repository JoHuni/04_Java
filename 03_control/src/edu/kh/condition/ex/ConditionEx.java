package edu.kh.condition.ex;

import java.util.Scanner;

/*
 * 조건문 기능용 클래스
 * */

public class ConditionEx {
	// 필드 (== 객체의 속성 == 객체가 가지고 있는 값이나 변수)
	Scanner sc = new Scanner(System.in);
	/*
	 * 나이를 입력 받아
	 * 19세 이상은 성인
	 * 미만은 성인이 아닙니다.
	 * */
	public void method1(){
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
	}
	/*
	 * 나이를 입력 받아
	 * 13세 이하면 어린이
	 * 13세 초과 19세 미만은 청소년
	 * 19세 이상 성인
	 * */
	public void method2() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		String result;
		if(age >= 19) {
			result = "성인";
		}
		else if(age >= 13) {
			result = "청소년";
		}
		else {
			result = "어린이";
		}
		
		System.out.println(result);
	}
	
	
	/*
	 * 달(월)을 입력받아 해당 계절 출력하기
	 * 봄 : 3, 4, 5
	 * 여름 : 6, 7, 8
	 * 가을 : 9, 10, 11
	 * 겨울 : 12, 1, 2
	 * 그 외 : 잘못 입력
	 * */
	public void method3() {
		System.out.print("달(월)입력 : ");
		int month = sc.nextInt();
		String result;
		
		if(month == 12 || month <= 2) {
			result = "겨울입니다";
		}
		else if(month <= 5){
			result = "봄입니다";
		}
		else if(month <= 8) {
			result = "여름입니다";
		}
		else if(month <= 11){
			result = "가을입니다";
		}
		else {
			result = "그런 달은 존재하지 않습니다";
		}
		System.out.println(result);
	}
	
	/*
	 * 중간고사, 기말고사 과제 점수를 입력 받아 
	 * 총점 60점 이상일 경우 PASS, 아니면 FAIL
	 * 
	 * - 중간고사(40%), 기말고사(50%), 과제(10%)
	 * - 각각 100점 만점
	 * 
	 * PASS인 경우
	 * 90점 이상 a, 80점 이상 b, 70점 이상 c, 60점 이상 d
		 * */
		// 변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		//  해결 1) 모든 경우에 변수에 값을 대입 
		//  해결 2) 변수 선언 시 특정한 값으로 초기화 진행
		//		-> 숫자는 0, 
		//			 String은 null / "" 
		//       boolean은 false
		//			 이외의 객체
	public void method4() {
		String result = "";
		
		System.out.print("중간고사 점수 입력 : ");
		int midScore = sc.nextInt();
		if(midScore > 100) {
		    System.out.println("100점까지만 입력 가능합니다.");
		    return;
		}
		
		System.out.print("기말고사 점수 입력 : ");
		int finalSocre = sc.nextInt();
		if(finalSocre > 100) {
		    System.out.println("100점까지만 입력 가능합니다.");
		    return;
		}
		
		System.out.print("과제 점수 입력 : ");
		int hwScore = sc.nextInt();
		if(hwScore > 100) {
		    System.out.println("100점까지만 입력 가능합니다.");
		    return;
		}

		double pResult = (midScore * 0.4) + (finalSocre * 0.5) + (hwScore * 0.1);
		
		
		
		
		if(60 > pResult) {
			result = "FAIL";
		}
		else if(pResult >= 90){
			result = "A";
		}
		else if(pResult >= 80){
			result = "B";
		}
		else if(pResult >= 70){
			result = "C";
		}
		else{
			result = "D";
		}
		
		System.out.println(result);
	}
	
	/*
	 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아 
	 * 40점 미만 과목이 있으면 fail
	 * 평균이 60점 미만인 경우도 fail
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 pass
	 * 
	 * [출력 예시]
	 * 
	 * 1) 40점 미만 과목이 존재할 때
	 * -> FAIL [40점 미만 과목이 존재합니다 ㅋㅋ : 국어, 영어]
	 * 
	 * 2) 평균 60점 미만인 경우
	 * -> FAIL [점수 : 50.4(평균 미달 ㅋㅋ)]
	 * 
	 * 3) PASS인 경우
	 * -> PASS[점수 : 83.4 / 100]
	 * */
	public void method5() {
		
		System.out.print("국어 점수 입력 : ");
		int ko = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int ma = sc.nextInt();
		
		System.out.print("사탐 점수 입력 : ");
		int so = sc.nextInt();
		
		System.out.print("과탐 점수 입력 : ");
		int sci = sc.nextInt();

		double total = 0;
		total = (ko + eng + ma + so + sci) / 5.0;
		
		if (ko < 40 || eng < 40 || ma < 40 || so < 40 || sci < 40) {
		    System.out.print("FAIL [40점 미만 과목이 존재합니다 :");
		    if (ko < 40) {
		        System.out.printf(" 국어");
		    }
		    if (eng < 40) {
		        System.out.printf(" 영어");
		    }
		    if (ma < 40) {
		        System.out.printf(" 수학");
		    }
		    if (so < 40) {
		        System.out.printf(" 사탐");
		    }
		    if (sci < 40) {
		        System.out.printf(" 과탐");
		    }
		    System.out.print("]");
		}
		else if(total < 60) {
			System.out.printf("FAIL [점수 : %.1f(평균 미달)]", total);
		}
		else {
			System.out.printf("PASS [점수 : %.1f / 100]", total);
		}	
	}
}
