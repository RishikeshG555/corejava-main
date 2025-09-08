package multiThreading;


public class Example3 {
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Bye");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
	}
}
