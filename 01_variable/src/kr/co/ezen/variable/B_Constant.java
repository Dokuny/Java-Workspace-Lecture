package kr.co.ezen.variable;

public class B_Constant {
	
	public void finalConstant() {
		int age;
		final int AGE;  // final 은 상수변수 (상수란 변하지 않는 값,final 붙은 변수는 대문자를 쓰는게 관례)
		
		age = 20;
		AGE = 20;
		
		System.out.println("age:"+age);
		System.out.println("AGE:"+AGE);
		
		age = 30;
		
	}
}
