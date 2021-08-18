package kr.co.ezen.example.array;

import java.util.Scanner;

public class A_Array {
	
	
	
	public void method1() {
		int num1=0;
		int num2=0;
		int num3=30;
		int num4=40;
		int num5=50;
		
		int sum1=0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("arr.length="+arr.length);
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = (i+1)*10;
		}
		int sum2=0;
		for(int i =0; i<arr.length;i++) {
			sum2 += arr[i];
		}
	}
	
	public void method2() {
		int[] iArr; //stack에 int형 배열의 주소를 보관할 수 있는 공간생성
		char cArr[];  
		
		iArr = new int[5];
		cArr = new char[10];
		
		//heap 메모리는 직접 접근이 허용되지 못하는 영역이기 때문에 실제 값을 저장하고 있는 공간의 주소만 가지고 찾아갈 수 있다.
		
		System.out.println("iArr의 hashCode : "+iArr.hashCode());
		System.out.println("iArr의 hashCode : "+cArr.hashCode());
	}
	
	public void method3() {
		int[] iArr = new int[5];
		
		for(int i =0; i<iArr.length;i++) {
			iArr[i] = i+1;
			
			System.out.printf("iArr[%d] = %d\n",i,iArr[i]);
		}
	}
	
	public void method4() {
		String sArr5[]=null;
		sArr5= new String[] {"abcd"};
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		int[] height = new int[5];
		
		for(int i=0;i<height.length;i++) {
			System.out.printf("%d번째 사람의 키를 입력해주세요>",i+1);
			height[i] = sc.nextInt();
			sum += height[i];
		}
		avg = (double)sum/height.length;
		System.out.printf("평균 : %.1f",avg);
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] =(int)(Math.random()*100)+1;
			System.out.println(arr[i]);
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()]; //lenght()는 문자열의 길이 리턴 ->변수
		
		for(int i=0;i<arr.length;i++) {   //length는 배열의 길이 리턴 -> 상수
			arr[i]=str.charAt(i);
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
