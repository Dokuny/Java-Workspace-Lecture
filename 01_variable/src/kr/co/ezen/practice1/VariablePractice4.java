package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void apple() {
		
		String name;
		char a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		name = sc.nextLine();
		
		a = name.charAt(0);
		
		System.out.println(a);
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		
		
	}
}
