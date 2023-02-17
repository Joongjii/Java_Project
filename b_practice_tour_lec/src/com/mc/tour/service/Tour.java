package com.mc.tour.service;

public class Tour {
		private Airline[] airlines;
		private Tourist tourist;
		 
	 
//  private Airline al1= new Airline("미국행",3000,300000);
//  private Airline al2= new Airline("중국행",2000,200000);
//  private Airline al3= new Airline("일본행",1500,150000);
//	private Tourist tourist = new Tourist(1000000, 1000);
	

public Tour(Airline[] airlines, Tourist tourist) {
		super();
		this.airlines = airlines;
		this.tourist = tourist;
	}


  
  // 보유 금액으로 티켓 구매 가능 여부 확인
  public boolean isAble(int num){
//	  if(num==1) return tourist.getMyMoney() >=al1.getAirfare();
//	  if(num==2) return tourist.getMyMoney() >=al2.getAirfare();
//	  if(num==3) return tourist.getMyMoney() >=al3.getAirfare();
	  return tourist.getMyMoney() >= airlines[num].getAirfare();
	} 	
  	public void buyTicket(int num) {
  		
  		tourist.setMyMoney(tourist.getMyMoney() - airlines[num].getAirfare());
		tourist.setMyMile(tourist.getMyMile() + airlines[num].getMileage());
  		
  	}
  	
  	
  	
  	
//    // 미국행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
//	public void buyTicket1() {
//		tourist.setMyMoney(tourist.getMyMoney() - al1.getAirfare());
//		tourist.setMyMile(tourist.getMyMile() + al1.getMileage());
//	}
//	// 중국행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
//	public void buyTicket2() {
//		tourist.setMyMoney(tourist.getMyMoney() - al2.getAirfare());
//		tourist.setMyMile(tourist.getMyMile() + al2.getMileage());
//
//	}
//	// 일본행 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
//	public void buyTicket3() {
//		tourist.setMyMoney(tourist.getMyMoney() - al3.getAirfare());
//		tourist.setMyMile(tourist.getMyMile() + al1.getMileage());
//
//	}
  	
  	
	// 여행객의 보유금액을 리턴
	public int bringMyMoney() {
		return tourist.getMyMoney();
	

	}
	// 여행객의 마일리지를 리턴
	public int bringMyMile() {
		return tourist.getMyMile();
	}
	
	
	
	
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
}
