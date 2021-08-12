package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class A_For {
	//for(초기식;조건식;증감식){
	// 	 실행할 문장;
	// }
	
	public void method1() {
		for(int i = 1; i < 5; i++) {
			System.out.println(i+"번째 반복문 실행");
		}
	}
	
	public void method2() {
		for(int i =5 ; i>=1 ; i--) {
			System.out.println(i+"번째 반복문 실행");
		}
	}
	
	public void method3() {
		for(int i=1 ; i<11 ;i++) {
			if(0 != i%2) {
				System.out.println(i);
			}
		}
	}
	
	public void method4() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1~9사이의 양수르 하나 입력하세요");
		int num = sc.nextInt();
		
		if(num>0 && num <10) {
			for(int i=1;i<10;i++) {
				System.out.println(num + "x"+ i +"=" + (num*i));
			}
		}else {
			System.out.println("1~9사이의 양수를 입력해야 합니다");
		}
		sc.close();
	}
	
	public void method5() {
		//0<=Math.random()<1
		//for(int i=1; i<=10;i++) {
		//		System.out.println(Math.random());
		
		int num =(int)(Math.random()*10)+1;
		int sum =0;
		
		for(int i = 1; i<=num;i++) {
			sum += i;
			
		}
		System.out.printf("1부터 %d 까지의 정수합계: %d",num, sum);
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째정수 :");
		int a = sc.nextInt();
		System.out.print("두번째정수: ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		if(a>b) {
			for(int i = b; i<=a; i++ ) {
				sum += i;	
			}
			System.out.printf("%d에서 %d까지의 합 : %d",b,a,sum);
		}else if(a<b) {
			for(int j = a; j<=b;j++) {
				sum +=j;	
			}
			System.out.printf("%d에서 %d까지의 합 : %d",a,b,sum);
		}else {
			sum = a+b;
			System.out.printf("%d에서 %d까지의 합 : %d",a,b,sum);
		}
	}
	
	public void methodT() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째정수 :");
		int a = sc.nextInt();
		System.out.print("두번째정수: ");
		int b = sc.nextInt();
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		max = a>=b ? a:b ;
		min = a>=b ? b:a ;
		
		if(a==b) {
			sum = min+max;
		}else {
			for(int i = min; i <= max; i++) {
				sum += i;
			}
		}
		System.out.printf("%d에서 %d까지의 합 : %d",min,max,sum);
	
		}
}
