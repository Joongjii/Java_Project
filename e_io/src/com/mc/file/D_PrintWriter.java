package com.mc.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class D_PrintWriter {


	public void printWriter(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일 내용을 작성하세요 : ");
		String contents = sc.nextLine();
		//try-with-rescource : 자동으로 닫을 수 있는 객체에 한해서 자동으로 close 처리를 해주는 구문
		
		 
			try (PrintWriter pw = new PrintWriter(fileName)) {
				
			// 만약 내용을 수정한다면 덮어쓰여진다 이어쓰고싶다면 append 를 true로 설정
				
				pw.println(contents);
				System.out.println("파일생성이 완료 프로젝트 새로고침 ㄱㄱ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
	
	
}
