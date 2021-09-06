package chapter5;

public interface DataAccessObject {
	String name="";
	
	 void select();
	void insert();
	 void update();
	void delete();
	
}

class OracleDao implements DataAccessObject {
	String name = "Oracle";	
	public void select() {
		System.out.println(name + " DB에서 검색");
	}
	public void insert() {
		System.out.println(name + " DB에 삽입");
	}
	public void update() {
		System.out.println(name + " DB를 수정");
	}
	public void delete() {
		System.out.println(name + " DB를 삭제");
	}
}

class MySqlDao implements DataAccessObject {
	String name = "MySql";
	public void select() {
		System.out.println(name + " DB에서 검색");
	}
	public void insert() {
		System.out.println(name + " DB에 삽입");
	}
	public void update() {
		System.out.println(name + " DB를 수정");
	}
	public void delete() {
		System.out.println(name + " DB를 삭제");
	}
}