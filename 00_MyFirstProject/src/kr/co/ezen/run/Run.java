package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {
	// 자바에서는 클래스가 가진 메서드를 실행하려면  -> 생성자(constructor) : 클래스명 사용할이름 = new 클래스명(); 
	// 프로그램 실행 순서는 위에서 아래로, 좌에서 우로 실행. 
	public static void main(String[] args) {
		Hello hello = new Hello(); 
		hello.helloWorld(); //호출
		
		A_MethodPrinter ap = new A_MethodPrinter();
		ap.methodA();
		ap.methodB();
		ap.methodC();
		
		B_ValuePrinter bp = new B_ValuePrinter();
		bp.printValue1();
		bp.printValue2();
		bp.printValue3();
		
		
		
		
	}
	
	
	

}
