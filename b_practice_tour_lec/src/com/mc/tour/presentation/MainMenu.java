package com.mc.tour.presentation;

import java.util.Scanner;

import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;

//메서드 이름 : 동사 + 명사 (명령문)
//				코드의 주어는 클래스(래퍼런스)이기 떄문에 변수또는 메서드 이름에 주어에 해당하는 키워드는 없는게 좋다.
//				

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);	
	private Tour tour;
	private Airline[] airlines;
	private Tourist tourist;
	
	public MainMenu(Tour tour, Airline[] airlines, Tourist tourist) {
		this.tour = tour;
		this.airlines = airlines;
		this.tourist = tourist;
		
	}
	
	public void mainMenu(Airline[] airlines) {

		while (true) {
		
			System.out.println();
			System.out.println("=============================");
			System.out.println("현재 보유 금액 : " + tour.bringMyMoney());
			System.out.println("현재 보유 마일리지 : " + tour.bringMyMile());
			System.out.println("=============================");
			
			System.out.println("번호\t 나라\t 가격\t 마일리지 ");
			for (int i = 0; i < airlines.length; i++) {
				System.out.println(i + "\t " + airlines[i].getCountry()
									+ "\t " + airlines[i].getAirfare()
									+ "\t " + airlines[i].getMileage());
			}
			System.out.println("=============================");
			
			System.out.print("목적지 선택(번호 입력) : ");
			int num = sc.nextInt();
			System.out.println("=============================");
			
			if(num < 0 || num >= airlines.length) {
				System.out.println("알맞은 비행기를 선택하시오.");
				continue;
			}
			
			if(!tour.isAble(num)) {
				System.out.println("현재 보유 금액이 부족합니다.");
				break;
			}
			
			tour.buyTicket(num);
			System.out.println("티케팅 후 잔액은 : " + tour.bringMyMoney());
			System.out.println("티케팅 후 마일리지는 : " + tour.bringMyMile());
			
			
			
			}
		}

}
