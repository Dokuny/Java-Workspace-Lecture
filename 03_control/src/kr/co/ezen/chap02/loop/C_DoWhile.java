package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	public void method1() {
		//키보드로 영어 문자열 값을 입력받아 출력 반복 실행
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do {
			System.out.println("문자열 입력");
			str = sc.next();
			System.out.println("str: "+str);
			if(str.equals("exit")) {
				break;
			}
		}while(true);
	}
	
	public void method3() {
		
	}
}
