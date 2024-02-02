package edu.kh.oop.cls.pack1;

//(default) 접근 제한자 : 같은 패키지에서만 접근 가능
public class ClassTestRun {
	public static void main(String[] args) {
		ClassTest1 t1 = new ClassTest1();
		t1.method1();
	}
}
