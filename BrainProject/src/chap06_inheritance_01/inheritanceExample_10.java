package chap06_inheritance_01;

abstract class Account{    //추상 클래스는 인스턴스의 생성이 불가능
    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo,String ownerName,int balance){
        this.accountNo=accountNo;
        this.ownerName=ownerName;
        this.balance=balance;
    }
    void deposit(int amount) {    // 메서드를 final로 선언하면 overriding 불가하다.
        balance+=amount;
    }

    int withdraw(int amount)throws Exception{
        if(balance<amount)
            throw new Exception("잔액이 부족합니다.");    // Exception 에러 만들기
        balance-=amount;
        return amount;
    }
}

public class inheritanceExample_10 {
	public static void main(String[] args) {
		Account obj = new Account("111-222-3333333","임꺽정",0);
		System.out.println(obj.balance);
	}
}
