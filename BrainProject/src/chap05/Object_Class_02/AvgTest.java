package chap05.Object_Class_02;

public class AvgTest {

	public static void main(String[] args) {
		Avg student1 = new Avg();
		Avg student2 = new Avg("김영희");
		
		student1.name = "김철수";
		
		String st1_avg = student1.average(70,80);
		String st2_avg = student2.average(80,90);

		
		System.out.println(st1_avg);
		System.out.println(st2_avg);
	}
}
