package multiThreading;

class T1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("bye");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Example1 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		T2 t2 = new T2();
		t2.start();
	}
}