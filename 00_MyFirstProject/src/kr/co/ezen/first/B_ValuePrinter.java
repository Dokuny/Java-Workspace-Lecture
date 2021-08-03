package kr.co.ezen.first;

public class B_ValuePrinter {
	// 여러가지  형태의 값을 출력해 보기

	public void printValue1 () {
		// 숫자 출력
		System.out.println(123); //정수
		System.out.println(1.23); //실수
		
		// 문자 출력
		// char 2byte A를 저장한 다음 println()으로 출력
		System.out.println('A');
		System.out.println('a');
		
		// 문자열 출력
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		System.out.println(123+456);
		System.out.println(1.2-0.1);
	}
	
	public void printValue2() {
		//문자열과 숫자의 '+'연산
		System.out.println(9+9);
		System.out.println(9+"9");
		System.out.println("9"+9);
		System.out.println("9"+"9");
		
		System.out.println(9+9+"9");
		System.out.println(9+"9"+9);
		System.out.println("9"+9+9);
		System.out.println("9"+(9+9));
	}
	
	public void printValue3() {
		System.out.println("변수사용전");
		System.out.println(100+10);
		System.out.println(((100+10)*10)-10);
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println("변수 사용 후");
		System.out.println(point);
		System.out.println(point+"d" + (bonus + fees));
		
	}
	
}
