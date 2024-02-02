package edu.kh.oop.method;

public class Student {
	// 필드
	public static String schoolName ="KH대학교";
	
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 100;
	
	private String name;
	private String studentNumber;
	private char gender;
	private int java;
	private int html;
	
	//생성자
	public Student() {
		
	}
	

	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
	}
	
	//메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
}
