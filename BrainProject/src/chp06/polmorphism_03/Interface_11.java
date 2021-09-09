package chp06.polmorphism_03;

class A3{

    void methodA() {
        I1 i=InstanceManager.getInstance();
        i.methodB();
    }
}

interface I1{
    public abstract void methodB();
}

class B1 implements I1{
	
    public void methodB() {
        System.out.println("methodB in B class");
    }
}

class InstanceManager{

    public static I1 getInstance() {
    	return new B1();
    }
}

public class Interface_11 {

    public static void main(String[] args) {
        A3 a=new A3();
        a.methodA();

    }

}

