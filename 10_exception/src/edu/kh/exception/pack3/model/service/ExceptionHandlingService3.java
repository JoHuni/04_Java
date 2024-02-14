package edu.kh.exception.pack3.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.kh.exception.pack3.model.exception.MoreThanAHundredException;

public class ExceptionHandlingService3 {
	/* Checked Exception / UnChecked Exception
	 * 
	 * Check : 확인하다
	 * 
	 * - Check Exception : 반드시 확인해야하는 예외
	 *   -> 예외 처리 구문(try ~ catch, throws)을 반드시 써야하는 예외
	 * 
	 * - UnCheck Exception : 굳이 확인 안 해도 되는 예외
	 *	 -> 예외 처리 구문을 써도 되고 안 써도 되는 예외
	 * 
	 */
	
	public void method1() {
		// RuntimeExcpetion 또는 
		// RuntimeExcpetion의 자식 예외 강제 발생
		int result = 1;
		if(result == 1) {
			// UnChecked Exception -> try 안 써도 오류 안 남
			throw new RuntimeException();
		}
		else {			
			// RuntimeException, RuntimeException의 자식 제외한
			// 나머지 예외 강제 발생
			try {
				// Checked Exception -> try 안 쓰면 오류남
				// Unhandled exception type IOException -> IOException 예외처리 안 되어 있음
				// -> 예외처리 하셈
				throw new IOException();
			}
			catch(IOException e) {
				System.out.println("예외처리 필수");
			}
		}
	}
	
	/**
	 *	Checked Exception 확인하기
	 *	- 이미 만들어져 있는 Java 코드 이용 시 
	 *	  예외처리가 꼭 필요한 경우 
	 */
	public void method2() {
		
		// BufferedReader : 효율적으로 읽어오는 객체(빠름)
		// InputStreamReader(System.in) : 키보드 입력을 읽는 객체
		// System.in : 키보드
		
		// -> Scanner 보단 기능이 부족하지만
		// 	  속도가 압도저긍로 빠름
		
		// -> 부족한 기능(int, double 입력 받기)은
		//	  Integer.parseInt(문자열), Double.parseDouble(문자열) 이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		// br.readLine() : 입력된 한 줄 읽어오기(엔터 칠 때까지 읽어옴)
		
		// Unhandled exception type IOException
		// -> IOException 예외 처리 구문이 필수적으로 작성 되어야 함
		try { // br.readLine() 때문에 작성한 예외 처리 구문		
			String input = br.readLine();
			System.out.println("입력 받은 문자열 : " + input);
		}
		catch(IOException e) {
			System.out.println("예잡처");
		}
	}
	
	/**
	 *	CheckedException, UnChecked Exception
	 *	두 종류가 섞인 예제 
	 */
	public void method3() {
		// BufferedReader를 이용해서 입력 받기
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("뭐든 입력 : ");
			input = br.readLine();
			int temp = Integer.parseInt(input); // UnChecked Exception
			System.out.println(temp * 2);
			
			// 입력 받은 내용이 정수면 x2 해서 출력하기
			// 입력 받은 내용이 문자열이면 앞 뒤에 ### 붙이기
		}
		catch(IOException e) {
			System.out.println("IOException 처리");
		}
		catch(NumberFormatException e) {
			// 정수가 아닌 문자열이 입력되어 NumberFormatException이 발생한 경우
			// -> 숫자가 아니고 문자열이라고
			// -> 그래서 문자열 입력되면 예외처리 해줘야됨
			System.out.println("###" + input + "###");
		}
	}
	
	/**
	 *	throws : 메서드 내부에서 발생된 예외를 호출한 곳으로 던짐
	 *
	 *	throw : 예외 객체를 던짐 (예외 강제 발생)
	 */
	public void method4() {
		// inputString() 메서드를 이용해서
		// 문자열을 두 번 입력 받아
		// 하나로 합쳐서 출력하기
		try {
			System.out.print("첫 번째 문자열을 입력 : ");
			String str1 = inputString();
			// inputString() 호출 -> throws IOException
			// -> 호출한 곳에서 처리하셈
			// -> 그래서 지금 여기서 처리해야됨
			// -> 예외 처리 코드(try-catch, throws) 작성
			System.out.print("두 번째 문자열을 입력 : ");
			String str2 = inputString();
			// System.out.println(str1 + str2);
			StringBuilder sb = new StringBuilder();
			sb.append(str1);
			sb.append(str2);
			System.out.println(sb);
		}
		catch(IOException e) {
			System.out.print("처리함");
			e.printStackTrace();
		}
	}
	
	public void method5() {
		try {
			System.out.println("[두 정수를 입력 받아 합계 출력하기]");
			
			System.out.println("첫 번째 정수");
			int num1 = Integer.parseInt(inputString());
			
			System.out.println("두 번째 정수");
			int num2 = Integer.parseInt(inputString());
			
			int result = num1 + num2;
			if(result > 100) {
				throw new MoreThanAHundredException();
			}
			System.out.print("결과 : " + result);
			
		}
		catch(IOException e){
			System.out.println("IOException 처리");
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 값입니다.");
		}
		catch(MoreThanAHundredException e) {
			// e : 예외 객체 참조 변수
			e.printStackTrace();
			// e.printStackTrace()
			// - print : 출력하다
			// - Stack : JVM 메모리 중 Stack 영역(메서드가 쌓여있음)
			// - Trace : 추적하다
			// -> 호출한 메서드 순서에 따라서
			// 발생한 예외를 모두 추적함
		}
	}
	
	/** BufferedReader를 이용해서 문자열 입력 받기
	 * @return 입력 받은 문자열
	 */
	public String inputString() throws IOException{
		// throws IOException : 
		// 현재 메서드에서 발생할 수 있는
		// IOException을 현재 메서드를 호출한 곳으로 던져서
		// 상황에 맞게 별도로 처리하게 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
//		br.close(); // 사용 끝난 br 객체 메모리 반환(제거)
		return str;
	}
}
