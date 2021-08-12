package kr.co.ezen.chap03.branch;

public class B_Continue {
	
	public void method1() {
		int sum = 0;
		
		for(int k=1; k<101; k++) {
			if(k % 4 == 0) {
				continue;  //continue는 진행안하고 다시 반복문으로 돌아감
			}
			System.out.println(k+"+");
			sum += k;
		}
		System.out.println();
		System.out.println("sum: "+sum);
	}
	
	public void method2() {
		for(int dan=2; dan<10; dan++) {
			System.out.println("========"+dan+"단=======");
			for(int su =1; su<10 ;su++) {
				if(su %2== 0 || dan % 2==0) {
					continue;
				}
				System.out.println(dan +"*" + su+"="+(dan*su));
			}
			System.out.println();
		}
	}
}
