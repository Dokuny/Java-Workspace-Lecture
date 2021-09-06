package chap05.Object_Class_07;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName,int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance<amount) {
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
