package practice;

import java.util.*;

public class ATM {
	
	public static void main(String[] args) {
		int money;
		String cPw,cId;
		Scanner sc = new Scanner(System.in);
		KookminAccount ka = new KookminAccount();
		boolean run = true;
		boolean judge = false;
		int input;	
		
		System.out.println("어서오세요 "+ka.kookmin.companyName+"입니다");
		
		while(true) {
			run = true;
			judge = false;
			System.out.println("=================================");
			System.out.println("1.계좌생성 | 2.입급 | 3.출금 | 4.계좌확인 ");
			System.out.println("=================================");
			
			System.out.print("실행할 번호를 입력해주세요> ");
			 input = sc.nextInt();
			
			if(input==1) {
				System.out.println("계좌생성을 누르셨습니다. 계좌 만드실 분의 성함, 계좌번호, 비밀번호를 설정해주세요");
				System.out.print("성함> ");
				String name = sc.next();
				System.out.print("비밀번호> ");
				cPw = sc.next();
				System.out.print("계좌번호> ");
				cId = sc.next();
				for(Account a : ka.kookmin.cList) {
					if(a.cId.equals(cId)) {
						System.out.println("동일한 계좌번호가 존재합니다.다른 번호로 만들어주세요");
						judge = true;
						break;
					}
				}
				if(!judge) {
					ka.creatAccount(name,cId,cPw);
				}
			}else if(input==2) {
				run = true;
				System.out.println("입금을 누르셨습니다. 입금하실 금액과 계좌번호를 입력해주세요.");
				System.out.print("입금액> ");
				money = sc.nextInt();
				
				while(run) {
					System.out.print("계좌번호> ");
					String id = sc.next();
				
					for(Account a : ka.kookmin.cList) {
						if(a.cId.equals(id)) {
							a.deposit(money,a);
							run=false;
							judge = true;
							break;
						}
					}
					if(!judge) {
						System.out.println("해당하는 계좌번호가 없습니다.");
					}
				}
			
			}else if(input==3) {
				
				System.out.println("출금을 누르셨습니다.소유하신 계좌번호와 비밀번호, 출금하실 금액을 입력해주세요.");
				
				while(run) {
					System.out.print("계좌번호> ");
					cId = sc.next();
					System.out.print("비밀번호>");
					cPw = sc.next();
					for(Account a : ka.kookmin.cList) {
						if(a.cId.equals(cId) && a.cPw.equals(cPw)) {
							judge = true;
							System.out.print("출금액> ");
							money = sc.nextInt();
							a.withdraw(money,a);
								run=false;
						}
					}		
					if(!judge) {
						System.out.println("계좌번호와 비밀번호가 맞는지 확인해주세요.");
					}
				}			
			}else if(input==4) {
				System.out.println("계좌확인을 누르셨습니다. 계좌번호와 비밀번호를 눌러주세요");
				System.out.print("계좌번호> ");
				cId = sc.next();	
				System.out.print("비밀번호> ");
				cPw = sc.next();			
				
				for(Account a : ka.kookmin.cList) {
					if(a.cId.equals(cId) && a.cPw.equals(cPw)) {
						judge = true;
						a.info(cId, cPw);
					}
				}
				if(!judge) {
					System.out.println("계좌번호와 비밀번호가 맞는지 확인해주세요.");
				}
			}		
		}
	}
}
