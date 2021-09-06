package kr.co.ezen.hw4.view;

import java.util.*;

import kr.co.ezen.hw4.controller.*;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("====회원관리메뉴====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				return;
			default :
				System.out.println("시스템을 종료합니다");
		}
	}
}
