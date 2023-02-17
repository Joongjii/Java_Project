package com.mc.filter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mc.dto.Music;

public class C_ObjectIO {

	//오브젝트 아웃풋스트림 오브젝트 인풋스트림
		public void writeObject() {
			
			//직렬화 가능한 객체만 ObjectIO가 가능 Serialize -- String 직렬화 가능 문서에서 확인가능
			//.dat : 데이터파일을 의미하는 확장자
			
			Music music = new Music("볼빤간 사춘기", "우주를 줄게");
			Music music2 = new Music(" 사춘기", " 줄게");
			Music music3 = new Music("볼빤간 ", "우주를 ");
			Music music4 = new Music("볼빤간 사춘기", "우주를 줄게");
			
			
			
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("music.dat"))) {
				
				oos.writeObject(music);
				oos.writeObject(music2);
				oos.writeObject(music3);
				oos.writeObject(music4);
				System.out.println("music.dat 파일 생성 완료");
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		public void readObject() {
			
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("music.dat"))) {
				
				while(true) {
				Object res = ois.readObject();
				System.out.println(res);
				}
				
			}catch (EOFException e) {
					System.out.println("파일의 모든 객체를 출력");	
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
}
