package kr.co.ezen.operator;

import java.util.Scanner;

public class E_Logical {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력:");
		int num = sc.nextInt();
		
	
		
		System.out.println("1부터 100사이인지 확인" + ((num>=1) && (num<=100)) );
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나 입력");
		char ch = sc.next().charAt(0);
		
		System.out.println("영어 대문자인지 확인"+(ch>='A' && ch<='Z'));
		
		System.out.println("계속 하실려면 y 혹은 Y를 입력:");
		ch = sc.next().charAt(0);
		if(ch == 'y' || ch =='Y') {
			System.out.println("입력한 글자가 영문자 y인지 확인 ");
			ch = sc.next().charAt(0);
		
			if((ch == 'y' || ch =='Y' )) {
				System.out.println("Y입니다.");
			}
			else { 
				System.out.println("y가 아닙니다.");
			}
		}
		else { System.out.println("입력종료");
		}
		}
		
	
	public void method3() {
		int num = 10;
		boolean result = false && ++num>0;
		System.out.println("result확인 : " +result); //논리곱은 앞이 false 면  바로 종료된다.->++num 작동X
		System.out.println("num=" + num);          // 그렇기에 num은 10으로 고정.
		boolean result2 = true || ++num>0;          
		System.out.println("result2확인 : " + result2);// 논리합은 앞이 true면 바로 종료.
		System.out.println("num= "+num);			 // 그렇기에 num은 10.
	
	}
	public void method4() {
		int a=2;
		int b=3;
		
		boolean c= a>b; // false
		boolean d= ++a <= b++; // true
		
	}
	public void method5() {
		
	}
}
	
