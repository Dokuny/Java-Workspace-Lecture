package yhchtDice.control;

import java.util.*;

import yhchtDice.model.*;
import yhchtDice.view.*;

public class Controller {
	public static Scanner sc = new Scanner(System.in);
	ScoreBoardView view = new ScoreBoardView();
	Player a,b;
	
	
	public void setPlayer() {
		System.out.print("플레이어를 입력>");
		a = new Player(sc.next());
		System.out.print("플레이어를 입력>");
		b = new Player(sc.next());
		sc.nextLine();
	}
	
	
	
	public void start() {
		Turn.count=0;
		while(true) {
			view.firstView();
			switch(sc.nextInt()) {
				case 1:
					view.setPlayerView();
					setPlayer();
					while(Turn.count<13) {
						view.scoreBoardView(a,b);
						view.turnView(a);
						a.rollDice();
						while(a.replaceCount<3) {
							view.actView(a);
							a.act();
						}
						view.scoreBoardView(a,b);
						view.turnView(b);
						b.rollDice();
						while(b.replaceCount<3) {
							view.actView(b);
							b.act();
						}
						
						Turn.count++;
					}
					view.scoreBoardView(a, b);
					if(a.total()>b.total()) {
						System.out.println("========="+a.getName()+"님의 승리입니다!=========");
					}else if(a.total()<b.total()){
						System.out.println("========="+b.getName()+"님의 승리입니다!=========");
					}else {
						System.out.println("=========무승부입니다=========");
					}
					break;
				
				case 9:
					System.out.println("-게임을 종료합니다-");
					return;
				default:
					break;
			}
		}
	}
}
