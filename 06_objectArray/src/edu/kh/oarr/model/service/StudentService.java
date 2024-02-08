package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

// Service 클래스 : 기능 제공 클래스
// -> 입력, 출력 빼고 나머지
// ex) 로직(if, for)을 이용한 데이터 가공, 저장
public class StudentService {
	private Student[] students = new Student[10];
	// 학생 객체 참조 변수 10개 묶음인 Student[] 생성(할당)
	
	// 그 주소를 students 참조 변수에 대입
	
	//생성자;
	public StudentService(){
		students[0] = new Student("24001", "최미영", 'F');
		students[1] = new Student("24002", "홍길동", 'M');
		students[2] = new Student("24003", "신짱구", 'M');
		
		Random random = new Random();
		//샘플 학생 점수 초기화
		for(int i = 0; i < students.length; i++) {
			// i번째 인덱스에 참조하는 학생이 없으면 반복 종ㄹ
			if (students[i] == null) {
				break;
			}
			students[i].setHtml( random.nextInt(101) );
			students[i].setCss( random.nextInt(101) );
			students[i].setJs( random.nextInt(101) );
			students[i].setJava( random.nextInt(101) );
		}
	}
	
	
	/** 전달 받은 학생 객체(주소)를
	 *  students 객체 배열에서 
	 *  빈칸(null인 칸)에 대입
	 * 
	 * @param newStd
	 * @return 대입 성공 시 true / 실패시 false ( 10명 넘었을 때)
	 */
	
	public boolean addStudent( Student newStd ) {
		
		for(int i=0 ; i<students.length ; i++) {
			if(	students[i] == null ) {
				students[i] = newStd;
				return true;
			}
		}		
		return false; 
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public Student selectIndex(int index) {
		if(index < 0 || index >= students.length) {
			return null;
		}
		return students[index];
		
	}
	
	public Student selectName(String name) {
		//students 객체 배열에서
		// 이름이 name과 일치하는 학생 찾기
		
		// null이 아니면서 이름이 name과 일치하는 학생 찾아 return
		
		/* 향상된 for문 */
		
		// for(변수 : 배열 || 컬렉션)
		
		// - 배열 || 컬렉션의 요소를 처음 부터 끝까지 
		//   순차 접근하는 for문
		for(Student s: students) {
			if(s == null) {
				break;
			}
			if(s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
	
	public String selectScore(int index) {
		int html = students[index].getHtml();
		int css = students[index].getCss();
		int js = students[index].getJs();
		int java = students[index].getJava();
		
		int sum = html + css + js + java;
		double avg = sum / 4.0;
		String result = String.format("HTML(%d) CSS(%d) JS(%d) JAVA(%d)", html, css, js, java);
		result += "\n합계 : " + sum;
		result += "\n평균 : " + avg;
		return result;
	}
	
	public String selectMaxMin() {
		Student maxStudent = null; // 최고점 학생
		Student minStudent = null; // 최저점 학생
		
		double maxAvg = 0.0; // 평균 최고점
		double minAvg = 0.0; // 평균 최저점
		for(Student s : students) {
			if(s == null) {
				break;
			}
			int sum = s.getHtml() + s.getCss() + s.getJs() + s.getJava();
			double avg = sum / 4.0;
			
			if(maxAvg == 0.0) {
				maxStudent = s;
				minStudent = s;
				maxAvg = avg;
				minAvg = avg;
				continue;
			}
			
			if(maxAvg < avg) {
				maxAvg = avg;
				maxStudent = s;
			}
			
			if(minAvg > avg) {
				minAvg = avg;
				minStudent = s;
			}
			
		}
		return String.format("최고점 : %s(%.1f)\n"
				+ "최저점 : %s(%.1f)\n", maxStudent.getName(), maxAvg, minStudent.getName(), minAvg);
	}
}
