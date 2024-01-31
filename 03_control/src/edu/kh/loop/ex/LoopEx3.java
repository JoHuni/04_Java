package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx3 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 문자열 한 글자씩 출력하기
	 * */
	public void method1() {
		// 문자열.charAt(인덱스) : 인덱스 번째 문자 하나를 얻어와 반환
		// 문자열.length() : 문자열의 길이
		String str = "Hello world!!!";
//		int length = str.length(); // 미리 문자열의 길이를 카운트해서 저장(속도? 상승)
		//초기식, 증감식 여러개 선언 가능
		for( int i=0, length = str.length(); i<length; i++) {
			System.out.println( str.charAt(i) );
		}
	}
	
	//while(조건식) : 끝이 확실하지 않은 반복문
	/*
	 * -1이 입력될 때까지 정수를 계속 입력 받아
	 * 입력 받은 수의 합계 구하기
	 * */
	public void method2() {
		int sum = 0;
		int input = 0;
		while(input != -1) {
			System.out.print("정수를 입력해주세요.");
			input = sc.nextInt();
			if(input != -1)sum += input;
		}
		System.out.println(sum);
	}
	
	/*
	 * 0이 입력될 때까지 정수를 계속 입력 받고
	 * 0 입력 시 누적된 합계 출력
	 * */
	
	/*
	 * do ~ while문
	 * - 조건식이 뒤에 작성된 while문
	 * - 최소 1회 반복을 보장 (조건을 먼저 따지지 않음)
	 * */
	
	public void method3() {
		int sum = 0;
		int input = 0;
		do{
			System.out.print("정수를 입력해주세요.");
			input = sc.nextInt();
			sum += input;
		}while(input != 0);
		System.out.println(sum);
	}
	
	/*
	 * 0이 입력될 때까지 정수를 계속 입력 받고
	 * 0 입력 시 누적된 합계 출력
	 * */
	public void method4() {
		int sum = 0;
		int input = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
			sum += input;
		}
		System.out.println(sum);
	}
	
}
