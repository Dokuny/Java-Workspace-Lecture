package chap06.Inheritance_02;

abstract class EmptyCan{
	abstract void printContent();
	abstract void printName();
}

abstract class InCompleteCan extends EmptyCan{

	@Override
	void printContent() {
		System.out.println("asdasda");
	}

	
}


public class CompleteCan_03 {

	public static void main(String[] args) {
		InCompleteCan ic =new InCompleteCan();
		ic.printName();
		ic.printContent();

	}

}
