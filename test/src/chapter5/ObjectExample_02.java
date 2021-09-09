package chapter5;

class Circle{      // 일반 클래스 타입
    int radius;

    Circle(int radius){
        this.radius=radius;
    }
    ///오브젝트의 equals를 오버라이딩?
    public boolean equals(Circle obj) {    //얜 트루 펄스만 아는 바보임
        if(!(obj instanceof Circle))       // instanceof는 다음 타입으로 형변환이 가능한지 true false로 확인하는 메서드(언산자)
            return false;                  // 써클로 받을수 잇니? 있냐 없냐 오브젝트의 후손이니?
        Circle circle=(Circle)obj;
        if(radius == circle.radius) {  // 이퀄스 메서드가 아니고 리턴값으로 같으면 트루 아니며 폴스함
            return true;
        }else {
            return false;
        }
    }


}



public class ObjectExample_02 {

    public static void main(String[] args) {
        Circle obj1=new Circle(5);
        Circle obj2=new Circle(5);

        if(obj1.equals(obj2)) {     // public boolean eqauls(Circle(5));
            System.out.println("같음");
        }else {
            System.out.println("다름");
        }

    }

}