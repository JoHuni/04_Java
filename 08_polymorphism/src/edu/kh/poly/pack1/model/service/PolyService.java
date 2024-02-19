package edu.kh.poly.pack1.model.service;

import edu.kh.poly.pack1.model.dto.Galaxy;
import edu.kh.poly.pack1.model.dto.IPhone;
import edu.kh.poly.pack1.model.dto.SmartPhone;

public class PolyService {

	/* 다형성 : 다양한 형태를 지니는 성질
	 * 
	 *  1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
	 *   -> 자식 객체, 부모 객체, Object 객체 등으로 변하는 것 처럼 보임
	 *   
	 *  2. 오버 로딩
	 *  -> 같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
	 *  -> 조건 : 메서드명 동일, 매개변수 개수, 타입, 순서 하나라도 다름
	 *  -> 목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법을 구현
	 *  
	 * sum(a,b)    -> 두 수 더하기
	 * sum(a,b,c,) -> 세 수 더하기
	 * sum(배열)   -> 배열 내 요소 모두 더하기
	 * sum(배열, 배열) -> 두 배열 요소 모두 더하기
	 *  
	 *   --> 이름은 sum 하나 인데 상황에 따라 처리하는 코드가
	 *       변하는 것 처럼 보임 (이것도 다형성!)
	 */
	
	/**
	 * 다형성 확인 1
	 * 부모 타입 참조변수 = 자식 객체;
	 * -> 자식 객체 => 부모 객체(Up casting, 업캐스팅)
	 *  + 메모리 구조 꼭 같이 확인!!!
	 */
	public void method1() {
		
		//  SmartPhone = Iphone / Galaxy
		// -> 원래는 컴퓨터 값 처리 원칙 위배 (자동 형변환 대상 X)
		// SmartPhone 부모 타입 참조 변수가 자식 객체인 IPhone객체를 참조하는데
		
		// 1) IPhone 객체 내부에는 SmartPhone객체 존재
		
		// 2) SmartPhone 참조 변수는 SmartPhone 객체만 참조 가능
		// -> 자식인 IPhone 객체가 부모인 SmartPhone 객체로 변한 것처럼 보임
		// -> 이게 바로 다형성 -> 다양한 모습으로 변함 ㅈㄴ 카멜레온
	
		
		SmartPhone s1 = new IPhone();
		SmartPhone s2 = new Galaxy();
		
		// 부모 기능 호출 -> 가능 O / X
		
		s1.setDisplay("레티나 디스플레이");
		s2.setDisplay("AMOLED");
		
		System.out.println("s1.display : " + s1.getDisplay());
		System.out.println("s2.display : " + s2.getDisplay());
		
		// 자식 기능 호출 -> 가능 O / X
//		s1.setIosVersion(20);
	  //s2.setAndroidVersion(20); -> s1, s2는 부모 객체만 참조 가능. 자식 객체를 참조할 수 없음
	}
	/**
	 * 다형성 확인 2
	 * 
	 * (자식 타입) 부모 타입 참조 변수  -> Down Cating, 다운 캐스팅
	 * 
	 * - 업캐스팅된 객체(자식 -> 부모)를 참조하던 부모 타입 참조 변수를
	 *	 자식 타입으로 강제 형변환 하여 다시 자식 객체를 참조하도록 변경(부 -> 자)
	 */
	
	public void method2() {
		// 업 캐스팅 상태
		SmartPhone s1 = new IPhone();
		SmartPhone s2 = new Galaxy();
		
		// 다운 캐스팅 전
//		int v1 = s1.getIosVersion();
//		int v2 = s2.getAndroidVersion();
		
		// 다운 캐스팅 후
		// 참조 변수가 자식타입으로 변해서 자식 객체 참조 가능
		int v1 = ((IPhone)s1).getIosVersion();
		int v2 = ((Galaxy)s2).getAndroidVersion();
		
		// 다운 캐스팅 + 얕은 복사
		IPhone i1 = (IPhone)s1; // s1을 IPhone으로 형변환
		Galaxy g1 = (Galaxy)s2;
		
		i1.setIosVersion(20);
		g1.setAndroidVersion(30);
		
		System.out.println("i1.iosVersion : " + i1.getIosVersion());
		System.out.println("g1.AndroidVersion : " + g1.getAndroidVersion());
	}		
	
	/**
	 * 다형성 확인 -> 정적 바인딩
	 * 
	 * - 프로그램 실행되기 전 컴파일 단계에서
	 *   호출되는 메서드가
	 *   어떤 클래스의 메서드와 연결되는지 결정하는 것
	 * */
	public void method3() {
		SmartPhone s1 = new SmartPhone();
		// SmartPhone의 setAp() 메서드와 연결된다.
		s1.setAp("M1");
		
		Galaxy g1 = new Galaxy();
		g1.setAndroidVersion(20);	
	}
	
	/**
	 * 다형성 확인 4 - 동적 바인딩
	 * 
	 * - 프로그램 실행 중 호출되는 메서드를 참조하는 개체의
	 *   오버라이딩된 메서드로 연결
	 * 
	 *   -> 부모 타입이 참조하는 객체는 실제로는 자식 타입 객체임
	 *   -> 오버라이딩 된 메서드 호출 시
	 *   	(부모, 자식이 서로 같은 이름의 메서드를 가지고 있음)
	 *   	실제 참조 하고 있는 자식 타입 객체의 메서드가 우선권을 가짐
	 * 
	 */
	public void method4() {
		// 업캐스팅
		SmartPhone s1 = new Galaxy("AMOLED", "KT", "스냅드래곤", 17);
		
		// s1.toStriong()작성시 SmartPhone의 toString() 호출된다고 표시됨 = 정적바인딩
		// (참조변수가 부모타입이니까 부모의 메서드 호출
		// 하지만 실행을 해보니 .....
		// SmartPhone.toString()이 아닌
		// Galaxy.toString() 메서드가 호출됨 == 동적 바인딩
		System.out.println(((SmartPhone)s1).toString());
	}
	
