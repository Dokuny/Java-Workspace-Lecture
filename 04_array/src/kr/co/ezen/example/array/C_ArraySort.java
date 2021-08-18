package kr.co.ezen.example.array;

import java.util.*;

public class C_ArraySort {
	
	public static void testSwapLogic() {
		int num1 = 10;
		int num2 = 20;
		int temp = 0;
		
		
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
	
	public static void testArraySort1() {
		int[] array = {2,4,5,1,3,5};
		
		int min;
		int temp;
		
		for(int i=0;i<array.length-1;i++) {
			min = i;
			for(int j=i+1;j<array.length;j++) {
				System.out.println("현재 인덱스 위치:" );
	
			if(array[min]>array[i]) {
				min = array[i];
			}
			}
		}
	}
	
	public static void selectionSort() {
		//선택정렬
		int[] arr = {2,4,5,1,3,5,10,8,4,3};
		
		int min =0;
		
		for(int i = 0; i<arr.length; i++) {
			min = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			int tmp = arr[min]; // 가장 작은 값이 들어가있음
			arr[min] = arr[i];  // 시행되기전 제일 앞에 있는 배열값을 가장 작은 값이 들어있는 인덱스로 보낸다.
			arr[i] = tmp;       // 제일 앞에 배열값에 가장 작은 값을 넣는다.
		}
	}
	
	public static void insertionSort() {
		int[] arr = {2,4,5,1,3,5,10,8,4,3};
		
		for(int i=0;i<arr.length;i++) {
			int tmp = arr[i];
			int index = i-1;
			
			
			
			while((index>=0)&&(arr[index]>tmp) ) {
				arr[index+1] = arr[index];
				System.out.println(Arrays.toString(arr));
				index--;
			}
			arr[index+1] = tmp;
		}
	
		
		
	}
	
	public static void bubbleSort() {
		int[] arr = {2,4,5,1,3,5,10,8,4,3};
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
}
