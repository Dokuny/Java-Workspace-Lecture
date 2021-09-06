package monopoly.view;

import java.util.*;

import monopoly.controller.*;

public class View {
	Control mc = new Control();
	
	public void mainView() {
		while(true) {
			System.out.println("===================모두의 마블===================");
			System.out.println("1.시작");
			System.out.println("2.플레이어 설정 (현재인원 수: "+ Control.playerList.size()+"/4)");
			System.out.println("9.종료");
			System.out.println("==============================================");
			System.out.print("입력>");
			int input = Control.sc.nextInt();
			
			switch(input) {
				case 1:
					startView();
					break;
				case 2:
					settingPlayerView();
					break;
				case 9:
					System.out.println("<종료합니다>");
					return;
				default :
					System.out.println("<다시 입력해주세요>");
					break;
			}	
		}	
	}
	public void startView() {
		System.out.println("==========게임 시작==========");
	
		System.out.println("==========게임 종료==========");
	}
	
	
	public void settingPlayerView() {
		while(true) {
			System.out.println("======인원 수 설정======");
			System.out.println("1. 플레이어 등록");
			System.out.println("2. 플레이어 삭제");
			System.out.println("3. 플레이어 목록");
			System.out.println("9. 뒤로가기");
			System.out.println("====================");
			
			int input = Control.sc.nextInt();
			
			switch(input) {
				case 1:
					mc.setPlayer(Control.playerList); 
					break;
				case 2:
					mc.deletePlayer(Control.playerList);
					break;
				case 3:
					mc.playerListInfo(Control.playerList);
					break;
				case 9:
					return;
				default :
					System.out.println("<다시입력해주세요>");
			}
			
			
		
		}
	}
}
