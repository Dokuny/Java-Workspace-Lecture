package kr.co.ezen.first;

public class A_MethodPrinter {
	
	public void methodA() { // 메서드 = 기능 , 메서드는 호출되어야 작동을 한다.
		System.out.println("methodA()...호출됨");
		methodB(); //메서드간 호출이 가능
	}
	
	public void methodB() {
		System.out.println("methodB()...호출됨");
	}
	
	public void methodC() {
		System.out.println("methodC()...호출됨");
	}
	
	
}
