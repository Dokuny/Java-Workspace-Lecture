package kr.co.ezen.practice.chap01;

import java.util.*;

public class Practice01 {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요");
		int i = sc.nextInt();
		
		if(i<0) {
			System.out.println("양수만 입력해주세요");
		}else if(i%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		sc.close();	
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		
		if(kor>=40 && eng >= 40 && math>=40 && avg>=60) {
			System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %.1f\n축하합니다. 합격입니다!",kor,eng,math,sum,avg);
		}else {
			System.out.println("불합격입니다.");
		}	
	}
	
	public void method3() {
		String id = "myId";
		String pw = "myPassword12";
		
			if(id.equals("myId")) {
				if(pw.equals("myPassword12")) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}	
			}else if(pw.equals("myPassword12")) {
				System.out.println("아이디가 틀렸습니다.");
			}else {
				System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("메뉴 번호를 입력하세요");
		
		int i = sc.nextInt();
		
		switch(i) {
			case 1:
				System.out.println("입력메뉴입니다");
				break;
			case 2:
				System.out.println("수정메뉴입니다");
				break;
			case 3:
				System.out.println("조회메뉴입니다");
				break;
			case 4:
				System.out.println("삭제메뉴입니다");
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12사이의 정수입력");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: case 2: case 12:
			System.out.println(num+"은 겨울입니다");
			break;
		case 3: case 4: case 5:
			System.out.println(num+"은 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println(num+"은 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println(num+"은 가을입니다");
			break;
		default:
			System.out.println(num+"은 잘못 입력된 달입니다");
			break;
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인 하고자 하는 회원등급");
		String id = sc.nextLine();
		
		switch(id) {
			case "관리자":
				System.out.println("회원관리,게시글관리,게시글작성,댓글작성,게시글조회");
				break;
			case "회원":
				System.out.println("게시글작성,댓글작성,게시글조회");
				break;
			case "비회원":
				System.out.println("게시글조회");
				break;
			default :
				System.out.println("잘못 입력된 권한입니다.");
				break;
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키입력>");
		double height = sc.nextDouble();
		System.out.print("몸무게입력>");
		double weight = sc.nextDouble();
		
		double bmi = weight /(height*height);
		System.out.println("BMI지수 : " + bmi);
		if(bmi>30) {
			System.out.println("고도비만");
		}else if(bmi>=25) {
			System.out.println("비만");
		}else if(bmi>=23) {
			System.out.println("과체중");
		}else if(bmi>=18.5) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력: ");
		int i = sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int j = sc.nextInt();
		System.out.print("연산자를 입력: ");
		char o = sc.next().charAt(0);
		
		double result1;
		int result;
		
		if(i>0 && j> 0) {
			switch(o) {
			 case '+' :
				 result = i+j;
				 break;
			 case '-' :
				 result = i-j;
				 break;
			 case '*' :
				 result = i*j;
				 break;
			 case '/' :
				 result1 = (double)i/j;
				 System.out.printf("%d %c %d = %.2f",i,o,j,result1);
				 return;
			 case '%' :
				 result = i%j;
				 break;
			default :
				System.out.println("연산기호를 잘못입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}else {
			System.out.println("양수를 입력해주세요. 프로그램을 종료합니다");
			return;
		}
		System.out.printf("%d %c %d = %d",i,o,j,result);
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 입력>");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수 입력>");
		int fin = sc.nextInt();
		System.out.print("과제 점수 입력>");
		int task = sc.nextInt();
		System.out.print("출석 회수 입력>");
		int att  = sc.nextInt();
		
		if(mid<0|| fin<0|| task<0|| att<0||mid>100|| fin>100|| task>100|| att>20 ) {
				System.out.println("입력 값을 제대로 입력해주세요");
				return;
		}else if(att>6) {	
			System.out.println("===========결과===========");
			System.out.println("중간고사 점수(20)>" + mid*0.2);
			System.out.println("기말고사 점수(30)>" + fin*0.3);
			System.out.println("과제 점수(30)>" + task*0.3);
			System.out.println("출석 점수(20)>" + att);
		
			double sum = (mid*0.2 + fin*0.3 + task*0.3 + att);
			System.out.println("총점 >" + sum);
			
			if(sum<70) {
				System.out.printf("Fail [점수미달]");
			}else {
				System.out.println("Pass");
			}
		}else {
			System.out.printf("Fail [출석회수 부족(%d/20)]",att);	
		}
	}			
}
