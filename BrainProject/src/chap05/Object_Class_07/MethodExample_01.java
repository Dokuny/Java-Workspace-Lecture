package chap05.Object_Class_07;

public class MethodExample_01 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-222-3333333","김영식",200000);
		Account obj2 = new Account("444-555-6666666","이화자",1000000);
		
		obj1.deposit(1000000);
		obj2.withdraw(500000);
		
		printAccount(obj1);
		printAccount(obj2);
		

	}

	public static void printAccount(Account obj) {
		System.out.println("계좌번호: "+ obj.accountNo);
		System.out.println("예금주 이름 : " +obj.ownerName);
		System.out.println("잔액 : " +obj.balance);
		System.out.println();
	}
}
