package chap05.Object_Class_08;

public class Accumulator {
	int total=0;
	
	static int grandTotal = 0;
	
	public void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
}
