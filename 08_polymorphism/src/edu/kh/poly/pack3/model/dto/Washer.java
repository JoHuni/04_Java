package edu.kh.poly.pack3.model.dto;

// 클래스, 추상 클래스 상속 키워드 : extends (확장하다)
// 인터페이스 상속 키워드 : implements

public class Washer implements Machine{
	@Override
	public void powerOn() {
		System.out.println("세탁기의 전원 버튼을 누름");
	}
	@Override
	public void powerOff() {
		System.out.println("세탁기가 켜져 있을 때 다시 전원 버튼을 누름");
	}
}
