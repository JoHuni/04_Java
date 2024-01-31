package edu.kh.array.ex;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 배열(자료구조)
	 * -Java에서의 배열
	 * -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 
	 * - 생성된 배열의 요소는 index를 이용해서 구분
	 * 
	 * - 생성된 배열을 활용하기 위해서는
	 * 배열을 참조하는 "참조형 변수"를 이용한다
	 * 
	 * [참조형 변수]
	 * - 주소를 저장하는 변수
	 * 변수 사용 시 저장된 주소로 찾아가서
	 * 그곳에 위치한 배열, 객체를 참조한다.
	 * 
	 * - 기본 자료형 8개를 제외한 나머지는 모두 참조형
	 * */
	
	public void method1() {
		// 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고
		// 변수의 이름을 num이라고 지정
		
		//배열 선언
		int[] arr;
		// Stack 영역에 int[] 자료형을 참조할 변수를 생성
		// 그 변수의 이름을 arr이라고 함
		
		// 배열 할당
		arr = new int[4];
		// Heap 영역에 int 4개짜리 배열을 할당한 후
		// 생성된 배열의 주소를 arr변수에 대입
		// -> arr을 이용해서 배열을 참조할 수 있음
		
		// 배열 초기화
		
		// 1) 초가화 전 -> 0이 대입되어 있는지 확인
		System.out.println("초기화 전");
		
		// * debug : 프로그램 수행 중 특정 시점이 어떤 값을 지니고 있는지 확인하는 것
		//			 -> 코드 상태, 오류를 분석할 수 있음
		arr[0] = 100;
		arr[1] = 2000;
		arr[2] = 9;
		arr[3] = 7777;
		
		System.out.println("초기화 gn");
		
		/*
		 * [이클립스 디버그 모드 사용 방법]
		 * 
		 * 1) 확인 하고 싶은 코드 다음 줄에 break point 추가
		 * 
		 * 2) debug 모드로 실행(벌레 아이콘 또는 F11)
		 * 
		 * 3) debug 화면으로 switch
		 * 
		 * 4) resume(F8 키)를 눌러가며 순서대로 확인
		 * */
		
	}
	/*
	 * 정수 4개를 입력 받아
	 * 배열에 차례대로 대입 후
	 * 결과를 디버그 모드로 확인
	 * */
	public void method2() {
		// 배열 선언 + 할당
		
		int[] arr = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		// break point
		System.out.println("결과 확인");
		
	}
	
	public void method3() {
		String[] subjects = {"JAVA", "HTML", "CSS", "JavaScript"};
		
		// subjects 변수가 참조하는 배열에 잇는 모든 요소의 값을
		// 역순으로 출력
		
		for(int i=3 ; i >= 0 ; i--) {
			System.out.printf("subjects[%d] : %s \n", i, subjects[i]);
		}
	}
	/**
	 * 길이를 입력 받아 
	 * 입력 받은 길이 만큼의 배열을 생성(할당) 한 후
	 * 모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
	 */
	public void method4() {
		System.out.println("배열 길이 : ");
		int len = sc.nextInt();
		
		// 입력 받은 길이 만큼의 배열을 생성(할당한 후)
		int[] randoms = new int[len];
		for(int i = 0; i < len; i++) {
			randoms[i] = (int) (Math.random() * len);
		}
		System.out.println(randoms);
		System.out.println(Arrays.toString(randoms));
	}
}