	public void method5() {
		// 부모 타입 참조 변수로 이루어진 개체 배열 생성
		SmartPhone[] arr = new SmartPhone[3];
		
		// 배열 각 요소(SmartPhone 참조 변수)
		// SmartPhone(부모), IPhone(자식), Galaxy(자식)
		// 객체를 생성해서 주소를 대입
		
		// 부모 참조 변수 = 부모 객체
		arr[0] = new SmartPhone("LCD", "KT", "엑시노스");
		
		// 부모 참조 변수 = 자식 객체(업 캐스팅)
		arr[1] = new IPhone("Retina display", "SKT", "M2 Chip", 15);
		
		// 부모 참조 변수 = 자식 객체(업 캐스팅)
		arr[2] = new Galaxy("AMOLED", "LG", "스냅드래곤3", 14);
		
		// 객체배열에 다형성을 적용함으로써
		// 배열 하나로 다양한 자료형을 묶음으로 다룰 수 있게됨
		// -> 변수 생성 코드 감소 + 반복문으로 한 번에 제어 가능
		
		for(SmartPhone s : arr) {	//[1], [2] 인덱스에서 업캐스팅 적용
			System.out.println(s.toString());
		}
	}
	
	public void method6() {
		SmartPhone smartPhone = new SmartPhone("LCD", "KT", "엑시노스");
		IPhone iPhone = new IPhone("Retina display", "SKT", "M2 Chip", 15);
		Galaxy galaxy = new Galaxy("AMOLED", "LG", "스냅드래곤3", 14);
		
		printToString(smartPhone); 
		printToString(iPhone); 
		printToString(galaxy); 
	}
	
	public void printToString(SmartPhone s) {
		System.out.println("[전달 받은 객체의 toString() 출력]");
		// 실제 참조하는 객체가 자식 객체라면
		// 자식 객체의 오버라이딩 된 toString() 호출
		System.out.println(s.toString());
	}
	
//	// printToString() 오버로딩
//	public void printToString(IPhone i) {
//		System.out.println("[전달 받은 객체의 toString() 출력]");
//		System.out.println(i.toString());
//	}
//	
//	// printToString() 오버로딩
//	public void printToString(Galaxy g) {
//		System.out.println("[전달 받은 객체의 toString() 출력]");
//		System.out.println(g.toString());
//	}
	/**
	 * 다형성 확인 -> 반환형에 다형성(업캐스팅) 적용
	 */
	public void method7() {
		printToString(createPhone(1));
		printToString(createPhone(2));
		printToString(createPhone(3));
	}
	
	// 매개 변수 값에 따라 phone 객체 생성
	// 1: SmartPhone / 2: IPhone / 3: Galaxy
	public SmartPhone createPhone(int num) {
		
		if(num == 1) {
			return new SmartPhone();
		}
		
		if(num == 2) {
			return new IPhone(); // 오류 X -> 반환형에 업캐스팅 적용
		}
		
		return new Galaxy();  // 오류 X -> 반환형에 업캐스팅 적용
	}
	
	
	/**
	 * instanceof 연산자
	 * 
	 * - 참조변수 instanceof 클래스명
	 * 
	 * -> "참조 변수" 참조하는 객체(instance)가
	 *    지정된 "클래스"로 만들어진 객체가 맞아?
	 */
	public void method8() {
		//instanceof 연산자 연습
		SmartPhone s1 = new SmartPhone();
		
		System.out.print("s1 instanceof SmartPhone : ");
		System.out.println(s1 instanceof SmartPhone);
		
		System.out.print("s1 instanceof String : error\n");
//		System.out.println(s1 instanceof String); -> 상속 관계가 아니라서 instanceof검사 자체를 못함
		

		System.out.print("s1 instanceof Iphone : ");
		System.out.println(s1 instanceof IPhone);
		//-> SmartPhone과 IPhone은 상속 관계가 맞으나 
		// s1이 참조하는 객체가 IPhone 클래스로 만들어진 객체인지
		// 물어보는 것이기 때문에 false가 나온다.
		System.out.println("---------------------------------------------------");
		SmartPhone s2 = new SmartPhone();
		
		System.out.print("s1 instanceof SmartPhone : ");
		System.out.println(s1 instanceof SmartPhone);
		
		System.out.print("s1 instanceof Iphone : ");
		System.out.println(s1 instanceof IPhone);
	}
	
	/**
	 * 객체 배열 + 업캐스팅 + 다운캐스팅 + instanceof 
	 */
	public void method9() {
		SmartPhone[] arr = new SmartPhone[3];
		// -> SmartPhone 참조 변수 3칸
    
		
		// 향상된 for문 + instanceof + downcasting
		for(SmartPhone s:arr) {
			if(s instanceof IPhone) {
				((IPhone)s).setIosVersion(9999);
			}
			else if(s instanceof Galaxy) {
				((Galaxy)s).setAndroidVersion(3000);
			}
			else {
				s.setDisplay("부모 화면");
			}
		}
		for(SmartPhone s : arr) {
			printToString(s);
		}
	}
}
