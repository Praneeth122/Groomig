package theards;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableAndFuture implements Callable {

	@Override
	public Object call() throws Exception {
	    Random generator = new Random();
	    Integer randomNumber = generator.nextInt(5);
	    return randomNumber;
	}
	
	public static void main(String[] args) throws Exception
	  {
	  
	    FutureTask[] randomNumberTasks = new FutureTask[5];
	    
	    ExecutorService pool = Executors.newFixedThreadPool(4);
	    
	    for (int i = 0; i < 5; i++)
	    {
	      Callable callable = new CallableAndFuture();
	  
	      randomNumberTasks[i] = new FutureTask(callable);
	      
	      pool.execute(randomNumberTasks[i]);
	    }
	    
	    pool.shutdown();
	    
	    for (int i = 0; i < 5; i++)
	    {
	    	
	      System.out.println(randomNumberTasks[i].get());
	    }
	  }

}
