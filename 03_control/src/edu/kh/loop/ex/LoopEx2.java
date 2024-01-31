package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx2 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 다음 모양 출력하기
	 * 1234
	 * 1234
	 * 1234
	 * */
	public void method1() {

		for (int x = 1; x <= 3; x++) { // 3번 반복

			for (int i = 1; i <= 4; i++) { // 1234 출력
				System.out.print(i);
			}

			System.out.println(); // 줄 바꿈
		}
	}
	/*
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321 
	 * */
	public void method2() {
		for(int i = 1; i <= 2; i++) {
			for(int j = 4; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/**
	 * <pre>
	 * 다음 모양 출력 하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * 
	 * </pre>
	 */
	public void method3() {
		for(int x = 0; x < 3; x++) {
			for(int i = 0; i < 3; i++) {
				System.out.printf("(%d,%d)", x, i);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		for(int x = 2; x >= 0; x--) {
			for(int i = 2; i >= 0; i--) {
				System.out.printf("(%d,%d)", x, i);
			}
			System.out.println();
		}
	}
	/*
	 * 2단부터 9단까지 모두 출력
	 * 2 x 1 = 2 2 x 2 = 4
	 * */
	public void method5() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d =%2d ", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	/*
	 * 입력받은 단부터 9단까지 모두 출력
	 * */
	public void method6() {
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		if(dan < 2 || dan > 9) {
			System.out.println("2에서 9단까지만 입력 가능합니다.");
			return;
		}
		
		for(int i = dan; i <= 9; i++) {
			System.out.printf("=====%d단=====\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d =%2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	public void method7() {
		
		int count = 1;
		
		for(int row = 0 ; row < 3 ; row ++) { // 3행 반복
			
			for(int col = 0 ; col < 3 ; col++) { // 3열 반복
				System.out.print(count++ + " ");
			}
			
			System.out.println(); // 줄바꿈
		}
	}
	
	public void method8() {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9() {
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j >= (4 - i) + 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method10(){
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= (4 - i) + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 3; i >=0; i--) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
