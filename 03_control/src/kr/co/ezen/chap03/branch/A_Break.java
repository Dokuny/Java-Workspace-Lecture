package kr.co.ezen.chap03.branch;

import java.util.*;

public class A_Break {
	//break 문은 가장 가까운 반복문을 나감
	
	public void method1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1;;i++) {
			sum += i;
			if(i == num) {
				break;
			}
		}
		System.out.println("1부터"+ num +"까지의 합은 "+ sum + "입니다.");
	}
}
