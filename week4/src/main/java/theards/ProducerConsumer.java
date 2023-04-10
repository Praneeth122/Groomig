package theards;

public class ProducerConsumer
{
      public static void main(String[] args)
      {
            Data d = new Data();
            Producer p1 = new Producer(d, 1);
            Consumer c1 = new Consumer(d, 1);
            p1.start();
            c1.start();
      }
}
class Data
{
      private int data;
      private boolean available = false;
      public synchronized int get()
      {
            while (available == false)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                  }
            }
            available = false;
            notifyAll();
            return data;
      }
      public synchronized void put(int value)
      {
            while (available == true)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
            data = value;
            available = true;
            notifyAll();
      }
}
class Consumer extends Thread
{
      private Data d;
      private int num;
      public Consumer(Data d, int num)
      {
            this.d = d;
            this.num = num;
      }
      public void run()
      {
            int value = 0;
            for (int i = 0; i < 10; i++)
            {
                  value = d.get();
                  System.out.println("Consumer recive: " + value);
            }
      }
}
class Producer extends Thread
{
      private Data d;
      private int num;

      public Producer(Data d, int num)
      {
            this.d = d;
            this.num = num;
      }
      public void run()
      {
            for (int i = 0; i < 5; i++)
            {
                  d.put(i);
                  System.out.println("Produced send: " + i);
                  try
                  {
                        sleep((int)(Math.random() * 100));
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
      }
}