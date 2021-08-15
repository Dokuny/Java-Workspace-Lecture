package chapter5;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	static int i = 0;
	
	
	public static void main(String[] args) {
	
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo ==4) {
				withdraw();
			}else if(selectNo ==5) {
				run = false;				
			}
		}
		System.out.println("프로그램 종료");
	}
 
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호: \n");
		String ano = sc.nextLine();
		System.out.print("계좌주: ");
		String owner = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		
		if(i<accountArray.length){
			accountArray[i]= new Account(ano,owner,balance);
			System.out.println("결과:계좌가 생성되었습니다.");
			i++;
	}
		
	}
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int j=0; j<=i-1;j++) {
			System.out.printf("%s  %s  %d\n",accountArray[j].getAno(),accountArray[j].getOwner(),accountArray[j].getBalance());
		}
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		System.out.print("계좌번호> ");
		String ano = sc.nextLine();
		System.out.print("예금액> ");
		int balance = sc.nextInt();
		for(int j=0; j<accountArray.length;j++) {
			if(accountArray[j].getAno().equals(ano)) {
				accountArray[j].setBalance(balance+accountArray[j].getBalance());
				System.out.println("결과 : 예금이 성공되었습니다.");
				break;
			}
		}	
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
	
		System.out.print("계좌번호> ");
		String ano = sc.nextLine();
		System.out.print("출금액> ");
		int balance = sc.nextInt();
		
		for(int j=0; j<accountArray.length;j++) { //밑에 파인드어카운트 메소드 써서 포문없이 할 수 있는지 찾아보자.
			if(accountArray[j].getAno().equals(ano)) {
				accountArray[j].setBalance(accountArray[j].getBalance()-balance);
				System.out.println("결과 : 출금이 성공되었습니다.");
				break;
			}
		}
	}
	
	
	
	private static Account findAccount(String ano) {
	int j=0;
		for( j=0; j<accountArray.length;j++) {
			if(accountArray[j].getAno().equals(ano)) {
				System.out.println(accountArray[j]);
				break;
			}
			
		}
		return accountArray[j];
		
	}
}
