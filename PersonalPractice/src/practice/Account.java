package practice;

public class Account {
	String cId;
	int cIdHashCode;
	String cName,cPw;
	int balance=0;

	Account(){}
	
	Account (String name,String cId,String cPw) {
		this.cId = cId;
		this.cName = name;
		this.cPw = cPw;
	}
	
	public void creatAccount(String name,String cId,String cPw) {
	
	}
	
	public void deposit(int money,Account a) {
		a.balance += money;
		System.out.println(money + "원 입금되었습니다");
		System.out.println("거래 후 잔고는 "+a.balance+"원 입니다");
	}
	
	public void withdraw(int money,Account a) {
		a.balance -= money;
		System.out.println(money + "원 입금되었습니다");
		System.out.println("거래 후 잔고는 "+a.balance+"원 입니다");
	}
	
	public void info(String cId,String cPw) {	
			System.out.println("소유주> "+cName);
			System.out.println("계좌번호> "+this.cId);
			System.out.println("잔고> "+balance);	
	}
	
}
