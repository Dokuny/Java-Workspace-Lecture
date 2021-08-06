package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	
	public void method1() {
	Scanner sc=new Scanner(System.in);
	System.out.print("숫자 한 개를 입력하세요.:");
	int num=sc.nextInt();
	
	if(num == 0) { // 0을 양수라고 가정
		System.out.println("입력하신 숫자는 0입니다.");
	}
	if(num >= 0) {  
		System.out.println("입력하신 숫자는 양수입니다.");
	}else{
		System.out.println("입력하신 숫자는 음수입니다.");
	}
	
	System.out.println("프로그램 종료.");
  }
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 한개를 입력하세요:");
		int num=sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("학년(숫자만) :");
		int grade=sc.nextInt();
		System.out.print("반(숫자만) :");
		int classNum=sc.nextInt();
		System.out.print("번호(숫자만) :");
		int num=sc.nextInt();
		System.out.print("성별(M/F) :");
		char gender=sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double score=sc.nextDouble();
		
		String student=null;
		
		if(gender == 'M' || gender == 'm') {
			student="남학생";
		}if(gender == 'F' || gender == 'f') {
			student="여학생";
		}
		
		if(gender != 'M' && gender !='F' && gender !='m' && gender !='f') {
			System.out.println("잘못 입력하셨습니다.");
		}else
			System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " +
								name + " " + student + "의 성적은 " + score + "이다.");
		
		sc.close();
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 :");
		int age=sc.nextInt();
		
		String str=null;
		
		if(age <= 13) {
			str="어린이";
		}else {
			str="청소년";
		}
		if(age > 19) {
			str="성인";
		}
		System.out.println(str);
		
		sc.close();
	}
	
}












