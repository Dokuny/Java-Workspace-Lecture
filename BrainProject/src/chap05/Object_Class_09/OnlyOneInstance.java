package chap05.Object_Class_09;

class SimpleNumber{
	int num=0;
	private static SimpleNumber singleton = new SimpleNumber();
	
	private SimpleNumber() {}
	
	public void addNum(int n) {
		num+=n;
	}
	
	public void showNum() {
		System.out.println(num);
	}

	static SimpleNumber getNumInst() {
		
		return singleton ; // 여기다가 그냥 new SimpleNumber();해도된다.
	}
}

public class OnlyOneInstance {
	
	public static void main(String[] args) {
		SimpleNumber num1 = SimpleNumber.getNumInst();
		
		num1.addNum(10);
		num1.showNum();
	} 
}
