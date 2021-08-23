package chapter5;

import java.util.*;

public class Test {
	long sum(int[] a) {
		Scanner sc = new Scanner(System.in);
	
		
		if(a.length<1 || a.length>3000000) {
			System.exit(0);
		}
		
		long ans = 0;
		
		while(sc.hasNextInt()) {
		for(int i =0; i<a.length;i++) {
			a[i] = sc.nextInt();
			if(a[i]<0 || a[i]>1000000) {
				System.exit(0);
			}
			ans += a[i];
		}
		System.out.println(ans);
		sc.close();
		}
		return ans;
	}
}







