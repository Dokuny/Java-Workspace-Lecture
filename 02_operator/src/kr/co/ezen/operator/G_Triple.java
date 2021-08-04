package kr.co.ezen.operator;

import java.util.Scanner;

public class G_Triple {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		int num = sc.nextInt();
		
		
		String result = (num>0)?"양수다" : "양수가아니다";
		System.out.println(result);
		
		String result2 = (num>0)?"양수다" : (num == 0)?"0이다":"음수다";
		System.out.println(result2);
		
		
	}
}
