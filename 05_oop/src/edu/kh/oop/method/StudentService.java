package edu.kh.oop.method;

import java.util.Scanner;

public class StudentService {
	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int input = 0; // Scanner로 입력 받은 메뉴 번호를 저장할 변수
		
		// 학생 객체를 참조할 참조형 변수 두 개 선언
		// (null : 참조하는 객체가 없음을 의미)
		Student std1 = new Student("동길홍", "1112222333", '남');
		Student std2 = null;
		
		do {
			System.out.println("""
===== 학생 관리 프로그램 =====
1. 학생 등록
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
0. 프로그램 종료
					""");
			System.out.print("메뉴 선택 >>>");
			input = sc.nextInt();
			
			switch(input) {
				case 1:
					System.out.print("학생을 등록할 변수를 선택(1 : std1 / 2 : std2) : ");
					int select = sc.nextInt();
					if(select == 1) {
						std1 = createStudent();
					} 
					else {
						std2 = createStudent();
					}
					break;
				case 2:
					System.out.print("정보를 조회할 학생 선택(1: std1 / 2: std2) : ");
					String text = null;
					if(sc.nextInt() == 1) {
						text = studentInform(std1);
					}
					else {
						text = studentInform(std2);
					}
					System.out.println(text);
					break;
				case 3:
					System.out.print("이름을 변경할 학생 선택 (1: std1 / 2: std2) : ");
					if(sc.nextInt() == 1) {
						updateStudentName(std1);
					}
					else {
						updateStudentName(std2);
					}
					break;
				case 4:
					System.out.print("Java역량을 수정할 학생 선택(1: std1 / 2: std2) : ");
					if(sc.nextInt() == 1) {
						updateJava(std1);
					}
					else {
						updateJava(std2);
					}
					break;
				case 5:
					System.out.print("HTML역량을 수정할 학생 선택(1: std1 / 2: std2) : ");
					if(sc.nextInt() == 1) {
						updateHtml(std1);
					}
					else {
						updateHtml(std2);
					}
					break;
				case 6: 
					String result = compareJava(std1, std2);
					System.out.println(result);
					break;
				case 7:
					String result2 = compareHTML(std1, std2);
					System.out.println(result2);
					break;
				case 0: System.out.println("===== 프로그램 종료 =====");
					break;
				default : 
			}
		}while(input != 0);
	}
	
	/** 학생 정보를 입력받아 생성된 Student 객체를 반환
	 * @return 생성된 Student 객체 주소
	 */
	private Student createStudent() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		// sc.next()로 입력 받은 문자열 중
		// 0번 인덱스 번쨰 문자 하나를 반환 받아 gender 변수에 저장
		return new Student(name, studentNumber, gender);
	}
	
	/*
	 * 매개변수로 전달 받은 학생의 정보를 문자열로 만들어서 반환
	 * */
	private String studentInform(Student s) {
//		String.format("패턴", 패턴 모양의 문자열을 반환하는 String 메서드)
		return String.format("%s / %s/ %c / %s / %d / %d",
				Student.schoolName, s.getStudentNumber(),
				s.getGender(), s.getName(), s.getJava(), s.getHtml());
	}
	
	/** 매개 변수로 전달 받은 학생 객체의 이름 수정
	 * @param s
	 */
	private void updateStudentName(Student s) {
		System.out.print("수정할 학생 이름 : ");
		String newName = sc.next();
		
		// 학생 이름이 수정되었습니다.
		// 홍길동 -> 동동동
		String beforeName = s.getName();
		s.setName(newName);
		System.out.println("학생 이름이 수정되었습니다.");
		System.out.printf("%s -> %s \n", beforeName, newName);
	}
	
	/** Java 역량이 얼마나 증가 또는 감소했는지 정수로 입력 받고
	 * 학생의 Java 역량을 수정
	 * 단, 수정된 Java 역량은 최대값, 최소값 범위를 넘어가지 못하게함
	 * 
	 * ex) Java 역량이 120인 경우  100(최대값)
	 *     Java 역량이 -30인 경우    0(최소값)
	 * 
	 * @param  s : std1 또는 std2 (학생 객체 주소)
	 */
	
	private void updateJava(Student s) {
	    System.out.print("자바 역량 : ");
	    int beforeJava = s.getJava();
	    int newJava = sc.nextInt();

	    if (newJava > Student.MAX_VALUE) {
	        newJava = Student.MAX_VALUE;
	    } else if (newJava < Student.MIN_VALUE) {
	        newJava = Student.MIN_VALUE;
	    }

	    int difference = newJava - beforeJava;
	    s.setJava(newJava);

	    System.out.println("자바 역량 수정 완료");
	    System.out.printf("%d -> %d(%d)\n", beforeJava, newJava, difference);
	}
	
	
	
	
	private void updateHtml(Student s) {
		System.out.print("HTML 역량 : ");
	    int beforeHTML = s.getHtml();
	    int newHTML = sc.nextInt();
	    
	    if(newHTML > Student.MAX_VALUE) {
	    	newHTML = Student.MAX_VALUE;
	    }
	    else if(newHTML < Student.MIN_VALUE){
	    	newHTML = Student.MIN_VALUE;
	    }
	    
	    int diff = newHTML - beforeHTML;
	    s.setHtml(newHTML);
	    
	    System.out.println("HTML 역량 수정 완료");
	    System.out.printf("%d -> %d(%d)\n", beforeHTML, newHTML, diff);
	}
	
	private String compareJava(Student s1, Student s2) {
		
		// 전달 받은 s1이 참조하는 Student 객체가 없을 경우
		if(s1 == null) {
			return "첫 번째 학생이 등록되지 않았습니다.";
		}
		
		if(s2 == null) {
			return "두 번째 학생이 등록되지 않았습니다.";
		}
		
		
		String result = String.format("%s : %d / %s : %d \n", 
				s1.getName(), s1.getJava(), 
				s2.getName(), s2.getJava());
		
		// 두 학생의 점수 비교
		if(s1.getJava() > s2.getJava()) {
			return "std1의 점수가 더 높습니다.";
		}
		
		if(s1.getJava() < s2.getJava()) {
			return "std2의 점수가 더 높습니다.";
		}
		return result + "점수가 같습니다.";
	}
	
	private String compareHTML(Student s1, Student s2) {
		
		// 전달 받은 s1이 참조하는 Student 객체가 없을 경우
		if(s1 == null) {
			return "첫 번째 학생이 등록되지 않았습니다.";
		}
		
		if(s2 == null) {
			return "두 번째 학생이 등록되지 않았습니다.";
		}
		
		
		String result = String.format("%s : %d / %s : %d \n", 
				s1.getName(), s1.getHtml(), 
				s2.getName(), s2.getHtml());
		
		// 두 학생의 점수 비교
		if(s1.getHtml() > s2.getHtml()) {
			return result + s1.getName() + "의 점수가 더 높습니다.";
		} 
		
		if(s1.getHtml() < s2.getHtml()) {
			return result + s2.getName() + "의 점수가 더 높습니다.";
		} 
		
		return result + "점수가 같습니다.";
	}
}
