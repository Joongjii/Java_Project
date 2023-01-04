package com.mc.exception.checked;

import java.net.MalformedURLException;
import java.net.URL;

public class _Exception {
	
	public void studyCheckedException() {
		
		//Checked Exception은 예외처리가 강제된다. 

		try {
			//throw new Exception();
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
//		try {
//			
//			URL url = new URL("https://www.naver.com");
//			
//			System.out.println(url.getHost());
//			System.out.println(url.getPort());
//			System.out.println(url.getProtocol());
//
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
		
		
		
	}

}
