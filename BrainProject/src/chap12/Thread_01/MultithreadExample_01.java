package chap12.Thread_01;

class DigitThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i +": digit");
		}
	}
}



public class MultithreadExample_01 {

	public static void main(String[] args) {
		
		Thread a = new DigitThread();
		Thread b = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println(i+": 람다식");
			}
		} );
		
		a.start();
		b.start();
		for(int i=0;i<10;i++) {
			System.out.println(i+": main");
		}
	}

}
