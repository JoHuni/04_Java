package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.JHHCalculator;
import edu.kh.poly.pack3.model.dto.JHHCalculator2;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.Calculator;


public class CalculatorRun {
	public static void main(String[] args) {
		
		// 인터페이스 장점:
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지보수 시
		// 참조하는 객체만 변경하면 유지보수가 완료된
		Calculator cal = new JHHCalculator2();
		
		//참조 변수의 자료형을 Machine으로 강제 형변환 해야지만
		//powerOn, powerOff() 호출 가능
		Machine ma = (Machine)cal;

		
		System.out.println( cal.plus(1, 2) );
		System.out.println( cal.minus(10, 7) );
		System.out.println( cal.areaOfCircle(10.5) );
		System.out.println( cal.div(10, 0) );
		System.out.println( cal.mod(10, 5) );
		System.out.println( cal.multi(10, 7) );
		System.out.println( cal.pow(2, 32) );
		System.out.println( cal.rangeCheck(100000000) );
		System.out.println( cal.toBinary(2) );
		System.out.println( cal.toHexadecimal(123) );
		System.out.println( cal.sum(1, 2, 3, 4, 5) );
		ma.powerOff();
		ma.powerOn();
	}
}
