package multiThreading;

class R1 implements Runnable{
	public void run() {
		System.out.println("R1");
	}
}
public class Example2 {
	public static void main(String[] args) {
		Thread th = new Thread(new R1());
		th.start();
		Thread th1 = new Thread(()->System.out.println("thread with runnable lambda"));
		th1.start();
	}
}
