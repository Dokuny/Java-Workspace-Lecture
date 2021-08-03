package kr.co.ezen.variable;

public class D_Cast {
	
	public void rule1() {
		boolean flag=true;
		
		int num = 'A';
		System.out.println("num:" + num);
		int num2 = -97;
		System.out.println("num2:" + num2);
		
		char ch3 = (char)num2;
		System.out.println("ch3:" + ch3);
	}
	
	public void rule2() {
		int inum=10;
		long lnum=100;
		
		int isum = (int)(inum+lnum); // casting
		System.out.println("isum:"+isum);
	}
	
	public void rule3() {
		long lnum = 100;
		float fnum = lnum;
		System.out.println("fnum:" + fnum);
		
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum:" +inum);
	}
}
