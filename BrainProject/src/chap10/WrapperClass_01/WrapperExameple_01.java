package chap10.WrapperClass_01;

public class WrapperExameple_01 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(7);
		Integer obj3=obj1+obj2;
		int a = obj3;
		
		System.out.println(obj1);
		System.out.println(obj3);
		System.out.println(a);
	}

}
