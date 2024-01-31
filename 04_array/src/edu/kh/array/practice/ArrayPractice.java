package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		int arr[] = new int[9];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if(arr[i] % 2 == 1) {
				sum += arr[i];
			}
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n짝수 번째 인덱스의 합 : %d", sum);
	}
	
	public void practice2() {
		int arr[] = new int[9];
		int sum = 0;
		for(int i = 9; i >= 1; i--) {
			arr[9 - i] = i;
			if(i % 2 == 0) {
				sum += i;
			}
			System.out.printf("%d ", i);
		}
		System.out.printf("\n홀수 번째 인덱스의 합 : %d", sum);
	}
	
	public void practice3(){
		System.out.print("양수 입력 : ");
		int leng = sc.nextInt();
		int arr[] = new int[leng];
		
		for(int i = 1; i < leng + 1; i++) {
			System.out.printf("%d ", i);
		}
	}
	
	public void practice4() {
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수 5번 입력");
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.printf("인덱스 : %d", i);
                return;
            }
        }
        System.out.println("일치하는 값이 존재하지 않습니다.");
	}
}
