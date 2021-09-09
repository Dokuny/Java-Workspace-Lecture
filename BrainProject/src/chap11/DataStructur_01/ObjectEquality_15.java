package chap11.DataStructur_01;

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num=num;
	}
}

public class ObjectEquality_15 {

	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(12);
		IntNumber num3 = new IntNumber(10);
	
		
		if(num1.equals(num3)) {
			System.out.println("동일합니다");
		}else {
			System.out.println("동일하지 않습니다");
		}
	}

}
