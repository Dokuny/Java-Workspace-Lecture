package kr.co.ezen.operator;

import java.util.Scanner;

public class A_LogicalNagation {

	public void method1() {
		System.out.println("true의 부정"+ !true); //!는 부정연산자로 true나 false값을 반대로 만들어줌
		System.out.println("false의 부정"+ !false);
		
		boolean bool1=false;
		boolean bool2=true;
		
		System.out.println("bool1 = " + bool1);
		System.out.println("!bool1 = " + !bool1);
		System.out.println("bool2 = " + bool2);
		System.out.println("!bool2 =" + !bool2);
	}	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수하나 입력 : ");
		int num = sc.nextInt();
		
		boolean a = num > 0;
		System.out.println("입력한 정수가 양수인가?" + a);
		System.out.println(num>0);
		
		System.out.println("입력한 정수가 양수인가?" + a);
	}
	
}
