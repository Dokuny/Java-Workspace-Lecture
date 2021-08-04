package kr.co.ezen.operator;

public class F_Compound {
	
	public void method() {
		int num = 12;
		
		System.out.println("num:"+num);
		num = num+3;
		System.out.println("num:"+num);
		num += 3;
		System.out.println("num:"+num);	
		num -= 3;
		System.out.println("num:"+num);
		num *= 3;
		System.out.println("num:"+num);
		num /= 3;
		System.out.println("num:"+num);
		num %= 3;
		System.out.println("num:"+num);
	}
}
