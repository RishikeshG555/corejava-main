package multiThreading;

import java.util.Scanner;


class StopWatch{
	int hrs=0, min=0, sec=0;
	public void startStopWatch() throws InterruptedException {
		while(true) {
			System.out.println(hrs+": "+min+": "+sec);
			Thread.sleep(1000);
			sec++;
			if (sec==60) {
				min++;
				sec=0;
				if (min==60) {
					hrs++;
					min=0;
				}
			}
		}
	}
	public void stop() {
		Scanner sc = new Scanner(System.in);
		//int[] h,m,s;
		char des;
		do {
			des=sc.next().charAt(0);
			if(des=='E') {
				
			}
		}while(des!='S');
		sc.close();
	}
}
public class Example6 {

	public static void main(String[] args) throws InterruptedException {
		StopWatch sw = new StopWatch();
		Thread t1 = new Thread(()-> {
			try {
				sw.startStopWatch();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(()-> {
			sw.stop();
		});
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t2.join();
	}

}