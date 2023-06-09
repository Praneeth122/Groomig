package theards;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx implements Runnable{

    CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;

    public CyclicBarrierEx(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 1");
            try {
				this.barrier1.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 2");
            try {
				this.barrier2.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}

            System.out.println(Thread.currentThread().getName() +
                                " done!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }
    public static void main(String [] args) {
    	Runnable barrier1Action = new Runnable() {
    	    public void run() {
    	        System.out.println("BarrierAction 1 executed ");
    	    }
    	};
    	Runnable barrier2Action = new Runnable() {
    	    public void run() {
    	        System.out.println("BarrierAction 2 executed ");
    	    }
    	};

    	CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
    	CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

    	CyclicBarrierEx barrierRunnable1 =
    	        new CyclicBarrierEx(barrier1, barrier2);

    	CyclicBarrierEx barrierRunnable2 =
    	        new CyclicBarrierEx(barrier1, barrier2);

    	new Thread(barrierRunnable1).start();
    	new Thread(barrierRunnable2).start();
    }
}