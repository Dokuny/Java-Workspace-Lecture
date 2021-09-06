package chap05.Object_Class_08;

public class MethodExample_16 {

	public static void printCharacter(char ch,int num) {
		for(int i=0;i<num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
			
		printCharacter('*',30);
		System.out.println("Hello, Java");
		printCharacter('-',30);
	}

}
