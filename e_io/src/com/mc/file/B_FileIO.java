package com.mc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class B_FileIO {

	// 1. IO (Input, Output)
	// 입출력 : 외부자원 (DB서버, API서버, OS 등등)으로 부터
	//			자바의 프로그램(메모리)으로 데이터를 읽어오거나, 또는 외부자원으로 데이터를 보내는 것.
	
	
	// 2. Stream
	// 데이터가 오가는 단방향 통로이다. 입력을 위한 InputStream, 출력을 위한 OutputStream이 존재
	// Stream의 사용이 끝나면 반드시 Stream을 닫아줘야 한다.
	// 만약 사용이 끝난 스트림을 닫지 않으면 JVM이 알아서 닫아준다.
	// 그럼에도 반드시 수동으로 닫아주는 것을 원칙으로 한다.
	
	//3. Stream의 구분 
	// 		1. 바이트 스트림 : 데이터가 1바이트 단위로 입출력된다
	//	 	2. 문자열 스트림 : 데이터가 2바이트(char 크기) 단위로 입출력된다
	
	//		-기반스트림: 실제로 외부자원과 데이터를 입출력하는 스트림(소스)
				//FileOutputStream, FileInputStream
	// 		-보조스트림: 기반스트림에 기능을 추가해주는 클래스 (데코레이터)
						//BufferInputStream, BufferOutputStream
	// 					-속도 상향을 위해 버퍼를 사용 --JVM을 거쳐오기 때문에
						//ObjectInputStream, ObjectOutputStream
	//					- 객체를 직렬화하여 입출력할 때 사용
						//InputStreamReader, OutputStreamReader
	//					- 바이트 기반의 스트림을 문자기반의 스트림으로 변환
	
	public void writeFile() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일 내용을 작성하세요 : ");
		String contents = sc.nextLine();
		//try-with-rescource : 자동으로 닫을 수 있는 객체에 한해서 자동으로 close 처리를 해주는 구문
		
		 
			try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
				
			// 만약 내용을 수정한다면 덮어쓰여진다 이어쓰고싶다면 append 를 true로 설정
				
				fos.write(contents.getBytes());
				System.out.println("파일생성이 완료 프로젝트 새로고침 ㄱㄱ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void readFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일명을 작성하세요 ");
		String fileName = sc.nextLine();
		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			
			int check = 0;
			//StringBuffer sb = new StringBuffer();
			
			//String test = "안녕히 가세요.";
	
			System.out.println(new String(fis.readAllBytes())); {
			//while((check = fis.read()) != -1) 
				//sb.append((char)check);
			}
			
			//byte 배열을 받아올 방법이 없다 그런데! readallbyte를 사용하면 읽어올수있다
			//String res = new String(sb.toString().getBytes("iso-8859-1"), "utf-8");
		//	System.out.println(res);
			//checkEncoding(sb.toString());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void copyFile() {
		
		String inputPath = "C:\\Workspace1\\Workspace1.zip ";
		String outputPath = "./COPY.zip";
		
		try (FileInputStream fis = new FileInputStream(inputPath);
			FileOutputStream fos = new FileOutputStream(outputPath)) {
			
			//epoch 기준 현재시간으로 밀리세컨즈로 계산
			//fos.write(fis.readAllBytes());
			
			long start = System.currentTimeMillis();
			
			byte[] intputDats = fis.readAllBytes();
			fos.write(intputDats);
			
			long end = System.currentTimeMillis();
			
			System.out.println("걸린 시간 : "+(end-start));
			
			//fos.write(fis.readAllBytes());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		
		
	
	
	}
	
	//인코딩 관련 코딩
	public void checkEncoding(String encode) {
	      String [] charSet = {"utf-8","euc-kr","ksc5601","iso-8859-1","x-windows-949"};
	      for (int i=0; i<charSet.length; i++) {
	         for (int j=0; j<charSet.length; j++) {
	            try {
	               System.out.println("[" + charSet[i] +"," + charSet[j] +"] = " 
	               + new String(encode.getBytes(charSet[i]), charSet[j]));

	            } catch (UnsupportedEncodingException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }
	
	
	//	웹과 게임의 차이는 
	// 서버 Stream을 계속 열어두는냐 중간중간 닫느냐이다.
}
