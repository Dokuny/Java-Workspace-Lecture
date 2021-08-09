package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class D_Switch {

	public void method1() {
	
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과일이름을 입력하시오");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "딸기" :
			price = 1000;
			break;
		case "바나나" : 
			price = 3000;
			break;
		case "망고" :
			price = 5000;
			break;
		case "귤" :
			price = 10000;
			break;
			
		default :
			
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		sc.close();
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 회원등록");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원 삭제");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("회원등록 메뉴입니다");
			break;
		case 2 :
			System.out.println("회원수정 메뉴입니다");
			break;
		case 3 : 
			System.out.println("회원 삭제 메뉴입니다");
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1월~12월 중 하나를 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12:
			System.out.println("입력하신 월은 31일까지입니다.");
			break;
		case 4 : case 6: case 9: case11:
			System.out.println("입력하신 월은 30일 까지 입니다");
			break;
		case 2:
			System.out.println("입력하신 월은 28일 혹은 29일 까지입니다");
			break;
		default:
			System.out.println("반드시 1~12월까지 입력해야합니다.");
			break;
		}
	}
}
