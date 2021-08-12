package chapter5;

import java.util.*;

public class Method {
//1~100에서 업다운 
	public void method() {
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100+1);
		
		while(true) {	
			System.out.println("1~100사이의 값을 입력해주세요");
			//System.out.println( ran );
			int i = sc.nextInt();
			
			if(i<ran && i<100 && i>0) {
				System.out.println("up");	
				
			}else if(i>ran && i<100 && i>0){
				System.out.println("down");
				
			}else if(i == ran && i<100 && i>0){
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);

		System.out.println("업다운 게임 시작....");
        while(true) {
            System.out.print("1~100사이의 숫자를 입력하세요:");
            int num=sc.nextInt();

            int bomb = 49;

        if(num<bomb) {
            System.out.print("up~!");
        }else if(num>bomb) {
            System.out.print("down~!");
        }else {
            System.out.print("bomb!!!!");
            break;
        }
        }
    }
	
}
