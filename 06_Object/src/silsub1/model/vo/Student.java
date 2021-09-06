package silsub1.model.vo;

public class Student {
	int grade,classroom;
	String name;
	double height;
	char gender;
	
	public Student(){}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "학년:"+grade+" 반:"+classroom+" 이름:"+ name+" 키:"+height+" 성별:"+gender;
	}
	
	{	
		this.setClassroom(3);
		this.setGender('남');
		this.setGrade(6);
		this.setHeight(170);
		this.setName("홍찰찰");
	}
	
}
