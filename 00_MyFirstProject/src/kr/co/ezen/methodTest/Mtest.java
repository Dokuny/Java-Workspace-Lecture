package kr.co.ezen.methodTest;

public class Mtest {
	
	public void methodA() { // 메서드 = 기능 , 메서드는 호출되어야 작동을 한다.
		System.out.println("나 메서드 A야");
		methodB(); //메서드간 호출이 가능
	}
	
	public void methodB() {
		System.out.println("나 메서드 B야");
		methodC();
	}
	
	public void methodC() {
		System.out.println("나 메서드 C야");
		
		
	}
}
