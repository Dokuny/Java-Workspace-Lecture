package silsub1.model.vo;

public class Product {
	String pName,brand;
	int price;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return getBrand()+" 사의 " + getpName() + "의 가격은 " + getPrice() + "원 입니다";
		
	}
}
