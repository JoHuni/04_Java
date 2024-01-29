package edu.kh.variable.ex;
	
public class VariableEx1 {
	public static void main(String[] args) {
		// 변수 : 메모리에 값을 저장하기 위한 공간
		//		이 때, 저장되는 값이 변할 수 있음
		
		// 자료형(data type)
		// 변수 또는 값의 크기와 형식
		
		/*	자바 기본 자료형(Java Primitive Types)
		 *	[논리형]			 
		 * 	boolean (1byte) - true / false
		 * 	
		 * 	[정수형]
		 * 	byte	(1btye)
		 * 	short	(2byte)
		 * 	int		(4byte)	* 정수 기본형*
		 * 	long	(8byte)	- 숫자 뒤에 L(대문자)
		 * 
		 * 	[실수형]
		 * 	float	(4byte)	- 숫자 뒤에 f(소문자)
		 * 	double	(8byte)	- 숫자 뒤에	실수 기본형
		 * 
		 * 	[문자형]
		 * 	char	(2byte)	- 문자 하나, 문자 양 옆에 ''
		 * */
		
		// 변수 선언 : 메모리에 공간 할당
		boolean isTrue;	//메모리에 boolean 저장 공간 할당하고
						// 그 공간을 isTure라고 부르겠음.
		
		double number1;	//메모리에 double 저장 공간 할당하고
						// 그 공간을 number1라고 부르겠음.
		
		// 값 대입 : 변수에 값을 집어 넣는 것
		//			(이미 값이 있는 변수에 대입하면) --> 덮어쓰기
		
		isTrue = true; 
		System.out.println("isTure : " + isTrue);
		
		isTrue = false; 
		System.out.println("isTure : " + isTrue);
		
		// 변수 선언 + 초기화 + 값의 범위 확인;
		int number2 = 2100000000;
		System.out.println(number2);
		
		//	"L" 같은 리터럴 표기법은 컴퓨터가 자료형을 구분하기 위한 기호일 뿐
		//	출력 시 보여지지는 않는다.
		long number3 = 2200000000L;
		// -> int 범위를 초과 -> long으로 바꾸면 됨
		
		System.out.println("number2 + number3 : " + (number2 + number3));
		
		/* 다른 리터럴 표기법 확인 */
		char temp1 = 'A';
		float temp2 = 1.0f;
		double temp3 = 3.14;
		
		/* String
		 * - 기본 자료형이 아닌 객체
		 * - 객체는 변수에 저장을 못함 -> String을 저장하는 변수는 객체 대신 주소를 저장
		 * "참조형"이라고 한다.
		 * (지정된 주소에 객체를 참조)
		 * 
		 * - String의 리터럴 표기법 : 쌍따옴표("")
		 *  */
		
		String str1 = "쌍따옴표가 String 리터럴 표기법";
	}
}
