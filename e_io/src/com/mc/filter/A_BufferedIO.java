package com.mc.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A_BufferedIO {
	
	//기반스트림에게 내부 버퍼 를 제공해 속도를 향상시켜주는 프로그램
	public void writeFileWithBuffer() {

		//io에는 만들수없다
		String inputPath = "C:\\Workspace1\\Workspace1.zip ";
		String outputPath = "./COPY.zip";
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputPath));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputPath))) {
			
			//
			long start = System.currentTimeMillis();
			
			byte[] intputDats = bis.readAllBytes();
			
			bos.write(intputDats);
			
			long end = System.currentTimeMillis();
			
			System.out.println("걸린 시간 : "+(end-start));
			
			//fos.write(fis.readAllBytes());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		
		
	
	
	
		
	}
	
}
