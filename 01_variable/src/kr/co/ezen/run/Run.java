package kr.co.ezen.run;

import kr.co.ezen.variable.A_Variable;
import kr.co.ezen.variable.B_Constant;
import kr.co.ezen.variable.C_keyboardInput;
import kr.co.ezen.variable.D_Cast;
import kr.co.ezen.variable.E_Printf;

public class Run {

	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		a.declareVariable();
		a.declareVariable2();
		a.charVariable();
		
		B_Constant bc = new B_Constant();
		bc.finalConstant();
		
		C_keyboardInput ck = new C_keyboardInput();
		//ck.inputScanner1();
		//ck.inputScanner2(); // 여러대의 스캐너를 작동하는 것은 좋지않다. 어차피 스캐너 하나로 다 할 수 있음. close이후에는 스캐너 불러올수없음.
		//ck.inputScanner3(); //
		D_Cast bd = new D_Cast();
		bd.rule1();
		bd.rule2();
		
		E_Printf fpf=new E_Printf();
		fpf.printMethod();
		
	}
		
		
		
}
