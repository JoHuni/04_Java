package edu.kh.exception.pack3.model.exception;

/**
 * 100 초과 예외
 * - RuntimeException 상속
 * -> UnChecked Exception
 * -> 예외 처리 구문 작성 해도 그만, 안 해도 그만
 * 
 * - 사용자 정의 예외는 대부분 RuntimeException 상속 받음
 */
public class MoreThanAHundredException extends RuntimeException{
	public MoreThanAHundredException() {
		super("100을 초과하였습니다.");
	}
	
	public MoreThanAHundredException(String message) {
		super(message);
	}
}
