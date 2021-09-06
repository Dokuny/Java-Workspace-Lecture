package chap05.Object_Class_03;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj = null;
		obj = new GoodsStock();
		
		obj.goodsCode = "52135";
		obj.stockNum = 200;
		
		System.out.println("상품코드 : " + obj.goodsCode);
		System.out.println("재고 : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("상품코드 : " + obj.goodsCode);
		System.out.println("재고 : "+obj.stockNum);
		
	}
}
