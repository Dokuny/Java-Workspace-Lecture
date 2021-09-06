package chap05.Object_Class_08;

class Accumulator2{
	int total=0;
	static int grandTotal=0;
	
	void accumulate(int amount) {
		total+=amount;
		grandTotal+=amount;
	}
	
	public static int getGrandTotal() {
		
		return grandTotal;
	}
}

public class StaticmethodExample_12 {

	public static void main(String[] args) {
		
		int grandTotal=Accumulator2.getGrandTotal();
		System.out.println("총계="+grandTotal);
	}

}
