package kr.co.ezen.practice.chap02;

import java.util.*;

public class LoopPractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {
			for(int i = 1; i<=num;i++) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1이상의 숫자를 입력");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}else {
				for(int i = 1; i<=num;i++) {
					System.out.print(i+" ");
				}
				return;
			}
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		if(num>=1) {
			for(int i = num; i>=1;i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		sc.close();
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
	
			if(num>=1) {
				for(int i = num; i>=1;i--) {
					System.out.print(i+" ");
				}
				sc.close();
				return;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요");
			}
		}
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum += i;
			if(i<num) {
				System.out.printf("%d + ",i);
			}else {
				System.out.printf("%d ",i);
			}
		}
		System.out.printf("= %d",sum);
		
		sc.close();
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("1이상의 숫자를 입력해주세요");
			return;
		}
			int max = num1>num2 ? num1:num2;
			int min = num1>num2 ? num2:num1;
		
			for(int i = min; i<=max;i++) {
				System.out.printf("%d ",i);
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째숫자 : ");
			int num2 = sc.nextInt();
		
			if(num1 < 0 || num2 < 0) {
				System.out.println("1이상의 숫자를 입력해주세요");		
			}else {
				int max = num1>num2 ? num1:num2;
				int min = num1>num2 ? num2:num1;
		
				for(int i = min; i<=max;i++) {
					System.out.printf("%d ",i);
				}
				break;
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		
		System.out.printf("====%d=====\n",num);
		for(int i= 1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.println("9이하의 숫자만 입력해주세요");	
		}else {
			for(int j = num; j<=9;j++) {
				System.out.printf("====%d단=====\n",j);
				for(int i= 1;i<10;i++) {
					System.out.printf("%d * %d = %d\n",j,i,j*i);
				}
			}
		}
		sc.close();
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자입력");
			int num = sc.nextInt();
			if(num>9) {
				System.out.println("9이하의 숫자만 입력해주세요");	
				continue;
			}else {
				for(int j = num; j<=9;j++) {
					System.out.printf("====%d단=====\n",j);
					for(int i= 1;i<10;i++) {
						System.out.printf("%d * %d = %d\n",j,i,j*i);
					}
				}
				break;
			}
		}
		sc.close();
		
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("첫번째 정수 입력");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수 입력");
			int num2 = sc.nextInt();
			System.out.println("연산자 입력");
			String operator = sc.next();
			
		
			switch(operator) { 
					case "/" :
						if(num2 == 0) {
							System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
							continue;
						}
						sum = num1 / num2;
						break;
					case "*" :
						sum = num1 * num2;
						break;
					case "+" :
						sum =  num1 + num2;
						break;
					case "-" :
						sum = num1 - num2;
						break;
					case "%" : 
						sum = num1 % num2;
						break;
					case "exit" :
						System.out.println("프로그램을 종료합니다");
						break;
					default :
						System.out.println("없는 연산자 입니다.다시 입력해주세요");
						continue;
				}	
				System.out.printf("%d %s %d = %d",num1,operator,num2,sum);
				sc.close();
				break;
			}
	}
	
	public void method13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++) {
			for(int j=num; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
