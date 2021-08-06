package kr.co.ezen.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		int num;
		String judge;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		num = sc.nextInt();
		judge = (num>0)?"양수다":"양수가 아니다";
		
		System.out.println(judge);
		
		sc.close();
	}
	
	public void practice2() {
		int num;
		String judge;
		
		System.out.println("입력하세요");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		judge = (num>0)?"양수다":((num<0)?"음수다":"0이다");
		System.out.println(judge);
	}
	
	public void practice3() {
		int num;
		String judge;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력해주세요");
		num = sc.nextInt();
		
		judge = (num%2 == 0)? "짝수다" : "홀수다";
		System.out.println(judge);
		
		sc.close();
		
	}
	
	public void practice4() {
		int person;
		int candy;
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수를 입력해주세요");
		person = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("사탕 수를 입력해주세요");
		candy = sc.nextInt();
		
		a = candy / person;
		b = candy % person;
		
		System.out.println("1인당 사탕개수 : "+ a+ "\n남는 사탕개수 : "+ b);
		
		sc.close();
	}
	
	public void practice5() {
		String name;
		int grade;
		int classNumber;
		int number;
		char gender;
		double point;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name = sc.nextLine();
		
		System.out.println("학년을 입력해주세요");
		grade = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("반을 입력해주세요");
		classNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("번호를 입력해주세요");
		number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별을 입력해주세요(M/F)");
		gender = sc.nextLine().charAt(0);
		
		if((gender == 'M')||(gender=='m')) {
			gender = '남';
		}
		System.out.println("성적을 입력해주세요(소수점 아래 둘째 자리까지)");
		point = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %4s %c학생의 성적은 %.2f이다.", grade, classNumber, number, name, gender, point );
		
		sc.close();
		}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		String print = (age <= 13)? "어린이입니다": ((age<=19)?"청소년입니다":"성인입니다");
		System.out.println(print);
		
		sc.close();
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		char num;
		String gender;
		
		System.out.println("주민번호 입력하세요 (-포함)");
		num = sc.nextLine().charAt(7);
		
		gender = (num == 49 || num == 51) ? "남자" : "여자"; // 49 대신 '1' 이런식으로 사용해도 된다.
		
		System.out.println(gender);
		
		sc.close();
		}

	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("정수를 입력해주세요");
		System.out.print("정수1 : "); 
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean a = num1<num2 && (num3 > num2 || num3 <= num1);
		
		System.out.println(a);
		
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int a =sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		
		System.out.println(a == b && b == c);
	}
}
