package chap11.DataStructur_01;

import java.util.*;

class CartItem{
	String code;
	int num;
	int price;
	
	CartItem(String code,int num,int price){
		this.code = code;
		this.num = num;
		this.price = price;
	}
}


public class ShoppingProgram {

	public static void main(String[] args) {
		LinkedList<CartItem> list = new LinkedList<CartItem>();
		
		list.add(new CartItem("50001",2,2000));
		list.add(new CartItem("75023",3,5000));
		list.add(new CartItem("12323",4,4000));
		
		list.remove(1);
		
		System.out.println("상품 코드 수량 가격");
		System.out.println("--------------");
		for(CartItem a : list) {
			System.out.println("상품 코드:" + a.code);
			System.out.println("상품 수량:" + a.num);
			System.out.println("상품 가격:" + a.price);
			System.out.println();
		}
	}

}
