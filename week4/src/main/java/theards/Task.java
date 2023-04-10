package theards;

public class Task extends Thread {
	
	static Runnable task = new Runnable() {
	    @Override
	    public void run() {
	    	System.out.println("I am task, running on thread");
	    }
	};
	
	public static void main(String[] agrs){
		Thread t = new Thread(task);
		t.start();
	}
	
}

