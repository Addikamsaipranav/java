public class NiceThreads implements Runnable
{
     public void run()
     {
      while(true)
      {       }
     }
     public static void main(String args[])
     {
          NiceThreads nt1 = new NiceThreads();
          NiceThreads nt2 = new NiceThreads();
          NiceThreads nt3 = new NiceThreads();

          nt1.run();
          nt2.run();
          nt3.run();
     }
}