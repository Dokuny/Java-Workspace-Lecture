package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void square() {
		
		double height;
		double length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로입력 : ");
		height = sc.nextDouble();
		
		System.out.println("세로입력 : ");
		length = sc.nextDouble();
		
		double dimension = height * length;
		double surround = (height+length)*2;
		
		System.out.println("면적 : "+ dimension);
		System.out.println("둘레 : "+ surround);
				
		
		sc.close();
	}
}
