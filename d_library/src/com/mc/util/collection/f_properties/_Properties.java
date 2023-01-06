package com.mc.util.collection.f_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _Properties {
	
	
	//1.Properties
	//XML파일 입출력을 지원하면서 키와 밸류가 스트링으로 고정된 맵
	
	//XML : Extensible Markup Langauge
		// 확장 가능한 마크업 언어
		// 마크업 랭귀지 : 데이터를 전달하기 위해 디자인된 언어
		// 미리 약속된 태그를 사용해 데이터를 저장하고 식별.
		// XML은 확장가능한 마크업 언어이기 떄문에 언어차원에서 정의된 
		// 태그는 없고 사용자끼리 약속하면 된다
		// 대표적인 예시는 HTML
	
	// tag :
	// ex) <a id= "t"> data </a> 
	// <a> </a> : 여는 태그 , 닫는 태그
	// data : 태그 사이에 있는 정보가 데이터가 된다.
	//	id = "t" : 태그의 속성
	//	<a id= "t"> data </a> : 구체적인 속성과 없을 가진 element
	
	public void studyProperties() {
		
		Properties props = new Properties();
		
		//저장
		props.setProperty("DATE","20221215");
		props.setProperty("DayOfWeek","thurs");
		props.setProperty("Time", "15:24");
		
		System.out.println(props.keySet());
		
		//출력
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String)key));
		}
		
		
		
		//수정
		props.setProperty("Time", "17:50");
		System.out.println("//////////////시간 수정////////////");
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String)key));
		}
		
		
		
		//삭제
		props.remove("Time");
		System.out.println("//////////////시간 삭제////////////");
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String)key));
		}
			
	}
	
	
	public void storeToXML() {
		
Properties props = new Properties();
		
		//저장
		props.setProperty("DATE","20221215");
		props.setProperty("DayOfWeek","thurs");
		props.setProperty("Time", "15:24");
		
		try (FileOutputStream fos = new FileOutputStream("prop.xml")) {
			
			props.storeToXML(fos, "prop.xml");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void loadToXML() {
		
		Properties readProp = new Properties();
		
		try (FileInputStream fis = new FileInputStream("prop.xml")) {
			
			
			readProp.loadFromXML(fis);
			
			for (Object key : readProp.keySet()) {
			System.out.println(readProp.getProperty((String)key));
			
		
		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	





}
