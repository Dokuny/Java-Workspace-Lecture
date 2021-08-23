package kr.co.ezen.practice.dimension;

import java.util.*;

public class Practice {

	public void practice1() {
		String[][] a = new String[3][3];
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] ="("+ i +", "+ j + ")";
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] a = new int[4][4];
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] = i*a.length + j + 1;
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] a = new int[4][4];
		
		int b = a.length * a[0].length;
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] = b--;
				
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] a = new int[4][4];
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
				int sum2=0;
				for(int j =0; j<a[i].length;j++) {
					if(j<a[i].length-1) {
						a[i][j] = (int)(Math.random()*10+1);
						sum2 += a[i][j];	
					}else {
						a[i][j] = sum2;
						sum1 += sum2;
					}	
				}
			}else {
				for(int j = 0; j<a.length;j++) {
					if(j<a.length-1) {
						int sum2 = 0;
						
						for(int k =0; k<a.length-1;k++) {
							sum2 += a[k][j];
							a[i][j] = sum2;
						}
						
						sum1 += sum2;
					}else {
						a[i][j] = sum1;
					}
				}
			}	
			
			for(int j = 0; j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("행크기 : ");
			int line = sc.nextInt();
			
			System.out.print("열크기 : ");
			int	row = sc.nextInt();
			
			if(line<0 || line>11 || row<0|| row>11) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다");
				continue;
			}
			
			char [][] arr = new char[line][row];
			
			//65~90이 영어 대문자
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr [i][j] = (char)(int)(Math.random()*26+65);
					System.out.printf("%-2c ",arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	}
}
