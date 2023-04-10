package theards;

public class Interrupt extends Thread {
	 public void run()
	    {
	        try {
	            for (int i = 0; i < 5; i++) {
	                System.out.println("Thread running "+i);
	                Thread.sleep(1000);
	            }
	        }
	        catch (InterruptedException e) {
	            System.out.println("interuppted");
	        }
	    }
	  
	    public static void main(String[] args)
	            throws InterruptedException
	    {
	        Interrupt thread = new Interrupt();
	        thread.start();
	        thread.interrupt();
	  
	        System.out.println("Main thread done");
	    }

}
