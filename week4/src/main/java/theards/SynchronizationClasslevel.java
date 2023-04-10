package theards;

public class SynchronizationClasslevel extends Thread{
	static int i = 0;
	
	synchronized public void incint() {
		SynchronizationClasslevel.i = i+1;
	}
	
	synchronized public int getint() {
		return SynchronizationClasslevel.i;
	}
	
	synchronized public void run() {
		System.out.println(Thread.currentThread()+" : "+this.getint());
		this.incint();
	}

	public static void main(String [] args) throws InterruptedException {
		SynchronizationClasslevel t1 = new SynchronizationClasslevel();
		SynchronizationClasslevel t2 = new SynchronizationClasslevel();
		SynchronizationClasslevel t3 = new SynchronizationClasslevel();
		
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
	
	}

}
