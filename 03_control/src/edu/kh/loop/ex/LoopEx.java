package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 1부터 10까지 출력하기
	 * */
	public void method1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 첫 번째 입력 받은 수 부터
	 * 두 번째 입력 받은 수 까지
	 * 1씩 증가하며 출력하기
	 * */
	public void method2() {
		System.out.print("첫 번째 수 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int input2 = sc.nextInt();
		
		for(int i = input1; i <= input2; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 10부터 1까지 1씩 감소하면서 출력하기
	 * */
	public void method3() {
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	/*
	 * 두 수를 입력 받아 반복 출력 하는 구문을 작성
	 * (첫 번째 입력을 A, 두 번째 입력을 B)라고 가정
	 * 
	 * 조건 1: B가 A보다 큰 경우 -> A에서 B까지 1씩 증가하며 출력
	 * 조건 2: A가 B보다 큰 경우 -> A에서 B까지 1씩 감소하며 출력
	 * 조건 3: 같은 수 입력 x
	 * */
	public void method4() {
		System.out.print("첫 번째 수 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int input2 = sc.nextInt();
		
		if(input1 == input2) {
			System.out.println("같은 수를 입력할 수 없습니다.");
			return;
		}
		
		if(input1 < input2) {
			for(int i = input1; i <= input2; i++) {
				System.out.println(i);
			}
		}
		else {
			for(int i = input1; i >= input2; i--) {
				System.out.println(i);
			}
		}
	}
	
	/*
	 * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
	 * (첫 번쨰 입력 A, 두 번쨰 입력 B)
	 * 
	 * - 입력 받은 두 수 중 작은 값이 초기식, 큰 값이 조건식에 대입되게 만들기
	 * (같은 경우는 초기식 A, 조건식 B)
	 * */
	public void method5() {
		System.out.print("첫 번째 수 입력 : ");
		int A = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int B = sc.nextInt();
		
		if(A == B) {
			System.out.println("같은 값을 입력할 수 없습니다.");
			return;
		}
		
		if(A <= B) {
			for(int i = A; i <= B; i++) {
				System.out.println(i);
			}
		}
		else {
			for(int i = B; i <= A; i++) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * 두 수를 비교해서 최대, 최소값 구하기
	 */
	public void method5a() {
		System.out.print("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min; // 최소
		int max; // 최대
		
		if(a <= b) { // 먼저 입력한 수가 작거나 같다면
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		for(int i=min ; i<=max ; i++) System.out.println(i);
	}
	
	public void method5b() {
		System.out.print("첫 번째 수 입력 : ");
		int A = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int B = sc.nextInt();
		
		int min = Math.min(A, B);
		int max = Math.max(A, B);
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
	
	public void method5c() {
		System.out.print("첫 번째 수 입력 : ");
		int A = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int B = sc.nextInt();
		
		if(B < A) {
			int temp = A;
			A = B;
			B = temp;
		}
		for(int i = A; i <= B; i++) {
			System.out.println(i);
		}
	}
	
	public void method6() {
		int count = 0;
		for(int i=1; i <= 100; i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void method6a() {
		int count = 0;
		for(int i=7; i <= 100; i+=7) {
			count++;
		}
		System.out.println(count);
	}
	/*
	 * 1부터 100사이의 정수 중
	 * 3의 배수의 개수
	 * 3의 배수를 제외한 수들의 합 출력
	 * */
	public void method7() {
		int count = 0;
		int result = 0;
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				count++;
			}
			else {
				result += i;
			}
		}
		System.out.println(count);
		System.out.println(result);
	}
	
	public void method8() {
	    for(int i = 1; i <= 9; i++) {
	        System.out.printf("5 x %d = %2d\n", i, 5 * i);
	    }
	}
	
	public void method8a() {
		System.out.print("단 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %2d\n", a, i, a * i);
		}
	}
}
