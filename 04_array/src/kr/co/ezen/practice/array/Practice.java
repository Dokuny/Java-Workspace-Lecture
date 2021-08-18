package kr.co.ezen.practice.array;

import java.util.*;

public class Practice {
	
	public void practice1() {
		int[] a = new int[10];
		
		for(int i=0; i<a.length;i++) {
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice2() {
		int[] a = new int[10];
		
		for(int i=0; i<a.length;i++) {
			a[i] = a.length-i;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i <a.length; i++) {
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice4() {
		String[] a = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.next();
		}
		
		System.out.println(a[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.println("문자열 입력");
		String a = sc.next();
		char[] b = a.toCharArray();
		
		System.out.println("검색할 문자입력:");
		char c= sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",a,c);
		for(int i=0;i<b.length;i++) {
			if(b[i] == c) {
				System.out.print(i+" ");
				num++;	
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d",c,num);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] month = {"월","화","수","목","금","토","일"};
		
		System.out.print("0~6사이의 숫자입력 : ");
		int input = sc.nextInt();
		if(input>6 || input<0) {
			System.out.println("잘못 입력하셨습니다");
		}else {
			System.out.println(month[input]+"요일");	
		}
	}
	
	public void pratice7() {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수입력");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();	
		}
		int sum=0;
		for(int i = 0; i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수:");
			int input = sc.nextInt();
			
			if(input %2 != 0 && input>=3) {
				int[] arr = new int[input];
					
				for(int i=0;i<arr.length;i++) {
					if(i<=arr.length/2) {
						arr[i] = i+1;
						System.out.print(arr[i]+", ");
					}else if(i==arr.length-1){
						arr[i] = arr[i-1]-1;
						System.out.print(arr[i]);
					}else {
						arr[i] = arr[i-1]-1;
						System.out.print(arr[i]+", ");
					}
				}
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] kinds = {"후라이드","양념","간장","갈릭","불닭","뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();
		
		for(int i = 0; i<kinds.length;i++) {
			if(chicken.equals(kinds[i])) {
				System.out.printf("%s치킨 배달가능",chicken);
				return;
			}
			
		}
		System.out.printf("%s치킨은 없는 메뉴입니다",chicken);
		sc.close();
	}
}
