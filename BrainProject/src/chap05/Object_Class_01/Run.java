package chap05.Object_Class_01;

public class Run {
	public static void main(String[] arge) {
		FruitSeller fs =new FruitSeller(100,0);
		FruitBuyer fb = new FruitBuyer(0,10000);
		
		fb.buyApple(fs, 0);
		
		fb.showSaleResult();
		
		fs.showSaleResult();
		
		fb.buyApple(fs,10);
		
		fb.showSaleResult();
		
		fs.showSaleResult();
		
	}
}
