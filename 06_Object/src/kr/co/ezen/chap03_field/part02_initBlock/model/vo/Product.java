package kr.co.ezen.chap03_field.part02_initBlock.model.vo;

public class Product {
	private String pName="아이코스";
	private int price = 100000;
	private static String brand = "나이키";
	private int createYear;
	
	{ 
		pName ="키보드";
		price=90000;
		brand = "EZEN";
		createYear = 2021;
	}
	
	static {
		brand = "삼성";
		
	}
	
	
	
}
