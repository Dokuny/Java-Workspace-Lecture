package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void calculate() {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값을 입력하세요");
		a = sc.nextInt();
		System.out.println("b값을 입력하세요");
		b = sc.nextInt();
		
		int plus = a+b;
		int minus = a-b;
		int multiple = a*b;
		int divide = a/b;
				
		System.out.println("합 : "+ plus);
		System.out.println("차 : "+ minus);
		System.out.println("곱 : "+ multiple);
		System.out.println("몫 : "+ divide );
		
		sc.close();
	}
}
