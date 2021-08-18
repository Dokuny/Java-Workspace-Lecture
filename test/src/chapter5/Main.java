package chapter5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		
		for(int i =0;i<a.length;i++) {
			a[i] = sc.nextInt();
			b[i]= a[i]%42;
		}
		
	ArrayList list = new ArrayList();
	
	for(int i=0; i < b.length; i++) {
		if(!list.contains(b[i])) {
			list.add(b[i]);	
		}
	}
		System.out.println(list.size());
	}
}
