package com.mc.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class D_StreamWR {
	
	//바이트기반 스트림을 문자기반 쓰트림인 라이트랑 리더로 변경
	//InputStreamReader. OutputStreamReader Stream ==> Read Write
	
	
	
	public void toReader() {

		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일명을 작성하세요 ");
		String fileName = sc.nextLine();
		
	//	데코레이트 패턴???
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
			
			
			String line = "";
			StringBuffer sb = new StringBuffer();
			
			while((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb);
		
			//checkEncoding(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public void toWrite() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일 내용을 작성하세요 : ");
		String contents = sc.nextLine();
		
		//역시 데이코레이터 패턴이다 이게 뭔지 정확하게 공부해봐라
		//try-with-rescource : 자동으로 닫을 수 있는 객체에 한해서 자동으로 close 처리를 해주는 구문
			// 만약 내용을 수정한다면 덮어쓰여진다 이어쓰고싶다면 append 를 true로 설정
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)))) {				
			
				bw.write(contents);
				System.out.println("파일생성이 완료 프로젝트 새로고침 ㄱㄱ");
				
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
