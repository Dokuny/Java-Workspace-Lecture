package yhchtDice.view;

import yhchtDice.control.*;
import yhchtDice.model.*;

public class ScoreBoardView {
	public void firstView() {
		System.out.println("============야추다이스===========");
		System.out.println("1.게임시작");
		System.out.println("9.종료");
		System.out.println("==============================");
		System.out.print("입력>");
	}
	
	public void setPlayerView() {
		System.out.println("-플레이어 이름 설정-");
		
	}
	
	public void turnView(Player a) {
		System.out.println("-"+a.getName()+"님의 차례-");
	}
	
	public void actView(Player a) {
		System.out.println();
		System.out.println("1. 주사위교체 ("+a.replaceCount+"/2)");
		System.out.println("2. 족보입력");
	}
	
	public void scoreBoardView(Player b,Player c){
		System.out.println();
		System.out.printf("=======================================================\n");
		System.out.printf("|                Yacht Dice Score Board               |\n");
		System.out.printf("=======================================================\n");
		System.out.printf("|  TURN> %2d/12  |        %-15s|        %-14s|\n",Turn.count,b.getName(),c.getName());
		System.out.printf("=======================================================\n");
		System.out.printf("| Ones(1)       |                %2d|                %2d|\n",b.scoreList.get(0),c.scoreList.get(0));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Twos(2)       |                %2d|                %2d|\n",b.scoreList.get(1),c.scoreList.get(1));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Threes(3)     |                %2d|                %2d|\n",b.scoreList.get(2),c.scoreList.get(2));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Fours(4)      |                %2d|                %2d|\n",b.scoreList.get(3),c.scoreList.get(3));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Fives(5)      |                %2d|                %2d|\n",b.scoreList.get(4),c.scoreList.get(4));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| SiXes(6)      |                %2d|                %2d|\n",b.scoreList.get(5),c.scoreList.get(5));
		System.out.printf("=======================================================\n");
		System.out.printf("|Subtotal       |           %4d/63|           %4d/63|\n",b.inputSubtotal(),c.inputSubtotal());
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("|+35 Bonus      |                %2d|                %2d|\n",b.bonus(),c.bonus());
		System.out.printf("=======================================================\n");
		System.out.println("- 보너스는 subtotal이 63을 넘어야 주어집니다.");
		System.out.printf("=======================================================\n");
		System.out.printf("| Choice(7)     |                %2d|                %2d|\n",b.scoreList.get(6),c.scoreList.get(6));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| 4 Kind(8)     |                %2d|                %2d|\n",b.scoreList.get(7),c.scoreList.get(7));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Full House(9) |                %2d|                %2d|\n",b.scoreList.get(8),c.scoreList.get(8));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| S.Straight(10)|                %2d|                %2d|\n",b.scoreList.get(9),c.scoreList.get(9));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| L.Straight(11)|                %2d|                %2d|\n",b.scoreList.get(10),c.scoreList.get(10));
		System.out.printf("|---------------|-------------------------------------|\n");
		System.out.printf("| Yacht(12)     |                %2d|                %2d|\n",b.scoreList.get(11),c.scoreList.get(11));
		System.out.printf("=======================================================\n");
		System.out.printf("| Total         |               %3d|               %3d|\n",b.total(),c.total());
		System.out.printf("=======================================================\n");
	}
}
