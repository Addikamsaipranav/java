class Mythread implements Runnable 
{
 int s;
 Mythread(int n)
 {
    s=n;
 }
 public void run()
 {
  int sum=s*(s+1)/2;
  System.out.println(sum); 
 }
}
class Mythread1 extends Mythread implements Runnable
{ 
 int num;
 Mythread1(int x)
 {
    num=x;
  }
  public void run()
  {
   
       
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
class Main11
{
 public static void main(String args[])
 {
 int n=5;
  Mythread ob1=new Mythread(n);
  Mythread1 ob2=new Mythread1(n);
  Thread t1=new Thread(ob1);
  Thread t2=new Thread(ob2);
         t1.start();
         t2.start();
 }
}