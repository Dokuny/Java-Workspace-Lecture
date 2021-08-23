package chapter5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		if(C<1) {
			return;
		}
		
		int[] cArray = new int[C];
		
		for(int i =0; i<cArray.length; i++) {
			int N = sc.nextInt();
			
			if(N<1 || N>1000) {
				return;
			}
			
			int[] studentNum = new int[N];
			
			int sum = 0;
			
			for(int j=0; j<studentNum.length; j++) {
				studentNum[j] = sc.nextInt();
				sum+= studentNum[j];
				if(studentNum[j] <0 || studentNum[j] >100) {
					return;
				}
			}
			
			double avg = (double)sum/N;
			
			sum =0;
			for(int j =0 ; j<studentNum.length;j++) {	
				if(studentNum[j]>avg) {
					sum++;
				}
			
			}
			System.out.printf("%.3f%%\n",(double)sum/N*100);
		}
	}
}
