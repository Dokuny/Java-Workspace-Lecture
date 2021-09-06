package chap05.Object_Class_08;

public class MethodExample_02 {

	public static void main(String[] args) {
		int arr[]=new int[0];
		Numbers obj=new Numbers(arr);
		
		//int average=obj.getAverage();
		//System.out.println("평균="+average);
		
		int total=obj.getTotal();
		System.out.println("합계="+total);
	}

}
