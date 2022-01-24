class Mythread implements Runnable
{
 String str;
 Mythread(String a,String b)
 {
  this.str=str;
 }
 public void run()
 {
   String prefix=a.substring(0,1);
   int lb=b.length();
 }
}class Mythread1 extends Mythread implements Runnable
{
 String str;
 Mythread1(String a,String b)
 {
  this.str=str;
 }
 public void run()
 {
   String suffix=str.substring(lb-1);
   int lb=b.length();
   return (prefix+suffix);
 }
}
class Main55
{
 public static void main(String args[])
 {
  String a="remuneration";
  String b="acquiesce";
  Mythread ob1=new Mythread(a,b);
  Mythread ob2=new Mythread(a,b);
  Thread t1=new Thread(ob1);
  Thread t2=new Thread(ob2);
         t1.start();
         t2.start();
  System.out.println(prefixSuffix(a,b));
 }
}