package theards;

public class Pattern {

    private volatile Integer count = 1;
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    class Print implements Runnable {

        private int threadId;

        public Print(int threadId) {
            super();
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try {
                while (count <= 10) {
                    synchronized (object) {
                        if (threadId != threadIdToRun) {
                            object.wait();
                        } else {
                            System.out.println("Thread " + threadId + " : " + count);
                            count += 1;

                            if (threadId == 1)
                                threadIdToRun = 2;
                            else if (threadId == 2)
                                threadIdToRun = 3;
                            else if (threadId == 3)
                                threadIdToRun = 1;

                            object.notifyAll();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    
    public static void main(String[] args) {

        Pattern p= new Pattern();
        Thread t1 = new Thread(p.new Print(1));
        Thread t2 = new Thread(p.new Print(2));
        Thread t3 = new Thread(p.new Print(3));

        t1.start();
        t2.start();
        t3.start();
    }
}
