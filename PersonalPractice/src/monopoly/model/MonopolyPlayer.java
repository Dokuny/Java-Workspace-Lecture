package monopoly.model;

import java.util.*;

import monopoly.controller.*;
import monopoly.model.*;


public class MonopolyPlayer {
	public int balance=1000000; //초기자본 100만원
	String id;
	int foot=0;
	public static final int salary = 1000000;
	
	private ArrayList<City> myEstate = new ArrayList<City>(); // 소유한 땅 넣기
	
	
	//생성자 파트
	public MonopolyPlayer(String id){
		this.id = id;
		
	}

	public ArrayList<City> getMyEstate() {
		return myEstate;
	}

	public void setMyEstate(ArrayList<City> myEstate) {
		this.myEstate = myEstate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFoot() {
		return foot;
	}

	public void setFoot(int foot) {
		this.foot = foot;
	}

	//메소드 파트
	//플레이어 정보출력
	public void info() {
		System.out.println("잔고>" + balance);
		System.out.println("가지고 있는 땅>");
		for(City a : myEstate) {
			System.out.printf("[%s] ",a.getName());
		}
	}
	
	public void sellInfo() {
		System.out.println("잔고>" + balance);
		System.out.println("가지고 있는 땅>" + myEstate.toString());
		for(City a : myEstate){
			System.out.println("========매각액=========");
			System.out.println("도시이름 : " +a.getName());
			if(a.isLandmark()==true) {
				System.out.println("매각금액 : " + (a.getLandSell()+a.getHotelSell()+a.getLandmarkSell())+"원");
			}else if(a.isHotel()==true) {
				System.out.println("매각금액 : " + (a.getLandSell()+a.getHotelSell())+"원");
			}else if(a.isLand()==true) {
				System.out.println("매각금액 : " + a.getLandSell()+"원");
			}
			System.out.println("=====================");
		}
	}
	
	
	//실행 메소드
	
	
	//이동과 월급

	//매각하기
		public void sellEstate(String name) {
			for(City a : myEstate) {
				if(a.getName() == name) {
					if(a.isLand()) {
						this.balance += a.getLandSell();	
					}
					if(a.isHotel()) {
						this.balance += a.getHotelSell();	
					}
					if(a.isLandmark()) {
						this.balance += a.getLandmarkSell();	
					}
					myEstate.remove(a);
					break;
				}
			}	
			
			if(this.balance<0) {
				System.out.println("파산하셨습니다.");
				bankrupt(ArrayList<MonopolyPlayer> a);
			}
		}
	
	public void bankrupt(ArrayList<MonopolyPlayer> a) {
		a.remove(this);
	}
	
	//땅 차지하기
	

		//건물짓기
		
	
		public void build(City city,MonopolyPlayer player) {
			System.out.println("<건설할 번호를 입력해주세요(땅부터 사야합니다)>");
			switch(Control.sc.nextInt()) {
				case 1:
					if(!city.isLand()) {
						if(player.balance<city.getLandPrice()) {
						System.out.println("<돈이 부족합니다>");
						}else {
							city.setLand(true);
							player.balance-= city.getLandPrice();
							player.myEstate.add(city);
						}
					}
					break;
				case 2:
					if(city.isLand()==false) {
						System.out.println("<땅부터 구매해주세요>");
					}else {
					if(player.balance<city.getBuildingPrice()) {
						System.out.println("<돈이 부족합니다>");
						}else {
							city.setBuilding(true);
							player.balance-= city.getBuildingPrice();
						}
					}
					break;
				case 3:
					if(city.isLand()==false) {
						System.out.println("<땅부터 구매해주세요>");
					}else {
						if(player.balance<city.getHotelPrice()) {
							System.out.println("<돈이 부족합니다>");
						}else {
							city.setHotel(true);
							player.balance-= city.getHotelPrice();
						}
					}
					break;
				case 4:
					if(!city.isLand()&&!city.isHotel()&&!city.isBuilding()) {
						System.out.println("<이전의 모든 건물을 구매해야합니다>");
					}else {
					if(player.balance<city.getLandmarkPrice()) {
						System.out.println("<돈이 부족합니다>");
						}else {
							city.setLandmark(true);
							player.balance-= city.getLandmarkPrice();
						}
					}
					break;
			}
			
		}
		
		
		
		
		
		public void buildHotel(City name) {
			if(name.isHotel()==false) {
				if(this.balance < name.getHotelPrice()) {
					System.out.println("돈이 부족합니다");
				}else {
					this.balance-=name.getHotelPrice();
					name.setHotel(true);
				}
			}else {
				System.out.println("이미 구매된 호텔입니다");
			}
		}
		
		public void buildLandmark(City name) {
			if(name.isLandmark()==false) {
				if(this.balance < name.getLandmarkPrice()) {
					System.out.println("돈이 부족합니다");
				}else {
					this.balance-=name.getLandmarkPrice();
					name.setLandmark(true);
				}
			}else {
				System.out.println("이미 구매된 랜드마크입니다");
			}
		}
		
		
		//통행료내기
		
		public void takeTall(MonopolyPlayer takeTall,MonopolyPlayer payTall,City name) {
			Scanner sc = new Scanner(System.in);
			if(name.isLand() == true) {
				takeTall.balance += name.getLandTall();
				payTall.balance -= name.getLandTall();
				if(payTall.balance<name.getLandTall()) {
					System.out.println("통행료를 지불할 돈이 부족합니다.");
					System.out.println("가지고 있는 땅을 매각해야합니다");
					payTall.info();
					System.out.print("매각할 땅의 인덱스를 입력해주세요 (0부터 시작)");
					String index = sc.next();
					payTall.sellEstate(index);
				}
			}
			if(name.isHotel() == true) {
				takeTall.balance += name.getHotelTall();
				payTall.balance -= name.getHotelTall();
				if(payTall.balance<name.getHotelTall()) {
					System.out.println("통행료를 지불할 돈이 부족합니다.");
					System.out.println("가지고 있는 땅을 매각해야합니다");
					payTall.info();
					System.out.print("매각할 땅의 인덱스를 입력해주세요 (0부터 시작)");
					String index = sc.next();
					payTall.sellEstate(index);
					
				}

			}
			if(name.isLandmark() == true) {
				takeTall.balance += name.getLandmarkTall();
				payTall.balance -= name.getLandmarkTall();
				if(payTall.balance<name.getLandmarkTall()) {
					System.out.println("통행료를 지불할 돈이 부족합니다.");
					System.out.println("가지고 있는 땅을 매각해야합니다");
					payTall.info();
					System.out.print("매각할 땅의 이름을 입력해주세요");
					String cityName = sc.next();
					payTall.sellEstate(cityName);
				}
			}
			sc.close();
		}
		
		
		//인수하기 
		public void takeOver(MonopolyPlayer buyer,MonopolyPlayer seller,City name) {
			if(name.isLandmark() ==true) {
				if(buyer.balance < name.getLandCost()+name.getHotelCost()+name.getLandmarkCost()) {
					System.out.println("돈이 부족합니다.");
				}else {
					buyer.balance -= (name.getLandCost()+name.getHotelCost()+name.getLandmarkCost());
					seller.balance += (name.getLandCost()+name.getHotelCost()+name.getLandmarkCost());
					buyer.myEstate.add(name);
					seller.myEstate.remove(name);
				}
		
			}else if(name.isHotel() == true) {
				if(buyer.balance < name.getLandCost()+name.getHotelCost()) {
					System.out.println("돈이 부족합니다.");
				}else {
					buyer.balance -= (name.getLandCost()+name.getHotelCost());
					seller.balance += (name.getLandCost()+name.getHotelCost());	
				}
			}else if(name.isLand() == true) {
				if(buyer.balance < name.getLandCost()) {
					System.out.println("돈이 부족합니다.");
				}else {
					buyer.balance -= name.getLandCost();
					seller.balance += name.getLandCost();
				}
		}
		}
}
