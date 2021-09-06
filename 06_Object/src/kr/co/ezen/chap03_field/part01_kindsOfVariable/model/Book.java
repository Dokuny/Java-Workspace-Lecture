package kr.co.ezen.chap03_field.part01_kindsOfVariable.model;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public static final String PUBLISHER = "이젠출판사";
	private static int stock=10;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock) {
		Book.stock = stock;
		
	}

	public static String getPublisher() {
		return PUBLISHER;
	}

	public String information() {
		return "Book[title=" +title+",author="+author+",price="+price+",stock="+stock+"]";
	}
	public Book() {}
}
