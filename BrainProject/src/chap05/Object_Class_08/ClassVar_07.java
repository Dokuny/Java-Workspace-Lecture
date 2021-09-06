package chap05.Object_Class_08;

class InstCnt{
	static int instNum=0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스(객체) 생성:"+instNum);
	}
}

public class ClassVar_07 {

	public static void main(String[] args) {
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();

	}

}
