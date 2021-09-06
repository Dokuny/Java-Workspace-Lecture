package chap05.Object_Class_01;

public abstract class FruitSalesMain {
	public int numOfApple=0;
	public int myMoney =0;
	final int APPLE_PRICE = 1000;
	public abstract void showSaleResult();
}


class FruitSeller extends FruitSalesMain {
	
	FruitSeller(int numOfApple,int myMoney){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
	}
	public void saleApple(int appleNum) {
		numOfApple = numOfApple-appleNum;
		myMoney += APPLE_PRICE*appleNum;
	}
	
	public void saleApple(FruitBuyer buyer,int appleNum) {
		numOfApple = numOfApple-appleNum;
		myMoney += APPLE_PRICE*appleNum;
		buyer.buyApple(appleNum);
	}
	@Override
	public void showSaleResult() {
		System.out.println("판매자 정보>");
		System.out.println("남은 사과"+ numOfApple);
		System.out.println("판매 수익"+ myMoney); 
	}
}

class FruitBuyer extends FruitSalesMain{
	
	FruitBuyer(int numOfApple,int myMoney){
		this.numOfApple =numOfApple;
		this.myMoney =myMoney;
	}
	
	public void buyApple(FruitSeller seller,int appleNum) {
		seller.saleApple(appleNum);
		numOfApple += appleNum;
		myMoney -= appleNum*APPLE_PRICE; 
	}
	
	public void buyApple(int appleNum) {
		numOfApple += appleNum;
		myMoney -= appleNum*APPLE_PRICE; 
	}

	
	@Override
	public void showSaleResult() {
		System.out.println("구매자 정보>");
		System.out.println("사과 개수"+ numOfApple);
		System.out.println("현재 잔액"+ myMoney); 
	
	}
}