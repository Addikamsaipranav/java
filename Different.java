abstract class Myclass
{
 abstract void cal(double x);
 }
class sub1 extends Myclass
{
 void cal(double x)
 {
   System.out.println("sqaure ="+(x*x));
 }
}
class sub2 extends Myclass
{
 void cal(double x)
 {
   System.out.println("square root ="+Math.sqrt(x));
 }
}
class sub3 extends Myclass
{
 void cal(double x)
 {
   System.out.println("cube ="+(x*x*x));
 }
}
class Different
{
 public static void main(String args[])
 {
  sub1 o1=new sub1();
  sub2 o2=new sub2();
  sub3 o3=new sub3();
  o1.cal(3);
  o2.cal(4);
  o3.cal(5);
 }
}