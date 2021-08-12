package yhchtDice.ready;

import java.util.*;

public class Player {

	String player1;
	String player2;
	int playerPoint1;
	int playerPoint2;
	
	int selection;
	
	int select1;
	int select2;
	int select3;
	int select4;
	int select5;
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		Dice dr = new Dice();
		int reRoll =2;  // 다시던지기 제한횟수
		
		while(true) {
			System.out.println("가져갈 주사위를 선택해주세요. 다시 던지려면 6번을 누르세요.");
			dr.roll();
			
			
			for(int i=1; i<=reRoll;) {
				selection = sc.nextInt(); 
				
				if (selection <1 || selection>5) {
					System.out.println("1번에서 5번 중에 선택해주세요.");
					continue;
				}else if(selection == 6 ){
					i++; ++
					dr.roll();
					continue;
				}else {
					while(true) {
						switch(selection) {
							case 1 :
								select1 = dr.num1;
								
						}
					}
				}	
			
			}
		}
		
		
	}
}
