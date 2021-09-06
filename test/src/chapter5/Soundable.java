package chapter5;

public interface Soundable {
	String sound();
}

class Dog implements Soundable {
	@Override
	public String sound(){
		return "멍멍";
	}
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}
