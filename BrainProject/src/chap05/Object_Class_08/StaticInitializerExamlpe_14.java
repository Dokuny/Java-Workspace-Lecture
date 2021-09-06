package chap05.Object_Class_08;

class HundredNumbers{
	static int arr[];
	
	static {
		System.out.println("야야야야 나는 스태틱 블록");
		arr = new int[100];
		for(int cnt=0; cnt<100;cnt++) {
			arr[cnt] = cnt;
		}
	}
	
	HundredNumbers(){
		arr[3]= 50;
	}
	HundredNumbers(int i){
		arr[3] =i;
	}
	 {System.out.println("슉슈슉 나는 인스턴스블록");
		arr[3] = 100;
	}
	
}

//실행순서 static{} -> instance{} -> Operator(생성자)


public class StaticInitializerExamlpe_14 {

	public static void main(String[] args) {
		HundredNumbers.arr[3] =0;
	}

}
