package kr.co.ezen.example.dimension;

public class DimensionalArray {
	
	public void method1() {
		// 2차원 배열선언
		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];
		
		iarr1 = new int[3][5];
		iarr1[1] = new int[3]; 
		
		for(int i =0;i<iarr1.length;i++) {
			for(int j =0; j<iarr1[i].length;j++) {
				System.out.print(iarr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		int[][] iarr1 = new int[3][5];
		int count=0;
		for(int i =0;i<iarr1.length;i++) {
			for(int j =0; j<iarr1[i].length;j++) {
				count++;
				System.out.printf("iarr[%d][%d] = %d\n",i,j,count);
			}
		}
	}
	
	public void method3() {
		int [][] iarr1 = {{1,2,3,4,5,},{6,7,8,9,10},{11,12,13,14,15}};
	}
}
