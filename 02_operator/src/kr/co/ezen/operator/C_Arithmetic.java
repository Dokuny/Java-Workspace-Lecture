package kr.co.ezen.operator;

public class C_Arithmetic { //arithmetic = 산수,연산,계산
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2));
		System.out.println("num1 % num2 = " + (num1%num2)); // 값 % 2 == 0 -> 짝수
	}
	
	public void method2() {
		double a = 35;
		double b = 10;
		
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
				
		System.out.println("add =" + add);
		System.out.println("sub =" + sub);
		System.out.println("mul =" + mul);
		System.out.println("div =" + div);
		System.out.println("mod =" + mod);
		
		
		
	
	}
	
}
