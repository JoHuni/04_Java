package edu.kh.inheritance.model.dto2;

import edu.kh.inheritance.model.dto.Parent;

// final 클래스 -> 상속 불가
// - 제공되는 클래스 그대로 사용해야 되는 경우
// ex) String
public final class Child2 extends Parent{
	private String smartPhone;
	
	public Child2() {
		//super();
		//super() 생성자 미 작성 시 컴파일러가 자동으로 추가해줌
		
		System.out.println("Child2 기본 생성자");
	}
	
	public Child2(String lastName, String address, int money, String car, String smartPhone) {
		//전달 받은 매개변수 5개중 4개는
		//Child2 내부에 생성된 Parent에 초기화 되어야 하는 값
		super(lastName, address, money, car);
		this.smartPhone = smartPhone;
	}

	public String getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	public String informChild2() {
		return inform() + " / " + smartPhone;
	}
	
	// 부모로부터 상속 받은 introduce() 메서드 오버라이딩
	@Override //(@ == Annotation)
	public /*int*/String introduce() {
		// 반환형이 부모랑 다르면 오류 발생
		return "Child2입니다 + " + super.introduce();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nChild2 : " + smartPhone;
	}
}
