package chapter5;

import java.util.*;

public class Test {
	

	public void selfNumber() {
		int[] arr = new int[10000];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		//만개 배열에 10000까지 넣은 상태
		// 셀프넘버가 아닌 숫자배열 만들기.
		
		
		int[] num = new int[10000];
		int a=1;
	
		
		for(int i =0; i<num.length;i++) {
			num[i] = a+ a/10 + a%10;
			a++;
		}
		
		for(int i = 0; i<arr.length;i++) {
			boolean isSelfNum = true;
			for(int j =0; j<num.length;j++) {
				if(arr[i] == num[j]) {
					isSelfNum =false;
				}
			}
			if(isSelfNum) {
				System.out.println(arr[i]);
			}
		}
	}
}







