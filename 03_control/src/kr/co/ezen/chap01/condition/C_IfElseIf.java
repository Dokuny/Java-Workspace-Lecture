package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	/* if(조건식){
			실행할 문장1;
		}else if(조건식) {
			실행할 문장2;
		}else {
			실행할 문장3;
		}  
		 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한개 입력하세요");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다");
		}else if(num < 0) {
			System.out.println("입력하신 숫자는 음수입니다");
		}else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		sc.close();
	}
	
	public void method2() {
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
		
		String student = null;
		
		if(gender == 'M' || gender == 'm') {
			student="남학생";
		}else if(gender == 'F' || gender == 'f') {
			student="여학생";
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
			System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " +
								name + " " + student + "의 성적은 " + score + "이다.");
		
		sc.close();
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		char grade = ' ';
		
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'c';
		}else if(score >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("등급은 "+ grade + "입니다");	
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = sc.nextInt();
		String grade;
		
		if(score >= 90) {
			grade = score >= 95 ? "A+": "A";
		}else if(score >= 80) {
			grade = score >= 85 ? "B+": "B";
		}else if(score >= 70) {
			grade = score >= 75 ? "C+": "C";
		}else if(score >= 60 ) {
			grade = score >= 65 ? "D+": "D";
		}else {
			grade = "F";
		}
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다",score,grade);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = sc.nextInt();
		
	}
}
