package silsub1.model.vo;

public class Employee {
	static int count =1;
	int empNo,salary,age;
	String empName,dept,phone,address;
	char gender;
	
	Employee(){}
	
	public Employee(String empName,String dept,int age,char gender, int salary, String phone, String address) {
		this.salary = salary;
		this.age = age;
		this.empName = empName;
		this.dept = dept;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}

	{
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "["+empName+ ","+ dept+ "," + age+ ","+ gender+ ","+ salary+ ","+ phone+ ","+ address+ "]";
	}
	
	
	
}
