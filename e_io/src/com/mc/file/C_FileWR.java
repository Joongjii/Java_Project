package com.mc.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C_FileWR {

		//문자기반스트림
		//FileWriter
	public void writeFile() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일 내용을 작성하세요 : ");
		String contents = sc.nextLine();
		//try-with-rescource : 자동으로 닫을 수 있는 객체에 한해서 자동으로 close 처리를 해주는 구문
		
		 
			try (FileWriter fw = new FileWriter(fileName, true)) {
				
			// 만약 내용을 수정한다면 덮어쓰여진다 이어쓰고싶다면 append 를 true로 설정
				
				fw.write(contents);
				System.out.println("파일생성이 완료 프로젝트 새로고침 ㄱㄱ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void readFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일명을 작성하세요 ");
		String fileName = sc.nextLine();
		
		try (FileReader fr = new FileReader(fileName)) {
			
			int check = 0;
			StringBuffer sb = new StringBuffer();
			
			//String test = "안녕히 가세요.";
	
	
			while((check = fr.read()) != -1) {
				sb.append((char)check);
			}
			
			System.out.println(sb);
			//String res = new String(sb.toString().getBytes("iso-8859-1"), "utf-8");
			//checkEncoding(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
//	public void copyFile() {
//		String inputPath = "C:\\Workspace1\\e_io\\Workspace1.zip ";
//		String outputPath = "./Workspace1.zip";
//		try (FileInputStream fis = new FileInputStream(inputPath);
//			FileOutputStream fos = new FileOutputStream(outputPath)) {
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				
//		
//		
//	
//	
//	}
	
	
}
