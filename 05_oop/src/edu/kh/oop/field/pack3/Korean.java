package edu.kh.oop.field.pack3;

public class Korean {
	// static이 붙은 필드는 프로그램 실행시
	// static 메모리 영역에 할당된다
	public static int nationalCode = 82;
	public static final String ANCESTOR = "단군"; 
	
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
