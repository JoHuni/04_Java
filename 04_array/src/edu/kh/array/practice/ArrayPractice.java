package edu.kh.array.practice;

import java.util.Arrays;
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
	
	public void practice5() {
		System.out.print("수 입력 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int arrInput = sc.nextInt();
			arr[i] = arrInput;
			count += arr[i];
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("\n총 합 : %d", count);
	}
	
	public void practice6() {
		
		// 문자열.length() : 문자열의 길이를 반환하는 메서드
		
		// 배열.length : 배열길이 반환하는 필드
		System.out.printf("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char[] rNum = input.toCharArray();
		if(input.length() != 14) {
			System.out.println("주민번호는 -포함 14글자여야 합니다.");
			return;
		}
		
		for(int i = 8; i < rNum.length; i++ ) {
			rNum[i] = '*';
		}
		System.out.println(rNum);
	}
	/*
	 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여
	 *  오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여
		내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우
		“다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.*/
	public void practice7() {
		int len = 0;
		
		while(true) {
			System.out.print("정수 : ");
			len = sc.nextInt();
			if(len >= 3 && len % 2 == 1) {
				break;
			}
			System.out.println("다시 입력하세요.");
		}
		int arr[] = new int[len];
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(i <= len/2) {
				count++;
			}
			else {
				count--;
			}
			arr[i] = count;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice8() {
		int[] randoms = new int[10];
		String str = "";
		for(int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10);
			str += randoms[i] + " ";
		}
		System.out.println("발생한 난수 : " + str);
	}
	
	public void practice9() {
		int[] randoms = new int[10];
		String str = "";
		
		int max = 0;
		int min = 0;
		
		for(int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
			
			if(i == 0) {	//첫 반복
				max = randoms[i];
				min = randoms[i];
				continue; //다음 반복으로 이동
			}
			
			if(randoms[i] > max) {
				max = randoms[i];
			}
			
			if(randoms[i] < min) {
				min = randoms[i];
			}
		}
		System.out.println("발생한 난수 : " + str);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice10() {
		int[] randoms = new int[10];
		String str = "";
		
		//출력 for문
		// 중복 검사 방법
		// 현재 인덱스에 대입된 난수와 같은 값이
		// 앞쪽 인덱스에 존재하면
		// 다시 현재 인덱스에 새로운 난수를 생성해서 대입
		// 현재 인덱스에 저장된 값과(지금 발생한 난수와)
		// 앞쪽 인덱스에 저장된 값이(이전에 발생한 난수가)
		// 같을 경우 중복으로 판단!
			
		for(int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10);
			for(int j = 0; j < i; j++) {
				if(randoms[i] == randoms[j]) {
					i--; //바깥쪽 for문의 증가를 막아서 현재 인덱스에 새로운 난수를 대입
					break;
				}
			}
		}
		
		//난수 생성용 for문
		for(int i=0; i<randoms.length; i++) {
			str += randoms[i] + " ";
		}
		System.out.println("발생한 난수 : " + str);
	}
	public void practice11() {
		// 1. 크기가 6인 정수형 배열 생성
		int[] lotto = new int[6];
		// 2. 1 ~ 45 사이 중복 없는 난수로 lotto 배열 요소 초기화
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int x=0 ; x < i ; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}	
		// 3. 오름차순 정렬
		// 주체 > 대상  -> 오름차순
		// 주체 < 대상  -> 내림차순
		
		for(int i = 0; i < lotto.length - 1; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
	}
}
