package chap05.Object_Class_08;

public class PhysicalInfo {
	String name;
	int age;
	float height,weight;
	
	PhysicalInfo(String name,int age,float height,float weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	void update(int age) {
		this.age=age;
	}
	
	void update(int age,float height) {
		this.age=age;
		this.height=height;
	}
	
	void update(int age,float height,float weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	// method overloading(메서드 오버로딩)
}










