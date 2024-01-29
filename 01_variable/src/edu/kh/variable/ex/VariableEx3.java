package edu.kh.variable.ex;

public class VariableEx3 {
	public static void main(String[] args) {
		
		/* ***** 강제형 변환 *****
		 * 1. 값의 범위가 큰 자료형 -> 작은 자료형으로 강제적 변환
		 * -> 데이터 손실을 고려해야 함.
		 * 
		 * 
		 * 2. 의도적으로 자료형을 다른 자료형으로 변환 시킬 때
		 * 
		 * [작성법]
		 * (자료형) 변수 || 값 // 지정된 자료형으로 변경됨
		 * */
		
		// 강제 형변환 확인 1
		// -> 자료형 변환 + 데이터 손실
		int num1 = 290;
		byte result1 = (byte) num1;
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		// 강제 형변환 확인 2
		// - 실수를 정수로 변환해서 소수점을 없애기
		//	(데이터 손실을 활용)
		double num2 = 123.123456789;
		int result2 = (int) num2;
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
		
		/* 난수 + 강제형변환 */
		
		// Math.random();
		// -> 0.0 <= x < 1.0
		int random = (int) (Math.random() * 10 + 1);
		// 난수에서 발생하는 소수 부분을 강제 형변환으로 없앰
		System.out.println("random : " +  random);
		
		// 강제 형변환 3
		// -> 의도적으로 강제 형변환
		System.out.println(123);
		System.out.println((double)123);
		
		// 강제 형변환 4
		// + 값 처리 원칙 (같은 자료형 연산 -> 같은 자료형 결과)
		
		int num3 = 5;
		int num4 = 2;
		/* 1번 */
		System.out.println((double)num3 / (double)num4);
		/* 2번 */
		System.out.println((double)num3 / num4);
		
		/* 위 두 식의 차이점
		 * 결과는 2.5로 동일함
		 * 1번은 두 행에 강제 형변환을 진행하고 값 처리 원칙에 따라서 결과도 double로 변환
		 * 2번은 한 행에만 강제 형변환을 진행하고 다른 행에는 자동 형변환을 진행 -> 결과도 double로 변환
		 * 둘이 성능 차이는 거의 미미하지만 2번 행이 코드가 간결함 -> 2번이 아주아주 미세하게 더 가벼운 코드임
		 * 하지만 가독성과 유지보수를 위해서는 1번 코드를 쓰는게 낫다.
		 * */
		
		// 강제 형변환 5
		// -> 문자(char) <-> 유니코드(int)
		
		System.out.println("A의 번호 : " + (int)'A');
		System.out.println("84번의 문자 : " + (char)84);
		
		//-------------------------------------------------------------------------------------------------------------
		
		// 오버플로
		// : 연산으로 인해 자료형의 값의 범위를 초과하는 경우 발생
		
		byte temp1 = 127;
		
		byte temp2 = (byte)(temp1 + 1);
		System.out.println("temp1 : " + temp1);
		System.out.println("temp2 : " + temp2);
		
	}
}
