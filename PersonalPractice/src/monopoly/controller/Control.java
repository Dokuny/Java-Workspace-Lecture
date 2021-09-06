package monopoly.controller;

import java.util.*;

import monopoly.*;
import monopoly.model.*;

public class Control {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<MonopolyPlayer> playerList = new ArrayList<MonopolyPlayer>();	
	public static ArrayList<City> map = new ArrayList<City>();
	

	//플레이어 설정 메소드
	public void setPlayer(ArrayList<MonopolyPlayer> playerlist) {
		while(true) {
			boolean b =true;
			System.out.println();
			System.out.println("=====플레이어 등록=====");
			if(playerlist.size()==4) {
				System.out.println("<이미 최대인원 수(4명)입니다>");
				break;
			}
			System.out.println("<플레이어 이름을 입력해주세요> ");
			String inputName = sc.next();
			for(MonopolyPlayer a : playerlist) {
				if(a.getId().equals(inputName)) {
					System.out.println("<이미 있는 플레이어 입니다>");
					b=false;
					break;
				}
			}
			if(b) {
			playerlist.add(new MonopolyPlayer(inputName));
			System.out.println("<플레이어를 추가하시겠습니까? (Y/N)>");
			char inputYN = sc.next().charAt(0);
				if(Character.toUpperCase(inputYN) == 'N') {
					break;
				}
			}
		}
	}
	
	public void deletePlayer(ArrayList<MonopolyPlayer> playerlist) {
		while(true) {
			boolean isExist = false;
			System.out.println("======플레이어 삭제=======");
			playerListInfo(playerList);
			
			System.out.print("<입력>");
			String input = sc.next();
					
			for(MonopolyPlayer name : playerList) {
				if(input.equals(name.getId())) {
					isExist = true;
					playerList.remove(name);
					System.out.println("======삭제되었습니다======");
					return;
				}
			}
			if(!isExist) {
				System.out.println("다시 입력해주세요");
			}	
		}
	}
	
	public void playerListInfo(ArrayList<MonopolyPlayer> playerlist) {
		System.out.println("=====플레이어 목록======");
		
		Iterator<MonopolyPlayer> iter = playerlist.iterator();
		
		while(iter.hasNext()) {
			String name = iter.next().getId();
			System.out.println(name);
		}
	}
	
	
	//시작 메소드
	
	public void start() {
		if(playerList.size()==1) {
			System.out.println("<플레이어가 한명 입니다. 시작할 수 없습니다>");
			return;
		}
		while(true) {
			if(playerList.size()==1) {
				Iterator<MonopolyPlayer> iter = playerList.iterator();
				
				while(iter.hasNext()) {
					String name = iter.next().getId();
					System.out.println("승자는 "+name+"님 입니다!");
				}
			}
			
			for(MonopolyPlayer a : playerList) {
				System.out.println(a.getId()+"님 차례입니다");
				//주사위 굴리기
				a.setFoot(rollDice());
				move(a.getFoot(),a);
				System.out.println("============행동=============");
				System.out.println("");	
			
			}
			
		}
	}
	
	//플레이어 메소드
	public int rollDice() { //주사위 더블 나올때 고려해서 고쳐야함
		int sum =0;
		int count =0;
		System.out.println("<주사위를 굴립니다>");
		while(true) {
			int diceNum1 = (int)(Math.random()*6+1);
			int diceNum2 = (int)(Math.random()*6+1);
			sum += (diceNum1 + diceNum2);
			System.out.println("["+diceNum1+"]  ["+diceNum2+"]");
			
			if(diceNum1 ==diceNum2) {
				if(count==3) {
					System.out.println("<더불이 세번나왔습니다.무인도로 갑니다");
					return 16;
				}
				System.out.println("<더블! 주사위를 한번 더 굴립니다>");
				count++;
				continue;
			}
			break;
		}
		return sum;
	}
	
