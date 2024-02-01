package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayEx2 {
	public void method1() {
		/*
		 * 얕은 복사 : 주소만 복사
		 * */
		int[] arr1 = {100, 200, 300, 400};
		int[] arr2 = arr1;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		arr1[0] = 1234;
		arr2[1] = 9876;
		
		System.out.println("------------------------------------");
//		[주소를 참조하고 있어서 원본이 바뀜]
		System.out.println("arr1 : " + Arrays.toString(arr1)); // [1234, 9876, 300, 400]
		System.out.println("arr2 : " + Arrays.toString(arr2)); // [1234, 9876, 300, 400]
	}
	
	/*
	 * 깊은 복사 : 값을 똑같이 복사한 배열/ 객체를 생성
	 * */
	public void method2() {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		int[] arr2 = new int[arr1.length];
		int[] arr3 = new int[arr1.length];
		
		// 깊은 복사 방법 1 : for문 이용
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 깊은 복사 방법 2 : System.arraycopy()
		// System.arraycopy(원본 배열명, 원본 복사 시작 인덱스,
		// 			복사 배열명, 복사 배열의 삽입 시작 인덱스, 복사 길이)
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println("arr1 : " + Arrays.toString(arr1));	//원본
		System.out.println("arr2 : " + Arrays.toString(arr2));	//for
		System.out.println("arr3 : " + Arrays.toString(arr3));	//arraycopy
		
		// 모든 배열의 0번 인덱스 값을 변경
		arr1[0] = 999;
		arr2[0] = 888;
		arr3[0] = 777;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));	//원본
		System.out.println("arr2 : " + Arrays.toString(arr2));	//for
		System.out.println("arr3 : " + Arrays.toString(arr3));	//arraycopy
	}
	
	/**
	 * 2차원 배열 : 1차원 배열 참조 변수의 묶음
	 * */
	public void method3() {
		// 2차원 배열 선언
		int[][] arr = new int[2][3];	// 3칸짜리 1차원 배열 2개를 묶은 배열
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		// 2차원 배열 내 모든 요소 순차 접근
		
		// arr.length == 행의 개수(1차원 배열 참조 변수의 개수)
		
		// arr[0].length == 열의 개수
		// (arr[row]이 참조하는 1차원 배열의 길이)
		for(int row = 0; row < arr.length ; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
