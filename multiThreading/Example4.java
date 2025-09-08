package multiThreading;

class Counter{
	int count=0;
	public synchronized void inc() {
		this.count++;
	}
}
public class Example4 {
	public static void main(String[] args) throws InterruptedException {
		Counter co = new Counter();
		Thread th1 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				co.inc();
			}
		});
		Thread th2 = new Thread(()->{
			for (int i = 0; i < 10000; i++) {
				co.inc();
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(co.count);
	}
}
