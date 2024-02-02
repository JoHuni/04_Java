package edu.kh.oop.field.pack2;
import edu.kh.oop.field.pack1.FieldTest1;
public class FieldRun2 extends FieldTest1 {
	public static void main(String[] args) {
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.publicValue);
//		System.out.println(f1.protectedValue);//같은 패키지 + 상속
//		System.out.println(f1.defaultValue);//같은 패키지만 가능
//		System.out.println(f1.privateValue);같은 클래스만 가능
	}
	
	public void method1() {
		// 다른 패키지이지만 상속받았기 때문에
		// protected 접근 제한자를 작성한 필드에 접근이 가능함
		System.out.println(protectedValue);
	}
}