	//도시 메소드
	public void move(int foot,MonopolyPlayer player) {
		System.out.println("<"+foot+"만큼 이동합니다>");
		player.setFoot(player.getFoot()+foot);
		if(player.getFoot()>31) {
			player.setFoot(player.getFoot()-32);
			player.balance += MonopolyPlayer.salary;
			System.out.println("<한바퀴돌았습니다. 월급 "+MonopolyPlayer.salary+"원을 받습니다>");
		}
		

		System.out.print("<("+map.get(player.getFoot()).getName()+")에 도착했습니다> ");
		if(map.get(player.getFoot()).getOwner().equals(null)) {
			System.out.print("<비어있는땅 입니다>\n");
			//플레이어 행동 메소드
			emptyGroundAct(map.get(player.getFoot()));
		}else {
			System.out.print("\""+map.get(player.getFoot()).getOwner()+"\"님의 땅입니다\n");
			
			if(player.getMyEstate().contains(map.get(player.getFoot()))) {
				//내가 땅을 가지고 있다면?
			}else {
				//통행료 지불 메소드들어가야함
				//인수할지말지?
				//인수할거면 인수메소드
			}	
		}
	}
	
	public void emptyGroundAct(City city) {
		while(true) {
			System.out.println("============행동=============");
			System.out.println("1.건설");
			System.out.println("2.턴 넘기기");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("============건설============");
					buildInfo(city);
					//건설비용 나오고 그다음 입력받아서 무슨 건물 지을지 설정
					
					break;
				case 2:
					return;
				default:
					System.out.println("다시 입력해주세요");
					break;
			}
		}
	}
	public void buildInfo(City city) {
		System.out.printf(" <건설상태 >   <O/X>   <건설비용>\n");
		System.out.printf ("1.땅                %s     %d\n",city.isLand()?"O":"X",city.getLandPrice());
		System.out.printf ("2.빌딩              %s     %d\n",city.isBuilding()?"O":"X",city.getBuildingPrice());
		System.out.printf ("3.호텔              %s     %d\n",city.isHotel()?"O":"X",city.getHotelPrice());
		System.out.printf ("4.랜드마크         %s     %d\n",city.isLandmark()?"O":"X",city.getLandmarkPrice());
	}
	
	
	public void mapSetting(ArrayList<City> map) {
		map.clear();
		
		map.add(new City("출발지",0,0)); //0
		map.add(new City("방콕",50000,20000)); //1
		map.add(new City("독도",70000,30000)); //2
		map.add(new City("베이징",60000,25000)); //3
		map.add(new City("울릉도",70000,30000)); //4
		map.add(new City("타이페이",120000,60000)); //5
		map.add(new City("두바이",120000,60000)); //6
		map.add(new City("카이로",135000,70000)); //7
		
		map.add(new City("무인도",0,0)); //8
		
		map.add(new City("발리",70000,30000)); //9  
		map.add(new City("도쿄",180000,115000)); //10
		map.add(new City("시드니",180000,115000)); //11
		map.add(new City("하와이",70000,30000)); //12
		map.add(new City("퀘벡",235000,165000)); //13
		map.add(new City("괌",70000,30000)); //14
		map.add(new City("상파울로",250000,180000)); //15
		
		map.add(new City("무인도",0,0)); //16
		
		map.add(new City("프라하",295000,255000)); //16
		map.add(new City("푸켓",70000,30000)); //17
		map.add(new City("베를린",310000,270000)); //18
		map.add(new City("대마도",70000,30000)); //19
		map.add(new City("모스크바",350000,325000)); //20
		map.add(new City("제네바",365000,350000)); //21
		map.add(new City("로마",365000,350000)); //22
		
		map.add(new City("세계여행",0,0)); //23
		
		map.add(new City("타이티",70000,30000)); //24
		map.add(new City("런던",410000,420000)); //25
		map.add(new City("파리",425000,44000)); //26
		map.add(new City("마다가스카르",70000,30000)); //27
		map.add(new City("뉴욕",480000,510000)); //28 
		map.add(new City("국세청",0,0)); //29
		map.add(new City("서울",500000,550000)); //30	
	}
}
