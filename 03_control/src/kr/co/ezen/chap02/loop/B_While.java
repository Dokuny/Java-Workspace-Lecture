package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class B_While {

	public void method1() {
		//1부터 5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i+"번째 반복문 수행");
			i++;
		}
	}
	
	public void method2() {
		int i =5;
		while(i>=1) {
			System.out.println(i +"번째 반복문 수행");
			i--;
		}
	}
	
	public void method3() {
		//1부터 10사이의 홀수만 출력
		int i =1;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
	}
	
	public void method4() {
		//정수를 하나 입력받아 그 수가 1~9사이의 수일때 만 그 수의 구구단 출력 조건이 맞지않으면 "1~9사이의 수가 아닙니다"출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력");
		int num = sc.nextInt();
		
		if(num<10 && num>0) {
			int i =1;
			while(i<10) {
				System.out.printf("%d x %d = %d\n", num,i,num*i);
				i++;
			}
		}else {
			System.out.println("1~9사이의 수가 아닙니다.");
		}
	}
	
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		
		int ran = (int)(Math.random()*10+1);
		int start = 1;
		int sum = 0;
		System.out.printf("임의의 수 %d 생성\n",ran);
		while(start<=ran) {
			sum += start;
			start++;
		}
		System.out.println(sum);
	}
	
	public void method6() {
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
		
		int i= min;
		
		while(i<=max) {
			sum += i;
			i++;
		}
		System.out.printf("%d에서 %d까지의 합 : %d",min,max,sum);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 앞 자리를 입력해주세요");
		int dan = sc.nextInt();
		int sum = 0;
		//int dan2 =1; 여기다 이렇게 초기화 해버리면 두번째 while문에서 dan2의 값이 10으로 고정돼버려서 작동을 안함.
		
		if(dan>0 && 10>dan) {
			while(dan<10) {
				int dan2 =1;
				while(dan2<10) {
					System.out.printf("%d x %d = %d\n",dan,dan2,dan*dan2);
					dan2++;
				}
				dan++;
			}
			}else {
				System.out.println("1~9사이의 값을 입력해주세요");
		}
	}
	
	public void method8() {
		Scanner sc= new Scanner(System.in);
		System.out.println("출력할 줄 수");
		int row = sc.nextInt();
		int r= 1;
		
		while(r<=row) {
			int c=1;
			while(c<=5) {
				System.out.print("*");
				c++;
			}
			r++;
			System.out.println();
		}
		sc.close();
	}
	
	public void method9() {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("줄 수:");
		int row = sc.nextInt();
		System.out.print("칸 수:");
		int col = sc.nextInt();
		
		int i =1;
		
		while(i<=row) {
			int j = 1;
			while(j <= col) {
				if(j==i) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
				j++;
			}
			i++;
			System.out.println();
		}
		i-=1;
		while(i>=1) {
			int j = 1;
			while(j <= col) {
				if(j==i) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
				j++;
			}
			i--;
			System.out.println();
		}
	}
	
	public void method10() {
		//문자열을 입력받아 인덱스별로 문자 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		int index=0;
		while(index < str.length()) {
			System.out.println(str.charAt(index));
			index++;	
		}
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. 1 ~ 5까지 출력");
			System.out.println("2. 5 ~ 1까지 출력");
			System.out.println("3. 1 ~ 10까지 홀수 출력");
			System.out.println("4. 메뉴종료");
			System.out.print("메뉴 선택>");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : 
				method1();
				break;
			
			case 2 :
				method2();
				break;
				
			case 3 : 
				method3();
				break;	
				
			case 4 :
				System.out.println("종료합니다");
				run = false; // 
				break;       // return; 해버리면 false 넣을 필요도 없이 종료된다.
				
			
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}
