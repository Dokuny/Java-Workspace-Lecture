package kr.co.ezen.chap01.encapsulation.mode.vo;

public class Account {
	String name = "홍길동";
	String accNo = "110-1121-13123";
	String pwd = "1234";
	int backCode = 20;
	int balance = 0;
	
	public Account() {
		
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println(name+"님의 계좌에 "+ money +"원이 입금 되었습니다");
		displayBalance();
	}
	
	public void withdraw(int money) {
		balance -= money;
		System.out.println(name+"님의 계좌에 "+ money +"원이 출금 되었습니다");
		displayBalance();
	}
	
	public void displayBalance() {
		System.out.println(name+"님의 계좌 잔액은 "+ balance+"원 입니다");
	}
}
