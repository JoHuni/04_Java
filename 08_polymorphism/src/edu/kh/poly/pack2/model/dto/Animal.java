package edu.kh.poly.pack2.model.dto;

public abstract class Animal {
	private String type;	//종, 류(양서류, 포유류 뭐 등등)
	
	public Animal() {}

	public Animal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + "]";
	}
	
	// 모든 동물이 가지고 있는 기능
	// 모든 동물이 먹고 자긴 하는데
	// 얘네가 어떻게 자고 어떻게 쳐먹는지 하나의 메서드로 정의내리기 빡세다..
	// -> 부모 클래스 Animal에서 eat(), sleep()을 정의할 수 없어
	// -> Animal을 상속 받는 자식 클래스에서
	//	  각자에 맞춰 재정의(Overriding) 하도록 강제화 시킴
	public abstract void eat();
	
	public abstract void sleep();
	
	// abstract 메서드를 정상적으로 작성했는데 오류가 나는 이유 -> 추상 클래스가 아니라서...
}
