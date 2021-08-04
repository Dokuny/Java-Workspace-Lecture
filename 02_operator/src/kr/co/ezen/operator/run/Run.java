package kr.co.ezen.operator.run;

import kr.co.ezen.operator.A_LogicalNagation;
import kr.co.ezen.operator.B_inDecrease;
import kr.co.ezen.operator.C_Arithmetic;
import kr.co.ezen.operator.D_Comparison;
import kr.co.ezen.operator.E_Logical;
import kr.co.ezen.operator.F_Compound;
import kr.co.ezen.operator.G_Triple;

public class Run {

	public static void main(String[] args) {
		
		A_LogicalNagation a = new A_LogicalNagation();
		//a.method1();
		//a.method2();
		
		B_inDecrease a2 = new B_inDecrease();
		//a2.method1();
	
		C_Arithmetic ca = new C_Arithmetic();
		//ca.method1();
		//ca.method2();
	
		D_Comparison dc = new D_Comparison();
		//dc.method();
		
		E_Logical el = new E_Logical();
		//el.method1();
		//el.method2();
		
		F_Compound fc = new F_Compound();
		fc.method();
		
		G_Triple gt = new G_Triple();
		gt.method1();
	}
}
