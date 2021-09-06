package practice;

public class KookminAccount extends Account {
	BankCompany kookmin = new BankCompany("국민은행");
	
	@Override
	public void creatAccount(String name,String cId,String cPw) {
			
		kookmin.cList.add(new Account(name,cId,cPw));	
		System.out.println("계좌가 생성되었습니다.");	
	}
}
