package edu.kh.variable.ex;

public class VariableEx2 {
	// 메인 메서드
	public static void main(String[] args) {
		/* 컴퓨터의 값 처리 원칙
		 * - 같은 자료형끼리 연산, 결과도 같은 자료형
		 * 
		 * ** 형변환 **
		 * 
		 * - 다른 자료형끼리 연산하는 경우 자료형을 맞게 변환
		 * 
		 * ******* 자동 형변환 *******
		 * - 연산 시 값의 범위가 작은 자료형을
		 * 	 값의 범위가 큰 자료형으로 변환
		 * */
		
		// 자동 형변환 확인 1
		int num1 = 9;
		long num2 = 10_000_000_000L;
		long result1 = num1 + num2;
		System.out.println("result1 : " + result1);
		
		//자동 형변환 확인 2
		int num3 = 300;
		double num4 = 12.34;
		double result2 = num3 + num4;
		System.out.println("result2 : " + result2);
		
		// 자동 형변환 확인 3
		long num5 = 20L;
		float num6 = 3.14f;
		float result3 = num5 + num6;
		System.out.println(result3);
		
		//double, float는 실수를 근사치로 표현을 한 자료형
		//-> 정확하지 않다.
		
		//-> 은행이나 숫자에 민감한 프로젝트에는 사용하지 않음
		
	}
}
