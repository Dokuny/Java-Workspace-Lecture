package chap05.Object_Class_03;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) {
		if(stockNum<amount)
			return 0;
		stockNum-= amount;
		return amount;
	}
}
