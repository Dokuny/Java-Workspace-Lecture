package chap05.Object_Class_02;

public class Avg {
	String name= "";
	int avg;
	
	Avg(){}
	
	Avg(String name){
		this.name = name;
	}
	
	public String average(int min, int max) {
		avg = (min+max)/2;	
		return name+" "+ avg;
	}
}
