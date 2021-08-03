package kr.co.ezen.variable;

public class A_Variable {
	
	public void declareVariable() {
		//타입(자료형) 변수이름
		
		// 1.논리형
		boolean isTrue; // true or false 로만 가능
		
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum; // 1byte 
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte, 숫자 뒤에 l or ㅣ 붙이기
		
		// 2-2. 실수형
		float fNum; // 4byte, 숫자 뒤에 f or F 붙이기
		double dNum; // 8byte
		
		// 3. 문자형
		char ch; // 2byte , 0~65536 까지만 가능
		
		// 4. 문자형(참조형) -> 문자열
		String str; //16byte
		
		isTrue = true;
		sNum = 2;
		iNum = 4;
		lNum = 8l;
		fNum = 4.0f;
		dNum = 8.0;
		ch = 'A';
		str = "A";
		
		System.out.println("isTrue:"+isTrue);
		System.out.println("sNum의 값:"+sNum);
		System.out.println("iNum의 값:"+iNum);
		System.out.println("lNum의 값:"+lNum);
		System.out.println("fNum의 값:"+fNum);	
		System.out.println("dNum의 값:"+dNum);
		System.out.println("ch의 값:"+ch);
		System.out.println("str의 값:"+str);
	}

	public void declareVariable2() {
		boolean isTrue = true; // true or false 로만 가능
		
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum=1; // 1byte 
		short sNum=2; // 2byte
		int iNum=4; // 4byte
		long lNum=8L; // 8byte, 숫자 뒤에 l or ㅣ 붙이기
		
		// 2-2. 실수형
		float fNum=4.0F; // 4byte, 숫자 뒤에 f or F 붙이기
		double dNum=8.0; // 8byte
		
		// 3. 문자형
		char ch='가'; // 2byte , 0~65536 까지만 가능
		
		// 4. 문자형(참조형) -> 문자열
		String str="자바 취업반"; //16byte
		
		System.out.println("isTrue:"+isTrue);
		System.out.println("sNum의 값:"+sNum);
		System.out.println("iNum의 값:"+iNum);
		System.out.println("lNum의 값:"+lNum);
		System.out.println("fNum의 값:"+fNum);	
		System.out.println("dNum의 값:"+dNum);
		System.out.println("ch의 값:"+ch);
		System.out.println("str의 값:"+str);
	}
	
	public void charVariable() {
		char ch = 87;
		System.out.println("1.코드값으로 리턴:"+ch);
		ch = '이';
		System.out.println("2. 한글로 리턴:"+ch);
		ch = '\uae08';
		System.out.println("3. 유니코드로 리턴:"+ch);
	
		char ch1,ch2,ch3,ch4;
		ch1='\ub300';
		ch2='\ud55c';
		ch3='\ubbfc';
		ch4='\uad6d';
	
		System.out.println(ch1 + ch2 + ch3 + ch4);
		System.out.println(""+ch1+ch2+ch3+ch4);
	}
}
