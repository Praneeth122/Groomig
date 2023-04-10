package theards;

public class Join extends Thread{
	 public void run()
	    {
	        System.out.println("Inside run method in thread "+Thread.currentThread());
	    }
	 
	  	public static void main(String[] args)
	    {
	  		System.out.println("main thread starts");
	  		
	  		Join t1 = new Join();
	  		Join t2 = new Join();
	  		t1.start();
	  		t2.start();
	  		try {
	  			System.out.println(Thread.currentThread());
				t1.join();
		  		System.out.println(Thread.currentThread());
		  		t2.join();
		  		System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



	    }

}
