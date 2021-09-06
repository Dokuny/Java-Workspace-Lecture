package kr.co.ezen.chap01.encapsulation.run;

import kr.co.ezen.chap01.encapsulation.mode.vo.*;

public class Run {

	public static void main(String[] args) {
		Account a = new Account();
		a.displayBalance();
		a.deposit(10000000);
		
		a.deposit(50000000);
		
		a.withdraw(10000000);
		
	}

}
