package chapter5;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = sc.nextInt();					
				}
			}else if(selectNo == 3) {
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]:"+ scores[i]);
					
				}
			}else if(selectNo == 4) {
				int high = 0;
				double avg =0.0;
				int sum = 0;
				for(int i = 0 ; i < scores.length; i++) {
					high = (high < scores[i]? scores[i] : high);
					sum += scores[i];
					/*if(scores[i]> high) {
						high = scores[i];
					}
				}
				for(int b = 0; b < scores.length; b++) {
					sum += scores[b]; */
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수:" +high);
				System.out.println("평균점수" + avg);
			}else {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		sc.close();
	}
}
