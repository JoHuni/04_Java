package edu.kh.poly.pack3.model.dto;


//각자 구현한 계산기
public class JHHCalculator implements Calculator, Machine{
	@Override
	public int plus(int a, int b) {
		return a + b;
	}
	
	@Override
	public int minus(int a, int b) {
		return a - b;
	}
	
	@Override
	public double div(int a, int b) {
		if(b == 0) {
			return 0.0;
		}
		return a / b;
	}
	
	@Override
	public int multi(int a, int b) {
		return a * b;
	}
	
	@Override
	public int mod(int a, int b) {
		return a % b;
	}
	
	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r;
	}
	
	@Override
	public int pow(int a, int x) {
		return (int)Math.pow(a, x);
	}
	
	@Override
	public boolean rangeCheck(int num) {
		if(num > MAX_NUM) {
			return false;
		}
		else if(num < MIN_NUM) {
			return false;
		}
		else {
			return true;			
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("켜진 전원 딸깍");
	}
	
	@Override
	public void powerOn() {
		System.out.println("꺼진 전원 딸깍");
	}
	
	@Override
	public String toHexadecimal(int num) {
		return Integer.toHexString(num);
	}
	
	@Override
	public String toBinary(int num) {
		return Integer.toBinaryString(num);
	}
	
	@Override
	public int sum(int... numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
