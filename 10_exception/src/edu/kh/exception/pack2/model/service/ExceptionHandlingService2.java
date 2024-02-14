package edu.kh.exception.pack2.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingService2 {
	/**
	 * finally : 마지막에 반드시 수행하는 구문
	 * 
	 * - try 구문에서 예외 발생 여부와 관계 없이
	 *   무조건 수행해야되는 구문을 작성하는 곳
	 *   
	 * - try ~ catch ~ finally 또는 try ~ finally
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("1. 정상 수행 / 2. 강제 예외 발생");
		
		int input = sc.nextInt();
		
		try {
			if(input == 1) {
				System.out.println("[정상 수행]");
			}
			else {
				throw new RuntimeException(); // 예외 객체 생성
			}
		}
		catch(Exception e) {
			// 발생하는 모든 자식 예외 잡아서 처리(다형성 업캐스팅)
			System.out.println("캐치가 수행됨");
		}
		finally {
			// try 예외 발생 여부 상관 없이 무조건 실행
			System.out.println("하이");
		}
	}
	
	/**
	 * finally 사용 예시(언제 사용할까?) 
	 * - Java 프로그램 - 외부 프로그램/장치 연결을 끊을 때 주로 사용
	 */
	public void method2() {
		// Scanner : 외부 장치(키보드)와 연결하는 객체
		Scanner scan = new Scanner(System.in);
		
		// Resource leak: 'scan' is never closed
		// -> 프로그램 수행 후 scan이 메모리에 남아있어
		// 	  메모리 누수( 쓸 데 없는 메모리 차지) 발생
		
		//  [해결 방법] Scanner를 close(메모리 반환) 하기
		//  -> 코드에서 예외가 발생 하든 말든 무조건 close 수행 필수
		
		System.out.print("정수 입력 : ");
		try {
			int input = scan.nextInt();
			System.out.println("입력한 정수 * 10" + (input * 10));
		}
		catch(InputMismatchException e){
			System.out.println("잘못 입력");
		}
		finally {
			if(scan != null) {
				scan.close();
			}
		}
	}
}
