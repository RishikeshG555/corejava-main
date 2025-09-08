package multiThreading;

public class Example5 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.setDaemon(true);
		t1.start();
		Thread.sleep(5000);
		System.out.println("Main thread.");
	}
}
