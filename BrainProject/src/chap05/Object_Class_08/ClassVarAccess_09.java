package chap05.Object_Class_08;

class AccessWay{
	static int num=0; // static 변수는 객체가 생성되기 이전에 별도의 메모리 공간에 할당
	
	AccessWay(){
		incrCnt();
	}
	
	public void incrCnt() {
		num++;
	}
}

public class ClassVarAccess_09 {

	public static void main(String[] args) {
		/*
		AccessWay way=new AccessWay(); // 1
		System.out.println("num="+way.num++);// 2
		AccessWay way2=new AccessWay();// 3
		System.out.println("num="+way2.num++);// 4
		AccessWay way3=new AccessWay();// 5
		System.out.println("num="+way3.num++);//5
		*/
		
		AccessWay way=new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println("num="+AccessWay.num);
	}

}
