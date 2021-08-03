package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void person() {
		String name;
		int age;
		char gender;
		double height;
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
		System.out.println("키"+ height + "cm인 " + age +"살 "+ gender+"자 " + name+ "님 반갑습니다^^"  );
		
		sc.close();
	}
	
}
