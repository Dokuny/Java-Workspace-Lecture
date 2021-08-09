package kr.co.ezen.chap01.run;

import kr.co.ezen.chap01.condition.A_if;
import kr.co.ezen.chap01.condition.B_IfElse;
import kr.co.ezen.chap01.condition.C_IfElseIf;
import kr.co.ezen.chap01.condition.D_Switch;

public class Run {

	public static void main(String[] args) {
		A_if aif=new A_if();
		
		//aif.method1();
		//aif.method2();
		//aif.method3();
		//aif.method4();
		//aif.method5();
		//aif.method6();
		//aif.method7();
		//aif.method8();
		
		B_IfElse bif=new B_IfElse(); // 객체생성
		//bif.method2();
		//bif.method3();
		//bif.method4();
		//bif.method5();
		//bif.method6();
		//bif.method7();
		//bif.method8();
		
		C_IfElseIf cif = new C_IfElseIf();
		//cif.method1();
		//cif.method5();
		
		D_Switch sw = new D_Switch();
		sw.method2();
	}

}
