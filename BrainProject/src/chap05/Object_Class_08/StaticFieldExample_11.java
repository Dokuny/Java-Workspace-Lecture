package chap05.Object_Class_08;

class LimitedValue{
	final static int UPPER_LIMIT=100000; // 상수 필드
	int value;
	
	public void setValue(int value) {
		if(value < UPPER_LIMIT)
			this.value=value;
		else
			this.value=UPPER_LIMIT;
	}
}

public class StaticFieldExample_11 {

	public static void main(String[] args) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value="+v.value);
		System.out.println("상한값="+LimitedValue.UPPER_LIMIT);
	}

}
