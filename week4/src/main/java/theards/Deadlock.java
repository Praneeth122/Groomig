package theards;

public class Deadlock {
	  public static void main(String[] args) 
	  {
		  System.out.println("main thread starts");
		  
		  try {
			Thread.currentThread().join();
		  } catch (InterruptedException e) {
			  e.printStackTrace();
		  }
		  
		  System.out.println("main thread ends");
	  }
}
