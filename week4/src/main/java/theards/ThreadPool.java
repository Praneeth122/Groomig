package theards;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String [] args) {
		
		class Task implements Runnable{
			@Override
			public void run() {
				System.out.println("This is task running in thread pool"+Thread.currentThread());
			}
			
		}
		
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		Runnable t1 = new Task();
		Runnable t2 = new Task();
		
		System.out.println("This is "+Thread.currentThread());
		pool.execute(t1);
		System.out.println("This is "+Thread.currentThread());
		pool.execute(t1);
		System.out.println("This is "+Thread.currentThread());
		
		pool.shutdown();
	}
}
