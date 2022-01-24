class My
{
 public static void main(String args[])
 {
  System.out.println("Lets us find first current thread");
  Thread t=Thread.currentThread();
  System.out.println("Current thread"+t);
  System.out.println("its name:"+t.getName());
 }
}
