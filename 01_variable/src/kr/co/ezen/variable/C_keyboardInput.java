package kr.co.ezen.variable;

import java.util.Scanner;

public class C_keyboardInput {
	
	//java.util 패키지에서 제공하는 클래스를 이용한 키보드 입력
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.next(); //next() - 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자씩 입력 받는다. ->공백은 무시하고 다음문자 처리
								//nextLine() - 문자 또는 문장 한라인 전체를 입력받는다.
		//String name = sc.nextLine();
		System.out.println("당신의 나이는 몇살입니까?");
		int age = sc.nextInt();
		System.out.println("당신의 키는 몇입니까?");
		double height = sc.nextDouble();
		
		System.out.println("이름은"+ name + "키는" + height + "나이는" + age);
		
		sc.close();
		
	}
	
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		

		System.out.println("이름: ");
		String name = sc.nextLine();
		
		
		
		System.out.println("나이: ");
		int age = sc.nextInt();         /*Scanner.nextInt 메소드는 사용자 입력의 가장 마지막 개행문자(엔터, newline)를 제거하지 않음
											개행문자(엔터) 전까지만 숫자로 입력 받습니다.
										개행문자(엔터)는 다음에 호출된 Scanner.nextLine( ) 메소드의 입력으로 처리되서 문제기 발생합니다.*/	
		//sc.nextLine();
		
		System.out.println("주소: ");
		String address = sc.next();  // sc2라는 생성자 만들어서 sc2로 변경해줘도 가능. or nextLine 말고 next로
		
		System.out.println("키: ");
		double height = sc.nextDouble();
		
		System.out.println("이름은 "+ name + " 키는 " + height + " 나이는 " + age + " 주소는 " + address);
		
		sc.close();
		}
	
	public void inputScanner3() {
		String name;
		char gender;
		int age;
		double height;
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		name = sc.nextLine();
		
		System.out.println("성별(M/F):");
		gender = sc.nextLine().charAt(0); //여기서 charAt(n)은 앞의 변수의 n번째 글자를 char타입으로 변경해주는 것(n은 0부터 시작).  스캐너에선 한글자만 받고싶을때 사용.
										  // String타입을 char타입으로 변환할 때 사용한다라고 알아두자.
		System.out.println("나이:");
		age = sc.nextInt();
		System.out.println("키:");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별은: "+ gender);
		System.out.println("나이는:" + age);
		System.out.println("키는 : " + height); 
		
		
		sc.close();
		
	}
}
