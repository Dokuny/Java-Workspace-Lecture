package kr.co.ezen.operator;

public class B_inDecrease {

	public void method1() {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println("증감 연산자 사용전: "+num1);
		System.out.println("++num1을 사용한 결과 : "+ ++num1);  //++ : 1증가 ++값(전위),값++(후위) 
		System.out.println("num2++을 사용한 결과 : "+ num2++);  
		
	}
		public void method2() {
			int age= 20;
			
			System.out.println("현재 나이는?" + age);
			System.out.println("++age는"+(++age));
			System.out.println("agge++는?"+(age++));
			System.out.println("--age는?"+(--age));
			System.out.println("age--는?"+(age--));
			
		}
	
		public void method3() {
			int a = 10;
			int b = 20;
			int c = 30;
			
			System.out.println(a++); //10
			System.out.println((++a)+(b++)); //12+20 =21
			System.out.println((a++)+(--b)+(--c)); //12 +20 +29 =61
			
			System.out.println(a); //13
			System.out.println(b); //20
			System.out.println(c); //29
		}
	}

