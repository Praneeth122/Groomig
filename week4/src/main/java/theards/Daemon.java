package theards;

public class Daemon extends Thread {
	 public void run()
	 {
		 if(Thread.currentThread().isDaemon()) {
			 System.out.println("This is a Daemon thread "+Thread.currentThread());
		 }
		 else
		 {
			 System.out.println("This is normal thread "+Thread.currentThread());
		 }
	 }
	 
	 public static void main(String [] args) {
		 
		 Daemon t1 = new Daemon();
		 Daemon t2 = new Daemon();
		 
		 t1.start();
		 
		 t2.setDaemon(true);
		 t2.start();
	 }
}
