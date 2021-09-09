package chap09.ObjectClass_01;


class GoodsStock{
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	public String toString() {
		String str = stockNum+goodsCode;
		
		return goodsCode;
	}
}


public class ObjectExample_01 {

	public static void main(String[] args) {
	GoodsStock obj = new GoodsStock("57293",100);
	System.out.println(" "+3+1+" ");
	System.out.println(obj);

	String str = obj.toString();
	System.out.println(str);

	}

}
