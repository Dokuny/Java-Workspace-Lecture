package chap12.Thread_01;

public class MultithreadExample_03 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		
		Thread thread1 = new Thread(()->{
			for(char ch='A';ch<='Z';ch++) {
				System.out.println(ch);
			try {
				Thread.sleep(1000);;
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			}
		});
		
		Thread thread2 = new Thread() {
			public void run() {
			for(char ch='A';ch<='Z';ch++) {
				System.out.println(ch);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			}
			}
		};
		thread1.start();
		thread.start();
		thread2.start();

		
		
	}

}
