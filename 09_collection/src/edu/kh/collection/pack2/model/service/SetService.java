package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {
	/*
	 * Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 * (index 없음! -> get() 메서드가 없음)
	 * 
	 * - 중복 데이터 저장 x(같은 객체가 들어오면 덮어쓰기)
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 
	 * 1. HashSet (대표) : 처리 속도가 빠른 Set
	 * 
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 
	 * 3. TreeSet : 자동 정렬되는 Set
	 *  
	 * */
	
	
	/*
	 * HashSet 사용법
	 * - 사용 조건 1 : 객체에 equals()가 오버라이딩 되어 있어야 함
	 * - 사용 조건 2 : 객체에 hashCode() 오버라이딩 되어 있어야 함
	 * 
	 * -> String, Integer 등 자바에서 제공하는 객체는 모두 오버라이딩 되어 있음
	 * */
	public void method1() {
		Set<String> set = new HashSet<String>();
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배민");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add(null);
		set.add(null); // -> null도 하나밖에 안됨

		
		System.out.println(set); // -> HashSet 순서 유지x 확인
		
		// 2. int size() : Set에 저장된 객체(참조변수)의 수 반환
		System.out.println("set.size() : " + set.size());

		// 3. boolean remove(E e) : 
		// 전달 받은 e를 Set에서 제거 -> 제거 성공하면 True, 없으면 False
		System.out.println(set.remove("배민"));
		System.out.println(set.remove("유플러스"));
		System.out.println(set);
		
		// 4. boolean contains(E e) : 
		// 전달 받은 e가 Set에 있으면 true, 없으면 false
		System.out.println(set.contains("하이"));
		System.out.println(set.contains("쿠팡"));
		
		// 5. void clear() : Set에 저장된 내용 모두 삭제
		set.clear();
		System.out.println(set);
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println("비어있음? : " + set.isEmpty());
	} 
	
	/*
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 1. Iterator : (반복자) 이용
	 * 2. List로 변환
	 * 3. 향상된 for문을 이용
	 * */
	
	public void method2() {
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator(반복자)
		// - 컬렉션 객체에 저장된 요소를 하나씩 순차접근 하는 객체
		
		// Iterator Set.iterator() : 
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext() : 
		// 다음 순차 접근할 요소가 있으면 true, 없으면 false
		System.out.println("[Iterator]");
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			String temp = it.next();
			System.out.println(temp);
		}
		System.out.println("----------------------------");
		System.out.println("[List로 변환]");
		
		// Set에 저장된 객체를 이용해서 List 생성
		List<String> list = new ArrayList<String>(set);
		
		// 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------");
		System.out.println("[향상된 for문]");
		
		for(String snack : set) {
			System.out.println(snack);
		}
	}
	
	/*
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를
	 * Set에 저장(중복 제거 확인)
	 * */
	public void method3() {
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 255, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		// hashCode() : 객체 식별 번호(정수)
		// - 같은 필드 값을 가진 객체는 번호가 같음
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		// A.equals(B) : A와 B가 가지고 있는 필드 값이 같다면 true
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		// Set 중복 제거 확인
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p : personSet) {
			System.out.println(p); // 25세 홍길동이 한 번만 출력되어야 함
		}
		
		/******************************************/
		// Hash라는 단어가 포함된 컬렉션 이용 시
		// hashCode(), equals() 오버라이딩 필수적으로 진행
		/******************************************/

	}
	
	/*
	 * TreeSet : 이진 트리 구조를 이용해 객체를 저장하는 Set
	 * -> 기본 오름차순 정렬
	 * -> 전제조건 : 저장되는 객체는 Comparable 인터페이스 상속 필수
	 * */
	public void method4() {
		// 난수 생성
		// 1) Math.random()
		// 2) Random.nextInt()
		Random random = new Random();
		
		// Integer(객체, Wrapper Class) <==>  int(기본 자료형)
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// lotto에 저장된 값이 6개 미만이면 반복
		while(lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1); // 1 ~ 45 난수 추가
		}
		System.out.println(lotto);
	}
	/**
	 * 로또 번호 생성기
	 * 금액을 입력 받아(천원 단위)
	 * 1000원 당 1회씩 번호를 생성해서 List에 저장한 후
	 * 생성 종료 시 한 번에 출력
	 * <pre>
	 * 금액 입력 : 3000
	 * 1회 : [11, 20, 34, 35, 42, 43]
	 * 2회 : [1, 12, 22, 33, 35, 44]
	 * 3회 : [5, 6, 24, 43, 44, 45]
	 * </pre>
	 */
	public void lottoNumberGenerator() {
//	    Scanner sc = new Scanner(System.in);
//	    Random random = new Random();
	    
//	    while (true) {
//	        System.out.println("금액을 입력 해주세요(1000원당 1회) : ");
//	        int input = sc.nextInt();
//	        if (input % 1000 != 0) {
//	            System.out.println("금액을 천 원 단위로 입력해주세요");
//	        }
//	        else {
//	            int count = input / 1000;
//	            for (int j = 0; j < count; j++) {
//	            	Set<Integer> lotto = new TreeSet<>();
//	                while (lotto.size() < 6) {
//	                    lotto.add(random.nextInt(45) + 1);
//	                }
//	                List<Integer> lottoList = new ArrayList<>(lotto);
//	                System.out.printf("%d회 : ", j + 1);
//	                System.out.println(lottoList);
//	            }
//	            break;
//	        }		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액 입력 : ");
			int amount = sc.nextInt();
			
			Random random = new Random();
			
			
			// 생성된 로또 번호 묶음을 저장할 List
			List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
			
			for(int i=0, end = amount/1000 ; i < end ; i++) {
				Set<Integer> lotto = new TreeSet<Integer>();
				
				while(lotto.size() < 6) {
					lotto.add( random.nextInt(45) + 1 ); // 1 ~ 45 사이 난수 추가
				}
				
				lottoList.add(lotto); // List에 Set 추가(담기)			
			}
			
			
			// 출력용 반복문
			for(int i=0 , size = lottoList.size() ; i< size ; i++) {
				System.out.println((i+1) + "회 : " + lottoList.get(i));
			}
		}
//	}
}
