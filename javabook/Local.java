class Sample
{
 private  int x;
 void modify(int x)
 {
  this.x=x;
  System.out.println(x); 
 }
 void dis()
 {
  System.out.println(x);
  
 }
}
class Local
{
 public static void main(String args[])
 {
  Sample s=new Sample();
         s.modify(10);
         s.dis();
 }
}