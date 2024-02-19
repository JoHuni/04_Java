package edu.kh.io.pack4.model.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterService {
	
	/*
	 * 문자 기반 스트림
	 * 
	 * - 2byte 문자(char) 단위로 입/출력 스트림
	 * 
	 * - Reader(입력), Writer(출력) 최상위 인터페이스 존재
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청시 데이터 전달
	 * 
	 */
	
	/**
	 * 문자 기만 파일 입력(파일 읽어오기)
	 *  + 보조 스트림 Buffered 사용		 
	 */
	public void FileInput() {
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null; // 문자 기반 보조 스트림
		
		try {
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/노래가사2.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			
//			br.readLine();
			String line = null; // 한 줄을 읽어와 저장할 변수
			
			while(true) {
				line = br.readLine();
				
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			// 사용 완료된 스트림 객체를 메모리 반환(제거, 닫기)
			
			// 보조 스트림만 close()해도 연결된 기반 스트림도 같이 close();
			try {
				if(br != null) {			
					br.close();
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 문자 기반 파일 출력
	 *  + 보조 스트림 Buffered 이용 
	 */
	public void FileOutput() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("오늘은 2월 16일 금요일입니다.\n");
		sb.append("벌써 금요일이라니! 기부니가 좋군요!\n");
		sb.append("다들 힘내서 공부합시다\n");
		sb.append("나 잘 하고 있니\n");
		sb.append("하이\n");
		sb.append("???");

		
		String content = sb.toString();
		
		// content에 저장된 문자열을
		// /io_test/출력텍스트.txt
		// 파일로 출력하기
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 파일과 출력 스트림 연결(파일이 없으면 생성함)
			fw = new FileWriter("/io_test/출력텍스트2.txt");
			
			// 버퍼를 이용해서 성능 향상)
			bw = new BufferedWriter(fw);
//			
//			bw = new BufferedWriter(new FileWriter("/io_test/출력텍스트3.txt"));
			
			bw.write(content); // content에 저장된 내용을 연결된 파일에 출력
			
			System.out.println("출력 완료");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(bw !=null) {
					// .close() 안에 .flush()가 내장되어 있음
					bw.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
