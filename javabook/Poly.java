class One
{
 void cal(double x)
 {
  System.out.println("sqaue ="+(x*x));
 }
}
class Two extends One
{
 void cal(double x)
 {
 super.cal(x);
 System.out.println("square="+(x+x));
 }
}
class Poly
{
 public static void main(String args[])
 {
  Two t=new Two();
      t.cal(10);
 }
}