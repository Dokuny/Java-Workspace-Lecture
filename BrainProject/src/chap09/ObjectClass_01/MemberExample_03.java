package chap09.ObjectClass_01;

class Member{
    public String id;


    public Member(String id) {
        this.id=id;
     
    }
    public boolean equals(Object obj) {
    	if(obj instanceof Member) {
    		Member a= (Member)obj;
    		if(a.id== id) {
    			return true;
    		}else {
    			return false;
    		}
    	}
    	return false;
    }
}

public class MemberExample_03 {

    public static void main(String[] args) {
        Member obj1=new Member ("blue");
        Member obj2=new Member ("blue");
        Member obj3=new Member ("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        }else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
       
        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3은 동등합니다.");
        }else {
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }

}

