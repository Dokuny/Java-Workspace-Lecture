package silsub1.model.vo;

public class Book {
	String title,publisher,author;
	int price;
	double discountRate;
	
	public Book(){
		this("자바","이젠","금기종",10000,0.2);
	}
	
	public Book(String title,String publisher,String author){
		
		this(title,publisher,author,5000,5.0);		
	}
	public Book(String title,String publisher,String author,int price,double discountRate){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String information() {
		
		return "[title:" + title + ", publisher: " + publisher + ", author : "+author+", price: "+price+", discountRate: "+ discountRate+"]";
	
	}
}
