package chp06.polmorphism_03;

import java.util.*;

abstract class Product{
    int price;
    int bounsPoint;

    Product(int price){
        this.price=price;
        bounsPoint=(int)(price/10.0);
    }

}
class Tv extends Product{
    Tv(){
        super(100);
    }
    @Override
    public String toString() {
        //반환타입의 String의 toString이라는 메서드
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    @Override
    public String toString() {
    	return "Computer";
    }
    
}

class Buyer{
    int money=1000;
    int bounsPoint=0;
    
    Product[] buyList = new Product[10];
    
    int count =0;

    public void buy(Product p) {
        if(money<p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money-=p.price;
        bounsPoint+=p.bounsPoint;
        buyList[count++]= p;
        System.out.println(p.toString()+"을(를) 구입하셨습니다.");

        }
    
    public void summary() {
    	int sum=0;
    	String itemList=" ";
    	
    	
    	for(int i=0;i<count;i++) {	
    		sum += buyList[i].price;
    		itemList += buyList[i]+" ";
    		
    	}
    	System.out.println("구입품목 :"+itemList);
    	System.out.println("가격 총합:"+sum);
    }
}
public class PolyArgumentTest_04 {

    public static void main(String[] args) {
       
    	Buyer b=new Buyer();
        Tv tv=new Tv();
        Computer com=new Computer();

        b.buy(tv);
        b.buy(com);
        b.buy(new Tv());
        b.summary();
     
        System.out.println("현재 남은 잔액은"+b.money+"만 원입니다.");
        System.out.println("현재 보너스 점수는"+b.bounsPoint+"점 입니다.");

    }

}


