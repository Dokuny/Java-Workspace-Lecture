package silsub1.model.vo;

public class Circle {
	public static final double PI =3.14;
	int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
		
	public void incrementRadius() {
		radius++;
	}
	
	public void printCircle() {
		System.out.println("원의 넓이: "+getRadius()*getRadius()*Circle.PI);
		System.out.println("원의 둘레: "+ 2*getRadius()*Circle.PI);
	}
	
}
