package com.mc.filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class B_BufferedWR {

	public void readWithBuffer() {

		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일명을 작성하세요 ");
		String fileName = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			
			String line = "";
			StringBuffer sb = new StringBuffer();
			while((line=br.readLine()) != null) {
				sb.append(line + "/n");
			}
			System.out.println(sb);
			//System.out.println(br.readLine());
			
//			int check = 0;
//			StringBuffer sb = new StringBuffer();
//			
//			//String test = "안녕히 가세요.";
//	
//	
//			while((check = br.read()) != -1) {
//				sb.append((char)check);
//			}
//			
//			System.out.println(sb);
//			//String res = new String(sb.toString().getBytes("iso-8859-1"), "utf-8");
//			//checkEncoding(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	
}
