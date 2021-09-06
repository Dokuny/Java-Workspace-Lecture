package chap05.Object_Class_08;

class NumberPrinter{
	
	public static void showInt(int n) {
		System.out.println(n);
	}
	
	public static void showDouble(double n) {
		System.out.println(n);
	}
}




public class ClassMethod_13 {
	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
		
		np.showDouble(1.0);
		NumberPrinter.showInt(1);
	}
}
