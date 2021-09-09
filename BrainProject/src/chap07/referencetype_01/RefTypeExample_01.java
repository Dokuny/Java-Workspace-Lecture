package chap07.referencetype_01;

class Point{
	int x,y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class RefTypeExample_01 {

	public static void main(String[] args) {
		Point obj=null;
		
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		}catch (NullPointerException e) {
			System.out.println("obj변수가 가리키는 객체가 없습니다");
		}
	
		
	}

}
